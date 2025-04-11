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
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.tglt.code.editor.app.ClientActivity;
import com.tglt.code.editor.app.ClientFilesActivity;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.R;
import com.tglt.code.editor.client.ClientInfo;
import com.tglt.code.editor.utils.UtilsDialog;
import com.tglt.code.editor.utils.UtilsFiles;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.AppViewHolder> implements Filterable {
    // AppAdapter variables
    private List<ClientInfo> appList;
    private List<ClientInfo> appListSearch;
    private Context context;

    private Set<String> appsFavorite;

    public ClientAdapter(List<ClientInfo> appList, Context context) {
        this.appList = appList;
        this.context = context;
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
        ClientInfo appInfo = appList.get(i);
        appViewHolder.vName.setText(appInfo.getName());
        appViewHolder.vHost.setText(appInfo.getHost());
//        appViewHolder.vIcon.setImageDrawable(appInfo.getIcon());

        setButtonEvents(appViewHolder, appInfo, i);

    }

    private void setButtonEvents(AppViewHolder appViewHolder, final ClientInfo appInfo, final int i) {
        final ImageView appIcon = appViewHolder.vIcon;
        final CardView cardView = appViewHolder.vCard;
        final ImageView editButton = appViewHolder.editButton;
        final ImageView removeButton = appViewHolder.removeButton;
        if( appInfo.getType() == 1 ) {
            if( appInfo.isConnect() )
                appIcon.setImageResource(R.drawable.ftp);
            else
                appIcon.setImageResource(R.drawable.ftp_disconnect);
        } else if( appInfo.getType() == 2 ) {
            if( appInfo.isConnect() )
                appIcon.setImageResource(R.drawable.sftp);
            else
                appIcon.setImageResource(R.drawable.sftp_disconnect);
        }

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UtilsDialog.openPopupAddClient(context, appInfo);
                notifyDataSetChanged();
            }
        });
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClientActivity.getActivity().rmClient(appInfo);
                notifyDataSetChanged();
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = (Activity) context;

                Intent intent = new Intent(context, ClientFilesActivity.class);
                intent.putExtra("name", appInfo.getName());
                intent.putExtra("host", appInfo.getHost());
                intent.putExtra("username", appInfo.getUsername());
                intent.putExtra("password", appInfo.getPassword());
                intent.putExtra("type", appInfo.getType() );
                intent.putExtra("port", appInfo.getPort() );
                intent.putExtra("remoteDirectory", appInfo.getRemoteDirectory() );
//                Log.e("FTPclient re Client", appInfo.getPort()+" Error: 001 "+appInfo.getType() );
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    String transitionName = "File Icon Transition";

                    ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(activity, appIcon, transitionName);
//                    context.startActivity(intent, transitionActivityOptions.toBundle());
                    activity.startActivityForResult(intent, UtilsFiles.OPEN_REQUEST_CLIENT, transitionActivityOptions.toBundle());
                } else {
//                    context.startActivity(intent);
                    activity.startActivityForResult(intent, UtilsFiles.OPEN_REQUEST_CLIENT);
                    activity.overridePendingTransition(R.anim.slide_in_right, R.anim.fade_back);
                }
                notifyDataSetChanged();
            }
        });
    }

    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                final FilterResults oReturn = new FilterResults();
                final List<ClientInfo> results = new ArrayList<>();
                if (appListSearch == null) {
                    appListSearch = appList;
                }
                if (charSequence != null) {
                    if (appListSearch != null && appListSearch.size() > 0) {
                        for (final ClientInfo appInfo : appListSearch) {
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
                appList = (ArrayList<ClientInfo>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View appAdapterView = LayoutInflater.from(context).inflate( R.layout.client_layout, null );
        return new AppViewHolder(appAdapterView);
    }

    public static class AppViewHolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vHost;
        protected ImageView vIcon;
        protected CardView vCard;
        protected ImageView editButton;
        protected ImageView removeButton;

        public AppViewHolder(@NonNull View v) {
            super(v);
            vName = (TextView) v.findViewById(R.id.txtName);
            vHost = (TextView) v.findViewById(R.id.txtHost);
            vIcon = (ImageView) v.findViewById(R.id.imgIcon);
            vCard = (CardView) v.findViewById(R.id.app_card);

            editButton = (ImageView)v.findViewById(R.id.edit_button);
            removeButton = (ImageView)v.findViewById(R.id.remove_button);

        }
    }

}
