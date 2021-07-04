package com.moringaschool.g_samaritan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LostActivity extends  AppCompatActivity {
    TextView textView;
//    @BindView(R.id.textView) TextView textView;
    ListView listView;
//    @BindView(R.id.listView) ListView listView;

    private String[] lost = new String[]{"John Baraza","Kivuki Tuka","Shutuka Kizee","Doe moen","Pirre Smart", "Dokore Daka","Ogutu Sultan","Mwana Wababu","Oushe Biggy","Jeshi Krotone" };
    private String[] cuisines  =new String[] {
            "B.M.X bicycle","TecknoSpark7", "KDF675N Subaru","ID No.456372","Ranger KMFE354y","Child name: Kitelo","HUduma card 1034567","Guchi laptopbag","Puma shoe","K.C.S.E certificate"
    };
//    private Object LostActivity;

//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
//        ButterKnife.bind(this);
        listView =(ListView) findViewById(R.id.listview);
        textView =(TextView) findViewById(R.id.findViewById);

//        LostArrayAdapter adapter = new LostArrayAdapter(this, android.R.layout.simple_list_item_1,lost mCuisines);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lost); //
        listView.setAdapter(adapter);

        listView .setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String lost =((TextView)view).getText().toString();

                Toast.makeText(LostActivity.this,lost,Toast.LENGTH_LONG).show();
            }
        });
        
        Intent intent =getIntent();
        String name= intent.getStringExtra("name");
        String county =intent.getStringExtra("county");
//        textView=findViewById(R.id.findViewById);
        textView.setText("Welcome back good samaritan "  + name +  " Here is the list of the lost items in   "   + county +   " lets help find there owners" );
        Log.d("LostActivity", "In the onCreate method!");

//        textView.setText("");
    }
}

//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//class RestaurantsActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lost);
//        TextView mEdittext = (TextView) findViewById(R.id.edittext);
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//
//        mEdittext.setText("Welcome back:" + name);
//    }
//}
