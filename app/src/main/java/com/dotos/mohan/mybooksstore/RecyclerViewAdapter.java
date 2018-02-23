package com.dotos.mohan.mybooksstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohan on 23-02-2018.
 */

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_books_items,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_books_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing data
                Intent intent = new Intent(mContext,Book_Activity.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDesription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                //starting activity
                mContext.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_books_title;
        ImageView img_book_thumbnail;
        CardView cardView;



        public MyViewHolder(View itemView) {
             super(itemView);

             tv_books_title=(TextView) itemView.findViewById(R.id.book_title_id);
             img_book_thumbnail=(ImageView) itemView.findViewById(R.id.books_image_id);
             cardView=(CardView) itemView.findViewById(R.id.cardview_id);
         }
    }




}
