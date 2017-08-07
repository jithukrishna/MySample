package com.hddialer.pro.samplefinger.adapter;

/**
 * Created by root on 21/11/16.
 */

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.hddialer.pro.samplefinger.R;
import com.hddialer.pro.samplefinger.support.Absent;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;



public class AbsentAdapter extends RecyclerView.Adapter<AbsentAdapter.MyViewHolder> {


    List<Absent> itemListPogo = null;
    private ArrayList<Absent> arrayList;
    Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView txtName;
        public TextView txtdesignation;
        public ImageView pic,type_img;
        public RelativeLayout layoutColour;
        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            txtName = (TextView) v.findViewById(R.id.name);
            txtdesignation = (TextView) v.findViewById(R.id.designation);
            layoutColour=v.findViewById(R.id.layoutColour);
            type_img=v.findViewById(R.id.type_img);
            pic=v.findViewById(R.id.pic);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AbsentAdapter(List<Absent> itemListPogo, Context mContext) {
        this.itemListPogo = itemListPogo;
        this.mContext = mContext;
        this.arrayList = new ArrayList<Absent>();
        this.arrayList.addAll(this.itemListPogo);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AbsentAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.absent_adapter, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.txtName.setText(itemListPogo.get(position).getName());
        holder.txtdesignation.setText(itemListPogo.get(position).getDesignation());
        Log.e("type---",""+itemListPogo.get(position).getType());
        Log.e("URl---",""+itemListPogo.get(position).getUrl());

       // Log.e("STATUSSS---",""+itemListPogo.get(position).getstatusAbsnt());
        int k=itemListPogo.get(position).getType();
        Log.e("k---",""+k);
        //layoutColour
        if(k==0){
            Log.e("k---","IFFFF");
            holder.layoutColour.setBackgroundColor(Color.parseColor("#e2302a"));
            holder.type_img.setBackgroundResource(R.drawable.ic_close);
        }else {
            Log.e("k---","ELSEE");
         holder.layoutColour.setBackgroundColor(Color.parseColor("#07ed07"));

            holder.type_img.setBackgroundResource(R.drawable.ic_check);
        }
        if(itemListPogo.get(position).getUrl().equalsIgnoreCase("")){

                }else {
            Picasso.with(mContext)
                    .load(itemListPogo.get(position).getUrl())
                    .resize(150, 150)
                    .into(holder.pic);
        }
    }

    @Override
    public int getItemCount() {
        return itemListPogo.size();
    }

   /* public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        itemListPogo.clear();
        if (charText.length() == 0) {
            itemListPogo.addAll(arrayList);
        } else {
            for (ItemListPogo wp : arrayList) {
                if (wp.getItemName().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    itemListPogo.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }*/
}