package com.lako.shadowpoint.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lako.shadowpoint.R;

import java.util.Random;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public static final Random RANDOM = new Random();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        Button roll = rootView.findViewById(R.id.button13);
        final ImageView dice = rootView.findViewById(R.id.imageView);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = randomNumberGenerator();
                int res1 = getResources().getIdentifier("dice" + result, "drawable", "com.lako.shadowpoint");
                dice.setImageResource(res1);
            }
        });

        return rootView;
    }

    public static int randomNumberGenerator() {
        return RANDOM.nextInt(6) + 1;
    }
}
