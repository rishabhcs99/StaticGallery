package com.example.nishit.staggeredgrid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class StaggeredRecyclerAdapter extends RecyclerView.Adapter<StaggeredRecyclerAdapter.ImageViewHolder> {


    Context mContext;
    List<row> mdata;
    //
    //



    public StaggeredRecyclerAdapter(Context mContext, List<row> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view= LayoutInflater.from(mContext).inflate(R.layout.row_item,viewGroup,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int position) {
        //binding img here
        imageViewHolder.img.setImageResource(mdata.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }




    public class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        public ImageViewHolder(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.row_img);
        }
    }
}
