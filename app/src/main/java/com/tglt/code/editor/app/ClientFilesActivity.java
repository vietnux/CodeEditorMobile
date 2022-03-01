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

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.tglt.code.editor.R;
import com.tglt.code.editor.adapter.ClientAdapter;
import com.tglt.code.editor.adapter.ClientFilesAdapter;
import com.tglt.code.editor.client.Client;
import com.tglt.code.editor.client.ClientInfo;
import com.tglt.code.editor.client.FTPClient1;
import com.tglt.code.editor.client.SFTPClient;
import com.tglt.code.editor.files.FileInfo;
import com.tglt.code.editor.utils.UtilsDialog;
import com.tglt.code.editor.utils.UtilsFiles;

public class ClientFilesActivity extends AppCompatActivity  {
    private RecyclerView recyclerView;
    private ClientInfo clientinfo;
    private Client client;
    private ContentLoadingProgressBar progressWheel;

    private static ClientFilesActivity activity;
    public static ClientFilesActivity getActivity() {
        return activity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = this;

        setContentView(R.layout.activity_client_file);
        recyclerView = (RecyclerView) findViewById(R.id.appList);

        progressWheel = (ContentLoadingProgressBar) findViewById(R.id.progress);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        progressWheel.setVisibility(View.VISIBLE);

        getInitialConfiguration();
        setInitialConfiguration();
    }
    private void setInitialConfiguration() {
        getSupportActionBar().setTitle( clientinfo.getName()+": "+ clientinfo.getRemoteDirectory() );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().navi(true);
    }

    private void setTitle(ClientInfo clientinfo) {
        getSupportActionBar().setTitle( clientinfo.getName()+": "+ clientinfo.getRemoteDirectory() );
    }

    private void getInitialConfiguration() {
        String name = getIntent().getStringExtra("name");
        String host = getIntent().getStringExtra("host");
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");
        int type = getIntent().getIntExtra("type", 1);
        int port = getIntent().getIntExtra("port", 21);
        String remoteDirectory = getIntent().getStringExtra("remoteDirectory");

        //String name, String host, String username, String password, int type, int port, String remoteDirectory
        clientinfo = new ClientInfo(name, host, username, password, type, port, remoteDirectory);

//        Log.e("FTPclient re Client", " Error: 000 "+clientinfo.toString() );

        getRemoteDirectory(clientinfo);
//        Log.e("appInfo", "=== "+clientinfo.toString() );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
//            super.onBackPressed();
//            Toast.makeText(this, "OnBAckPressed Works", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(  this, ClientActivity.class );
            setResult( 0, intent );
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


    public void setAdapter() {
        UtilsFiles.clients.add(client);
        clientinfo.setConnect(client.isConnect());
//        Log.e("ClientFileActivity", "client_id: "+UtilsFiles.clients.indexOf(client));
        ClientFilesAdapter appAdapter = new ClientFilesAdapter(client.getClientsListFile(), this, UtilsFiles.clients.indexOf(client) );
        recyclerView.setAdapter(appAdapter);
        appAdapter.notifyDataSetChanged();

        progressWheel.setVisibility(View.GONE);

        for(int i=0; i<UtilsFiles.clientsList.size(); i++) {
            if( UtilsFiles.clientsList.get(i).getName().equals(clientinfo.getName()) ) {
//                Log.e("FTPclient re Client", " Error: 000 "+clientinfo.getName() +" = "+client.isConnect() );
                UtilsFiles.clientsList.get(i).setConnect(client.isConnect()); break;
            }
        }

    }
    public void getRemoteDirectory(ClientInfo clientinfo) {
        if( clientinfo.getType() == 1 ) {
            client = new FTPClient1(clientinfo);
        } else {
            client = new SFTPClient(clientinfo);
        }
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                client.connect();
                return null;
            }
            @Override
            protected void onPostExecute(Void success) {
                if( client.isConnect() ) {
                    setAdapter();
                } else {
                    Log.e("message2", client.message );
                    UtilsDialog.showTitleContent( activity, "Error", "client.message" );
                }
            }
        }.execute();
    }

    public void changeRemoteDirectory(String rm) {
        progressWheel.setVisibility(View.VISIBLE);
        clientinfo.setRemoteDirectory(rm);
        getRemoteDirectory(clientinfo);
        setTitle(clientinfo);
    }
}
