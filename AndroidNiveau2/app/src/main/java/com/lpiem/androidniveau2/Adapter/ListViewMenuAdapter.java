package com.lpiem.androidniveau2.Adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lpiem.androidniveau2.Item.ListViewMenuItem;
import com.lpiem.androidniveau2.R;

import java.util.ArrayList;

/**
 * Created by iem2 on 09/11/15.
 */
public class ListViewMenuAdapter extends BaseAdapter {
    ArrayList<ListViewMenuItem> listItem;
    Context context;

    public ListViewMenuAdapter(ArrayList<ListViewMenuItem> listItem, Context context) {
        this.listItem = listItem;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RelativeLayout layout;

        //if it the first creation
        if(convertView == null) {
            layout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.list_view_adater_menu, null);
        } else {
            // reuse an existing view so we need to re-set all parameters
            layout = (RelativeLayout)convertView;
        }
        ImageView ivIcon=(ImageView)layout.findViewById(R.id.ivMenu);
        TextView tvText=(TextView)layout.findViewById(R.id.tvMenu);

        ivIcon.setImageResource(listItem.get(position).getIcon());
        tvText.setText(listItem.get(position).getNom());

        return layout;
    }
}
