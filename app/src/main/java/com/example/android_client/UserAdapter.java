package com.example.android_client;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class UserAdapter extends
        RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> userList;
    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent,
                        false);
        return new UserViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position)
    {
        User user = userList.get(position);
        holder.textViewName.setText(user.getName());
        holder.textViewEmail.setText(user.getEmail());
        holder.textViewHobi.setText(user.getHobi());
        holder.textViewAlamat.setText(user.getAlamat());
    }
    @Override
    public int getItemCount() {
        return userList.size();
    }
    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewEmail;
        TextView textViewHobi;
        TextView textViewAlamat;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewHobi = itemView.findViewById(R.id.textViewHobi);
            textViewAlamat = itemView.findViewById(R.id.textViewAlamat);
        }
    }
}

