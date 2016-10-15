package com.example.mac05.newrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mac05 on 10/15/16.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{
    private ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts){this.contacts = contacts;}


    public void onBindViewHolder(){ }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView photo;
        TextView name, age, sex;

        public ViewHolder(View itemView){
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.contact_image);
            name = (TextView) itemView.findViewById(R.id.contact_name);
            age = (TextView) itemView.findViewById(R.id.contact_age);
            sex = (TextView) itemView.findViewById(R.id.contact_sex);
        }
    }

}
