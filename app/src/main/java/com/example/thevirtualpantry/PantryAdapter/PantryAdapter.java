package com.example.thevirtualpantry.PantryAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.thevirtualpantry.R;
import com.example.thevirtualpantry.model.Item;

import java.util.List;

public class PantryAdapter extends RecyclerView.Adapter<PantryAdapter.MyViewHolder> {

    private Context mContext;
    private List<Item> itemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            count = view.findViewById(R.id.count);
            thumbnail = view.findViewById(R.id.thumbnail);
            overflow = view.findViewById(R.id.overflow);
        }
    }

    public PantryAdapter(Context mContext, List<Item> albumList) {
        super();
        this.mContext = mContext;
        this.itemList = albumList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.title.setText(item.getName());
        holder.count.setText(item.getNumOfItems() + " items");

        // loading album cover using Glide library
        holder.thumbnail.setImageBitmap(item.getBitmap());

//        holder.overflow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //what happens on click
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


}
