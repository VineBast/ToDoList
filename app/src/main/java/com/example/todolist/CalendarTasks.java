package com.example.todolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.ui.main.PlaceholderFragment;


public class CalendarTasks extends Fragment {

    private static PlaceholderFragment fragment0;
    public static CalendarTasks newInstance(PlaceholderFragment fragment0) {
        CalendarTasks.fragment0 = fragment0;
        return new CalendarTasks();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab3_calendar_tasks, container, false);
    }
}