package com.arcaya.arcaya_josh_labexercise4;

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

public class CompanyAdapter extends ArrayAdapter<TopCompanies> {

    private Context context;
    private int resource;

    public CompanyAdapter(@NonNull Context context, int resource, @NonNull List<TopCompanies> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {
        int logo = getItem(i).getLogo();
        String cName = getItem(i).getCompName();
        String cCountry = getItem(i).getCompCountry();
        String cCEO = getItem(i).getCompCEO();
        String cIndustry = getItem(i).getCompIndustry();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource,parent,false);
        ImageView img = convertView.findViewById(R.id.lvLogo);
        TextView compName = convertView.findViewById(R.id.tvName);
        TextView compCountry = convertView.findViewById(R.id.tvCountry);
        TextView compCEO = convertView.findViewById(R.id.tvCEO);
        TextView compIndustry = convertView.findViewById(R.id.tvIndustry);

        img.setImageResource(logo);
        compName.setText(cName);
        compCountry.setText("Country: " + cCountry);
        compIndustry.setText("Industry: " +cIndustry);
        compCEO.setText("CEO: " + cCEO);

        return convertView;
    }
}
