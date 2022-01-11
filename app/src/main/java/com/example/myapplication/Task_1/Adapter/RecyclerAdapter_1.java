package com.example.myapplication.Task_1.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Task_1.Model.Member;
import com.example.myapplication.R;

import java.util.ArrayList;

public class RecyclerAdapter_1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Member> members;

    public RecyclerAdapter_1(Context context, ArrayList<Member> members){
        this.context = context;
        this.members = members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_list,parent,false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        if(holder instanceof MemberViewHolder){
            ImageView iv_profile = ((MemberViewHolder)holder).iv_profile;
            TextView tv_name = ((MemberViewHolder)holder).tv_name;
            TextView tv_surname = ((MemberViewHolder)holder).tv_surname;

            iv_profile.setImageResource(member.getProfile());
            tv_name.setText(member.getName());
            tv_surname.setText(member.getSurname());
        }
    }

    public class MemberViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView iv_profile;
        public TextView tv_name;
        public TextView tv_surname;

        public MemberViewHolder(View v){
            super(v);
            this.view = v;

            iv_profile = view.findViewById(R.id.iv_profile);
            tv_name = view.findViewById(R.id.tv_name);
            tv_surname = view.findViewById(R.id.tv_surname);
        }
    }
}