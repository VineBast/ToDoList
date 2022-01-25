package com.example.todolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.ui.main.PlaceholderFragment;

public class CreateTasks extends Fragment {
    private static PlaceholderFragment tab_2;
    public static CreateTasks newInstance(PlaceholderFragment tab_2) {
        CreateTasks.tab_2 = tab_2;
        return new CreateTasks();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab2_create_tasks, container, false);
    }
}