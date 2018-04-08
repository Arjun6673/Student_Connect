package com.arjunmore.studentconnect.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.arjunmore.studentconnect.R;

import java.util.List;

/**
 * Created by ARJUN on 4/8/2018.
 */

public class CousesAdapter extends  RecyclerView.Adapter<CousesAdapter.MyViewHOlder>{
    private Context context;
    private List  mylistt;
    private View view;
    CousesAdapter(Context context, List mylistt){
        this.context = context;
        this.mylistt =mylistt;
    }


    @Override
    public MyViewHOlder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_courses,parent,false);
        return new MyViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHOlder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mylistt.size();
    }

    public class MyViewHOlder extends RecyclerView.ViewHolder {
        public MyViewHOlder(View itemView) {
            super(itemView);
        }
    }

}
