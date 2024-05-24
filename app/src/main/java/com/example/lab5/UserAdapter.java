package com.example.lab5;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
    private ArrayList<User> userList;

    public UserAdapter(ArrayList<User> userList) {
        this.userList = userList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.activity_user, parent, false);

        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = userList.get(position);

        holder.tvUsername.setText("Username: " + user.getUsername());
        holder.tvFullName.setText("Fullname: " + user.getFullname());
        holder.tvEmail.setText("Email: " + user.getEmail());
        holder.avt.setImageResource(user.getImg());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvUsername;
        TextView tvFullName;
        TextView tvEmail;

        ImageView avt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUsername = itemView.findViewById(R.id.tv_username);
            tvFullName = itemView.findViewById(R.id.tv_fullname);
            tvEmail = itemView.findViewById(R.id.tv_email);
            avt = itemView.findViewById(R.id.avt);
        }
    }
}
