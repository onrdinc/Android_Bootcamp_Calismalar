package com.example.odev_4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev_4.databinding.FragmentAnaSayfaBinding;


public class AnaSayfaFragment extends Fragment {
    private FragmentAnaSayfaBinding tasarim;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false);

        tasarim.buttonGitA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaAGecis);
        });
        tasarim.buttonGitX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaXGecis);
        });

        return tasarim.getRoot();
    }
}