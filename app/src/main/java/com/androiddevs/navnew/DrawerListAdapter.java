package com.androiddevs.navnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Syacraft on 6/29/2016.
 */
public class DrawerListAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<ItemModels> mItemModels;

    public DrawerListAdapter(Context context, ArrayList<ItemModels> itemModels) {
        mContext = context;
        mItemModels = itemModels;
    }

    @Override
    public int getCount() {
        return mItemModels.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.drawer_item, null);
        }
        else {
            view = convertView;
        }

        TextView titleView = (TextView) view.findViewById(R.id.title);
        TextView subtitleView = (TextView) view.findViewById(R.id.subTitle);
        ImageView iconView = (ImageView) view.findViewById(R.id.icon);

        titleView.setText( mItemModels.get(position).mTitle );
        subtitleView.setText( mItemModels.get(position).mSubtitle );
        iconView.setImageResource(mItemModels.get(position).mIcon);

        return view;
    }
}