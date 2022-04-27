package com.example.odev_4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev_4.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {

    private FragmentSayfaYBinding  tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false);

        tasarim.buttonGeriGit.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.anaSayfaGecis);

        });

        return tasarim.getRoot();
    }
}