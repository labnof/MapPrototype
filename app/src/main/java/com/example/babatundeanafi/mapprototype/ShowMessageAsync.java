package com.example.babatundeanafi.mapprototype;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * Created by babatundeanafi on 25/11/2016.
 */

    //Required to explain the resonfor locational Permission
    //reference:http://stackoverflow.com/questions/19489643/android-alertdialog-inside-asynctask
    //and https://developer.android.com/reference/android/os/AsyncTask.html#onPostExecute(Result)
    public class ShowMessageAsync extends AsyncTask<Void, Void, Void>{




    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }

    protected void onPostExecute(  View v ) {


        ShowMessage m = new ShowMessage();

        m.showSnackbar(v, "Repalace with you mesage");
        //   m.showDialog(builder, "Locational Access", "Please Grant Location Access");
        //m.showToast(getApplicationContext(), " it is OK");
    }
    public void onPostExecute( AlertDialog.Builder builder) {


        ShowMessage m = new ShowMessage();

        //m.showSnackbar(v, "Repalace with you mesage");
        m.showDialog(builder, "Locational Access", "Please Grant Location Access");

        //m.showToast(getApplicationContext(), " it is OK");
    }

    protected void onPostExecute(Context context) {


        ShowMessage m = new ShowMessage();

        //m.showSnackbar(v, "Repalace with you mesage");
        // m.showDialog(builder, "Locational Access", "Please Grant Location Access");
        m.showToast(context, " it is OK");
    }
}
