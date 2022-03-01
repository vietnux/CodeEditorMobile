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
package com.tglt.code.editor.app;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.tglt.code.editor.R;
import com.tglt.code.editor.adapter.ClientAdapter;
import com.tglt.code.editor.ads.AdmobLib;
import com.tglt.code.editor.client.ClientInfo;
import com.tglt.code.editor.utils.AppPreferences;
import com.tglt.code.editor.utils.UtilsDialog;
import com.tglt.code.editor.utils.UtilsFiles;

public class ClientActivity extends AppCompatActivity  {
    private static ClientActivity activity;
    private static Context context;
    private RecyclerView recyclerView;
    private CardView addcard;
    private AppPreferences appPreferences;
    private Set<String> clients;
//    List<ClientInfo> UtilsFiles.clientsList;
    ClientAdapter appAdapter;

    public static Context getContext() {
        return context;
    }
    public static ClientActivity getActivity() {
        return activity;
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = this;
        this.context = this;

        setContentView(R.layout.activity_client);
        recyclerView = (RecyclerView) findViewById(R.id.appList);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        appPreferences = new AppPreferences(this);
//        appPreferences.clears();
        clients = appPreferences.getClients();
        intClient(null);

        appAdapter = new ClientAdapter(UtilsFiles.clientsList, this);
        recyclerView.setAdapter(appAdapter);
        appAdapter.notifyDataSetChanged();

        addcard = (CardView) findViewById(R.id.add_card);
        addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UtilsDialog.openPopupAddClient( context, null );
            }
        });
        setInitialConfiguration();

        if(UtilsFiles.clientsList.size() <= 5 ) {
            new AdmobLib(this).nativeads( R.id.nativeads_template );
        }
    }
    public void setClient(ClientInfo c, ClientInfo _c_old) {
        String _client = c.toString();
//                        clients.remove(c.getHost());
        if( _c_old == null ) { //add
            clients.add( _client );
            appPreferences.setClients( clients );
            UtilsFiles.clientsList.add(c);
        } else { //edit
            for (Iterator<String> it = clients.iterator(); it.hasNext(); ) {
                String f = it.next();
                if( _c_old.toString().equals(f)  ) {
                    clients.remove( _c_old.toString() );
//                    c.setConnect(_c_old.isConnect());
                    clients.add( _client );
                    appPreferences.setClients( clients );
                }
            }
            intClient( _c_old );
        }

        appAdapter = new ClientAdapter(UtilsFiles.clientsList, this);
        recyclerView.setAdapter(appAdapter);
        appAdapter.notifyDataSetChanged();


    }
    private void intClient(ClientInfo _c_old) {
//        List<ClientInfo> clientsListOld = UtilsFiles.clientsList;
        UtilsFiles.clientsList = new ArrayList<>();
        for (Iterator<String> it = clients.iterator(); it.hasNext(); ) {
            String f = it.next();
            String[] strParts = f.split("##");
//            Log.e("strParts", " = "+f );
//            Log.e("strParts", " = "+strParts.length );
            String rDirectory = strParts.length < 7 ? "/" : strParts[6];

            ClientInfo info = new ClientInfo(strParts[0], strParts[1], strParts[2], strParts[3],
                    Integer.parseInt(strParts[4]), Integer.parseInt(strParts[5]), rDirectory);
            if( _c_old!=null ) info.setConnect( _c_old.isConnect() );
            UtilsFiles.clientsList.add(info);
        }
    }
    public void rmClient(ClientInfo c) {
        for (Iterator<String> it = clients.iterator(); it.hasNext(); ) {
            String f = it.next();
//            Log.e("F", f +"  \n  "+c.toString());
            if( c.toString() == f ) {
                clients.remove(c.toString());
                appPreferences.setClients( clients );
                intClient(null);
            }
        }

        appAdapter.notifyDataSetChanged();
    }

    private void setInitialConfiguration() {
        getSupportActionBar().setTitle("FTP/sFTP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().navi(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_client, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
//            super.onBackPressed();
//            Toast.makeText(this, "OnBAckPressed Works", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(  this, MainActivity.class );
            setResult( 0, intent );
            finish();
        } else if (item.getItemId() == R.id.clear) {
            appPreferences.clears();
            appAdapter.notifyDataSetChanged();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        Log.e("FTPclient Result ---", requestCode+" Error: " +resultCode );
        super.onActivityResult(requestCode, resultCode, data);

        appAdapter.notifyDataSetChanged();

        if( requestCode == UtilsFiles.OPEN_REQUEST_CLIENT ){
//            Log.e("FTPclient re Client", resultCode+" Error: 000 "+data.getStringExtra("name") );
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                String remoteFile = data.getStringExtra("remoteFile");
                int client_id = data.getIntExtra("client_id", 0);
//                Log.e("ClientActivity", "Error: 1 "+client_id );
                Intent intent = new Intent(  this, MainActivity.class );
                intent.putExtra("name", name);
                intent.putExtra("remoteFile", remoteFile );
                intent.putExtra("client_id", client_id);
                setResult( RESULT_OK, intent );
                finish();
            }

        }
    }


}
