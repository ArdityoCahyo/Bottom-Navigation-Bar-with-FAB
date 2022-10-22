package com.ardityoc.bottomnavigationbarwithfab.ui.myplant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ardityoc.bottomnavigationbarwithfab.databinding.FragmentMyplantBinding;

public class MyPlantFragment extends Fragment {

    private FragmentMyplantBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyPlantViewModel myPlantViewModel =
                new ViewModelProvider(this).get(MyPlantViewModel.class);

        binding = FragmentMyplantBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        myPlantViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}