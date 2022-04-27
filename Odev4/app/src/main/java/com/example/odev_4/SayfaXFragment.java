package com.example.odev_4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev_4.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaXBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false);

        tasarim.buttonGitY2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaYGecis2);
        });

        return tasarim.getRoot();
    }
}