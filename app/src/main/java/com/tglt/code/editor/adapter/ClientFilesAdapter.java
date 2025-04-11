/*
 *   Copyright 2020-2021 Rosemoe
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.tglt.code.editor.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.tglt.code.editor.app.ClientActivity;
import com.tglt.code.editor.app.ClientFilesActivity;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.R;
import com.tglt.code.editor.client.ClientInfo;
import com.tglt.code.editor.files.FileInfo;
import com.tglt.code.editor.utils.UtilsFiles;

public class ClientFilesAdapter extends RecyclerView.Adapter<ClientFilesAdapter.AppViewHolder> implements Filterable {
    // AppAdapter variables
    private List<FileInfo> appList;
    private List<FileInfo> appListSearch;
    private Context context;
    private int client_id;

    private Set<String> appsFavorite;

    public ClientFilesAdapter(List<FileInfo> appList, Context context, int client_id) {
        this.appList = appList;
        this.context = context;
        this.client_id = client_id;
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    public void clear() {
        appList.clear();
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(AppViewHolder appViewHolder, int i) {
        FileInfo appInfo = appList.get(i);
        appViewHolder.vName.setText(appInfo.getName());

        setButtonEvents(appViewHolder, appInfo, i);
    }

    private void setButtonEvents(AppViewHolder appViewHolder, final FileInfo appInfo, final int i) {
        final ImageView appIcon = appViewHolder.vIcon;
        final CardView cardView = appViewHolder.vCard;

        appIcon.setImageResource(
                appInfo.isFile() ? R.drawable.empty_note :
                        (appInfo.isDirectory() ? R.drawable.ic_outline_folder_24 : R.drawable.ic_outline_folder_open_24)
        );

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = (Activity) context;

                if( appInfo.getType() == 0 ) {
                    Intent intent = new Intent( context, MainActivity.class );
                    intent.putExtra("name", appInfo.getName());
                    intent.putExtra("remoteFile", appInfo.getLink() );
                    intent.putExtra("client_id", client_id);
//Log.e("ClientFileAdapter", "client_id: "+client_id);
//                MainActivity.getActivity().startActivityForResult( intent, UtilsFiles.OPEN_REQUEST_CLIENT );
                    activity.setResult( Activity.RESULT_OK, intent );
                    activity.finish();
                } else {
//                    Log.e("FTPclient re File", " Error: 000 "+appInfo.getLink() + "/" +appInfo.getName() );
                    ClientFilesActivity.getActivity().changeRemoteDirectory( appInfo.getLink() );
//                    context.changeRemoteDirectory( appInfo.getLink() );
                }

            }
        });
    }

    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                final FilterResults oReturn = new FilterResults();
                final List<FileInfo> results = new ArrayList<>();
                if (appListSearch == null) {
                    appListSearch = appList;
                }
                if (charSequence != null) {
                    if (appListSearch != null && appListSearch.size() > 0) {
                        for (final FileInfo appInfo : appListSearch) {
                            if (appInfo.getName().toLowerCase().contains(charSequence.toString())) {
                                results.add(appInfo);
                            }
                        }
                    }
                    oReturn.values = results;
                    oReturn.count = results.size();
                }
                return oReturn;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//                if (filterResults.count > 0) {
//                    MainActivity.setResultsMessage(false);
//                } else {
//                    MainActivity.setResultsMessage(true);
//                }
                appList = (ArrayList<FileInfo>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View appAdapterView = LayoutInflater.from(context).inflate( R.layout.client_file_layout, null );
        return new AppViewHolder(appAdapterView);
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected ImageView vIcon;
        protected CardView vCard;

        public AppViewHolder(@NonNull View v) {
            super(v);
            vName = (TextView) v.findViewById(R.id.txtName);
            vIcon = (ImageView) v.findViewById(R.id.imgIcon);
            vCard = (CardView) v.findViewById(R.id.app_card);


        }
    }

}
