package com.example.spinnerdemotdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner sp,countryS;
ArrayList<Country> countries;
CountryAdapter ca;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.Myspinner);
        countryS=(Spinner)findViewById(R.id.Myspinner);



        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource( android.R.layout.simple_dropdown_item_1line);
        sp.setAdapter(adapter);
        getdata();
        ca=new CountryAdapter(this,R.layout.mycountryelements,countries);
        countryS.setAdapter(ca);



    }

    private void getdata() {
        countries=new ArrayList<Country>();
        countries.add(new Country("France",R.drawable.france));
        countries.add(new Country("Germany",R.drawable.germany));
        countries.add(new Country("Russia",R.drawable.russia));
        //countries.add(new Country("Sweden",R.drawable.sweden ));
        countries.add(new Country("USA",R.drawable.usa));
    }


}
