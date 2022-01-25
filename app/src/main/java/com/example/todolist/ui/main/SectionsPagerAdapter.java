package com.example.todolist.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.todolist.AddTask;
import com.example.todolist.CalendarTasks;
import com.example.todolist.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    private PlaceholderFragment fragment0 = PlaceholderFragment.newInstance();
    private AddTask fragment1 = AddTask.newInstance(fragment0);
    private CalendarTasks fragment2 = CalendarTasks.newInstance(fragment0);

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    //Change le fragment dans la vue en fonction de la tab cliquée
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragment0;
            case 2:
                return fragment2;
            case 1:
                return fragment1;
        }

        return fragment0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}