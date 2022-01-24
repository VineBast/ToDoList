package com.example.todolist;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.todolist.Model.Task;
import com.example.todolist.ui.main.PlaceholderFragment;
import com.google.android.material.textfield.TextInputEditText;

public class AddTask extends Fragment {
    private static PlaceholderFragment fragment0;

    public static AddTask newInstance(PlaceholderFragment fragment0) {
        AddTask fragment = new AddTask();
        AddTask.fragment0 = fragment0;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.tab2_create_tasks, container, false);

        Button button = (Button) root.findViewById(R.id.button_create);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                //Récupère les textes des input
                String text = ((TextInputEditText) root.findViewById(R.id.textInputEditText)).getText().toString();
                String start = ((EditText) root.findViewById(R.id.editTextStartDate)).getText().toString();
                String end = ((EditText) root.findViewById(R.id.editTextEndDate)).getText().toString();
                //Créer un objet Task avec les valeurs entrées par l'utilisateur
                Task task = new Task(text, start, end);

                AddTask.fragment0.getListAdapter().addItem(task);
                //Supprime les textes des input
                ((TextInputEditText) root.findViewById(R.id.textInputEditText)).getText().clear();
                ((EditText) root.findViewById(R.id.editTextStartDate)).getText().clear();
                ((EditText) root.findViewById(R.id.editTextEndDate)).getText().clear();
            }
        });

        return root;
    }
}
