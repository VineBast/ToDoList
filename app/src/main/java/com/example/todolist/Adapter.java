package com.example.todolist;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        private ImageView deleteButton;

        public ViewHolder(View view) {
            super(view);
            title = itemView.findViewById(R.id.titleTask);
            startDate = itemView.findViewById(R.id.startDate);
            endDate = itemView.findViewById(R.id.endDate);
            deleteButton = itemView.findViewById(R.id.deleteButton);
        }
    }

    @NonNull
    @Override
    //Inflate la cardview dans la vue
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_temp, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //Remplace les vues en fonction des intéractions de l'utilisateur
        ((ViewHolder) holder).title.setText(TasksList.get(position).getTitle());
        ((ViewHolder) holder).startDate.setText("Début : " + TasksList.get(position).getStartDate());
        ((ViewHolder) holder).endDate.setText("Fin : " + TasksList.get(position).getEndDate());
        //Appelle la fonction suppression quand un clic est fait sur l'image delete
        ((ViewHolder) holder).deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeAt(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.TasksList.size();
    }
    //Ajoute une tâche à la arraylist et met à jour la vue
    public void addItem(Task s) {
        TasksList.add(s);
        this.notifyDataSetChanged();
    }
    //Supprime la tâche de l'arraylist et met à jour la vue
    private void removeAt(int position) {
        TasksList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, TasksList.size());
    }
}



