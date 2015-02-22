package com.rahulaswani.listexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rahulaswani on 22/02/15.
 */
public class SimpleList extends ActionBarActivity implements AdapterView.OnItemClickListener{

    ListView list;
    String[] listitems = {"Rahul","Subhendu","Puneet","Pranjal","Devansh","pepe","yogi","nitin","anshul","prasun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_list);

        list = (ListView) findViewById(R.id.mylistView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_view,listitems);

        list.setAdapter(adapter);

        list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        TextView clicked_item = (TextView) view;
        Toast.makeText(this, clicked_item.getText() + " clicked", Toast.LENGTH_LONG).show();
    }
}
