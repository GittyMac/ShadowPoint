package com.lako.shadowpoint.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lako.shadowpoint.R;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private TextView playerOne;
    private Button addOneP1;
    private Button addTenP1;
    private Button addHunP1;
    private Button subOneP1;
    private Button subTenP1;
    private Button subHunP1;

    private Text playerTwo;
    private Button addOneP2;
    private Button addTenP2;
    private Button addHunP2;
    private Button subOneP2;
    private Button subTenP2;
    private Button subHunP2;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        //Player 1's score code
        final TextView playerOne = rootView.findViewById(R.id.textView);
        final int[] score = {Integer.valueOf(playerOne.getText().toString())};
        Button addOneP1 = (Button) rootView.findViewById(R.id.button);
        addOneP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) + Integer.parseInt("1");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });

        Button addTenP1 = (Button) rootView.findViewById(R.id.button2);
        addTenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) + Integer.parseInt("10");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });

        Button addHunP1 = (Button) rootView.findViewById(R.id.button3);
        addHunP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) + Integer.parseInt("100");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });

        Button subOneP1 = (Button) rootView.findViewById(R.id.button4);
        subOneP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) - Integer.parseInt("1");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });

        Button subTenP1 = (Button) rootView.findViewById(R.id.button6);
        subTenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) - Integer.parseInt("10");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });

        Button subHunP1 = (Button) rootView.findViewById(R.id.button5);
        subHunP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score[0])) - Integer.parseInt("100");
                playerOne.setText("" + currentScore);
                score[0] = currentScore;
            }
        });
        //End of Player 1 Score Code

        //Start of Player 2 Score Code
        final TextView playerTwo = rootView.findViewById(R.id.textView2);
        final int[] score2 = {Integer.valueOf(playerOne.getText().toString())};
        Button addOneP2 = (Button) rootView.findViewById(R.id.button7);
        addOneP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) + Integer.parseInt("1");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });

        Button addTenP2 = (Button) rootView.findViewById(R.id.button8);
        addTenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) + Integer.parseInt("10");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });

        Button addHunP2 = (Button) rootView.findViewById(R.id.button9);
        addHunP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) + Integer.parseInt("100");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });

        Button subOneP2 = (Button) rootView.findViewById(R.id.button10);
        subOneP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) - Integer.parseInt("1");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });

        Button subTenP2 = (Button) rootView.findViewById(R.id.button11);
        subTenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) - Integer.parseInt("10");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });

        Button subHunP2 = (Button) rootView.findViewById(R.id.button12);
        subHunP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentScore = Integer.parseInt(String.valueOf(score2[0])) - Integer.parseInt("100");
                playerTwo.setText("" + currentScore);
                score2[0] = currentScore;
            }
        });
        //End of Player Two Score

        return rootView;

    }

}
