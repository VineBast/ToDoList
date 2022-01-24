package com.example.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.todolist.Model.Task;

public class Adapter extends RecyclerView.Adapter {
    private ArrayList<Task> TasksList;

    public Adapter() {
        this.TasksList = new ArrayList<Task>();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView startDate;
        private TextView endDate;

        public ViewHolder(View view) {
            super(view);
            title = itemView.findViewById(R.id.titleTask);
            startDate = itemView.findViewById(R.id.startDate);
            endDate = itemView.findViewById(R.id.endDate);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_temp, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).title.setText(TasksList.get(position).getTitle());
        ((ViewHolder) holder).startDate.setText("Début : " + TasksList.get(position).getStartDate());
        ((ViewHolder) holder).endDate.setText("Fin : " + TasksList.get(position).getEndDate());

    }

    @Override
    public int getItemCount() {
        return this.TasksList.size();
    }

    public void addItem(Task s) {
        TasksList.add(s);
        this.notifyDataSetChanged();
    }
}



