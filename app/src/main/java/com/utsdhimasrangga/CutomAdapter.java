package com.utsdhimasrangga;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utsdhimasrangga.model.User;

import org.w3c.dom.Text;

import java.util.List;

public class CutomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<User> mDataList;
    private Context context;
    private layoutInflater minflater;

    public CustomAdapter(Context context, List<User>) dataList){
    minflater = layoutInflater.from(context);
    this.mDataList = mDataList;
    }
    class CustomViewHolder extend ReycylerVie.CustomViewHolder {
    public final TextView idTextView;
    public final TextView usernameTextView;
    public final TextView emailTextView;
    final customAdapter mAdapter;

    public CustomViewHolder(View itemView, CustomAdapter adapter){
        idTextView = (TextView)itemView.findViewById(R.id.user_id);
        UsernameTextView = (TextView)itemView.findViewById(R.id.name);
        nameTextView = (TextView)itemView.findViewById(R.id.name);
        emailTextView = (TextView)itemView.findViewById(R.id.email);
        this.mAdapter = adapter;
        }
        @NonNull
        @Override
        public CustomViewHolder OnCreatViewHolder(@NonNull viewGroup parent, int viewType){
            View mItemView = minflater.inflater(R.layout.list_user,parent, attachToRoot : false);
            return new CustomViewHolder(mItemView, adapter: this);
        }
        @Override
                public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        String currentId = String.valueOf(mDataList.get(position).getId());
        holder.idTextView.setText("ID : "+ currentId);
        String currentUsername = mDataList.get(position).getUsername();
        holder.usernameTextView.setText("Username : " + currentUsername);
        String currentName = mDataList.get(position).getName();
        holder.nameTextView.setText(currentName);
        String currentEmail = mDataList.get(position).getEmail();
        holder.emailTextView.setText(currentEmail);

        }
        @Override
                public int getItemCount(){return mDataList.size(); }
    }
}
