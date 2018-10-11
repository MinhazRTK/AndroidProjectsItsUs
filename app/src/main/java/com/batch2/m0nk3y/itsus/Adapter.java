package com.batch2.m0nk3y.itsus;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private Context mCtx;

    private List<AboutUs> memberList;


    public Adapter(Context mCtx, List<AboutUs> memberList) {
        this.mCtx = mCtx;
        this.memberList = memberList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.id_view, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final AboutUs AboutUs = memberList.get(position);

        holder.textViewName.setText(AboutUs.getName());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(AboutUs.getImage()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mCtx, AboutUs.getUrl(), Toast.LENGTH_SHORT).show();
                Search src = new Search();
                Bundle arguments = new Bundle();
                arguments.putString("url", AboutUs.getUrl());
                src.setArguments(arguments);

                ((FragmentActivity) mCtx).getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.frame, src)
                        .commit();
            }
        });


    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            imageView = itemView.findViewById(R.id.imageView);
        }


    }
}
