package com.example.carl.fragmentdemo.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.carl.fragmentdemo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    public void showResult(int id) {
        int images[] = {R.drawable.a1, R.drawable.a2, R.drawable.a3};
        ImageView imageView = (ImageView) getView().findViewById(R.id.imageView);
        imageView.setImageResource(images[id]);
    }
}
