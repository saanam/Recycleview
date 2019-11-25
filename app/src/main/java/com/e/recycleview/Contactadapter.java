package com.e.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Contactadapter extends RecyclerView.Adapter<Contactadapter.ContactsViewHolder> {

    Context context;
    List<contact> contactList;

    public Contactadapter(Context context, List<contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts,parent,false);
        return new ContactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {

        contact contacts = contactList.get(position);
        holder.imgview.setImageResource(contacts.getImage());
        holder.tvname.setText(contacts.getName());
        holder.tvphone.setText(contacts.getPhone());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgview;
        TextView tvname, tvphone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.imgview);
            tvname = itemView.findViewById(R.id.tvname);
            tvphone = itemView.findViewById(R.id.tvphone);
        }
    }
}
