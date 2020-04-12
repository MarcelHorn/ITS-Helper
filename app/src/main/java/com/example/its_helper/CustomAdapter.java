package com.example.its_helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] questionsList;
    LayoutInflater inflter;
    public static ArrayList<String> selectedAnswers;

    public CustomAdapter(Context applicationContext, String[] questionsList) {
        this.context = context;
        this.questionsList = questionsList;
// initialize arraylist and add static string for all the questions
        selectedAnswers = new ArrayList<>();
        for (int i = 0; i < questionsList.length; i++) {
            selectedAnswers.add("Not Attempted");
        }
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return questionsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.list_items_functions, null);
// get the reference of TextView and Button's
        TextView question = (TextView) view.findViewById(R.id.question);
        RadioButton rb0 = (RadioButton) view.findViewById(R.id.rb0);
        RadioButton rb1 = (RadioButton) view.findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton) view.findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton) view.findViewById(R.id.rb3);
// perform setOnCheckedChangeListener event on yes button
        rb0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set Yes values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "rb0");
            }
        });
// perform setOnCheckedChangeListener event on no button
        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set No values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "rb1");

            }
        });
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // set value in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "rb2");
            }
        });
        rb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // set value in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "rb3");
            }
        });

        // set the value in TextView
        question.setText(questionsList[i]);
        return view;
    }
}
