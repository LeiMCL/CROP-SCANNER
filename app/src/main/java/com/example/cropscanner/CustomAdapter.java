package com.example.cropscanner;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    //create a list to pass our Model class
    List<DataModel> modelList;
    Context context;
    public CustomAdapter(List<DataModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate our custom view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //bind all custom views by its position
        //to get the positions we call our Model class
        final DataModel model = modelList.get(position);
        holder.name.setText(model.getCrop());
        holder.tag.setText(model.getType());
        int id  = model.getId();
        //click listener
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra( "id",id );
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return modelList.size();
    }
    //all the custom view will be hold here or initialize here inside MyViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, tag;
        CardView relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.cropsname);
            tag = itemView.findViewById(R.id.cropstype);
            relativeLayout = itemView.findViewById(R.id.card_view);
        }
    }
}
