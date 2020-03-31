package com.example.spinnerdemotdi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CountryAdapter extends ArrayAdapter<Country> {
    public CountryAdapter(@NonNull Context context, int resource, @NonNull List<Country> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);

    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }
    public View initView(int position,View convertView,ViewGroup parent){
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.mycountryelements,parent,false);
        }
        ImageView flag=convertView.findViewById(R.id.imgFlag);
        TextView nameC=convertView.findViewById(R.id.CountryName);
        Country c=getItem(position);
        if(c!=null){
            flag.setImageResource(c.getImagC());
            nameC.setText(c.getName());
        }
        return convertView;
    }
}
