package com.tglt.code.editor.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.tglt.code.editor.R;

import java.io.File;
import java.util.List;

import com.tglt.code.editor.app.ClientActivity;
import com.tglt.code.editor.client.ClientInfo;

public class UtilsDialog {

    public static void showTitleContent(Context context, String title, String content) {
        new MaterialAlertDialogBuilder(context)
                .setTitle(title)
                .setMessage( content )
                .setPositiveButton("Ok", null)
                .setCancelable(true)
                .show();
    }

    public static AlertDialog showTitleContentWithProgress(Context context, String title, String content) {
        return new MaterialAlertDialogBuilder(context)
                .setTitle(title)
                .setMessage( content )
//                .setPositiveButton("Ok", null)
                .setCancelable(false)
//                .setView(R.layout.loading)
                .show();
//        MaterialDialog.Builder materialBuilder = new MaterialDialog.Builder(context)
//                .title(title)
//                .content(content)
//                .cancelable(false)
//                .progress(true, 0);
//        return materialBuilder.show();
    }


//    public static AlertDialog showProFeatures(final Context context) {
//        MaterialAlertDialogBuilder materialBuilder = new MaterialAlertDialogBuilder(context)
//                .setTitle(context.getResources().getString(R.string.action_buy) + " (" + context.getResources().getString(R.string.action_buy_description) + ")")
//                .setIcon(ContextCompat.getDrawable(context, R.mipmap.ic_launcher))
//                .setPositiveButton(context.getResources().getString(R.string.action_buy) + " ($1.43)", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                UtilsApp.goToGooglePlay(context, MLManagerApplication.getProPackage());
//                            }
//                        }
//
//                )
//                .setNegativeButton(context.getResources().getString(R.string.button_later), null);
//
//        return materialBuilder.show();
//    }

    public static AlertDialog.Builder setDialogBox(String strEditText, Context context, View mView) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);

        alert.setTitle( strEditText );
        // alert.setMessage("Message");

        // Set an EditText view to get user input
//        final EditText input = new EditText(context);
//        final RadioButton = new RadioButton(context);

        alert.setView(mView);
//        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int whichButton) {
//                //  Log.d("TAG", Editable);
//            }
//        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // Canceled.
            }
        });

//        alert.show();
        return alert;

    }

    public static void openPopupAddClient( Context context, ClientInfo appInfo ){
        View mView =  LayoutInflater.from(context).inflate(R.layout.client_add, null);
        EditText name       = (EditText) mView.findViewById(R.id.txtName);  // editext này lấy ở file layout_custom_dialog
        EditText host       = (EditText) mView.findViewById(R.id.txtHost);
        EditText port       = (EditText) mView.findViewById(R.id.txtPort);
        EditText username   = (EditText) mView.findViewById(R.id.txtUsername);
        EditText password   = (EditText) mView.findViewById(R.id.txtPassword);
        RadioButton ftp     = (RadioButton) mView.findViewById(R.id.ftp);
        RadioButton sftp    = (RadioButton) mView.findViewById(R.id.sftp);

        EditText remoteDirectory = (EditText) mView.findViewById(R.id.remoteDirectory);

        if( appInfo!=null ) {
//            Log.e("SFTPClient", appInfo.toString()+"===="+appInfo.getPort() );
            name.setText(appInfo.getName());
            host.setText(appInfo.getHost());
            port.setText( String.valueOf(appInfo.getPort()));
            username.setText(appInfo.getUsername());
            password.setText(appInfo.getPassword());
            ftp.setChecked(appInfo.getType() == 1 ? true : false);
            sftp.setChecked(appInfo.getType() == 2 ? true : false);
            remoteDirectory.setText(appInfo.getRemoteDirectory());
        }
        String button_title = appInfo!=null ? ClientActivity.getContext().getString(R.string.edit) : ClientActivity.getContext().getString(R.string.add);
        AlertDialog.Builder materialBuilder = UtilsDialog.setDialogBox( ClientActivity.getContext().getString(R.string.add_client_account), ClientActivity.getContext(), mView);
        materialBuilder.setPositiveButton(button_title, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int type = ftp.isChecked() ? 1 : (sftp.isChecked() ? 2 : 1);
//                Log.e("SFTPClient", ftp.isChecked()+"===="+sftp.isChecked() + " === "+type );
                int p = (port.getText() != null ? Integer.parseInt( port.getText().toString() != "" ? port.getText().toString() : "0") : 0);
                String rDirectory = remoteDirectory.getText() == null ? "/" : remoteDirectory.getText().toString();
                ClientInfo c = new ClientInfo(name.getText().toString(), host.getText().toString(), username.getText().toString(),
                        password.getText().toString(), type, p, rDirectory );
//                        Log.e("F", c.toString());

                ClientActivity.getActivity().setClient(c, appInfo);
            }
        });
        materialBuilder.show();
    }
}
