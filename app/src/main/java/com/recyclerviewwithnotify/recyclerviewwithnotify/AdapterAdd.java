package com.recyclerviewwithnotify.recyclerviewwithnotify;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by smartron on 21/12/17.
 */

public class AdapterAdd extends RecyclerView.Adapter<AdapterAdd.ViewHolder> {

    public AdapterAdd(List<AddOperations> addOperations) {
        this.addOperations = addOperations;
    }

    private List<AddOperations> addOperations;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView value1_tv, value2_tv, result_tv;

        public ViewHolder(View itemView) {
            super(itemView);

            value1_tv = itemView.findViewById(R.id.value1_tv);
            value2_tv = itemView.findViewById(R.id.value2_tv);
            result_tv = itemView.findViewById(R.id.result_tv);
        }
    }


    @Override
    public AdapterAdd.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_addvalues, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterAdd.ViewHolder holder, int position) {
        holder.value1_tv.setText(addOperations.get(position).getValue1() + "");
        holder.value2_tv.setText(addOperations.get(position).getValue2() + "");
        holder.result_tv.setText(addOperations.get(position).getResult() + "");


    }

    @Override
    public int getItemCount() {
        return addOperations.size();
    }
}
