package com.rahulaswani.listexample;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rahulaswani on 22/02/15.
 */
public class ListActList extends ListActivity {

     ListView list;
    String[] listitems = {"Rahul","Subhendu","Puneet","Pranjal","Devansh","pepe","yogi","nitin","anshul","prasun"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listactivity_list);


        list = getListView();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_view,listitems);

        list.setAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        TextView clicked = (TextView) v;
        Toast.makeText(getApplicationContext(),clicked.getText()+" clicked",Toast.LENGTH_LONG).show();
    }
}
