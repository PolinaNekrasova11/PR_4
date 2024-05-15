package com.example.pr_4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class MainFragment extends Fragment {
    Button watch_bags;
    Button watch_cosmetic_bags;
    public MainFragment() {
        super(R.layout.fragment_main);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        watch_bags= (Button) getActivity().findViewById(R.id.watch_bags);
        watch_cosmetic_bags= (Button) getActivity().findViewById(R.id.watch_cosmetic_bags);

        watch_bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                SecondFragment.class, null, "Second Fragment")
                        .commit();
            }
        });

        watch_cosmetic_bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                ThirdFragment.class, null, "Third Fragment")
                        .commit();
            }
        });
    }
}
