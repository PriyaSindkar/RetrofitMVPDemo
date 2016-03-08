package com.example.priyasindkar.retrofitmvpdemo.getApi;

/**
 * Created by priyasindkar on 03-03-2016.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.priyasindkar.retrofitmvpdemo.R;
import com.example.priyasindkar.retrofitmvpdemo.getApi.Model.User;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<User> data;
    private static LayoutInflater inflater = null;

    public UserAdapter(Activity a, ArrayList<User> users) {
        activity = a;
        data = users;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView title = (TextView) vi.findViewById(R.id.userId);
        TextView name = (TextView) vi.findViewById(R.id.name);
        TextView mobile = (TextView) vi.findViewById(R.id.mobile);

        // Setting all values in listview
        title.setText(data.get(position).getId());
        name.setText(data.get(position).getName());
        mobile.setText(data.get(position).getPhone().getMobile());

        return vi;
    }
}