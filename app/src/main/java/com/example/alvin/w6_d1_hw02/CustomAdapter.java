package com.example.alvin.w6_d1_hw02;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Alvin on 8/22/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    static class ViewHolder {
        TextView text;
    }

}
