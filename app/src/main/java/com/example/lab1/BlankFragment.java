package com.example.lab1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment extends Fragment {
fragmentList mlist;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mlist=(fragmentList) context;
    }

    public BlankFragment() {


    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_blank, container, false);

        Button btn=rootview.findViewById(R.id.btn);
        btn.setOnClickListener(View->
        {
            if(mlist!=null)
            {
                mlist.sendMessageToActivity("Message From Fragment");
            }
        });

                return rootview;
    }
    public interface fragmentList {
        void sendMessageToActivity(String messageFromFragment);
    }
}