package com.example.communicationpagemad_ass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class ContactPartnerFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View ImageView = null;
        ImageView image = (ImageView).findViewById(R.id.addfriend);

        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Navigation.findNavController(ImageView).navigate(R.id.DestAddFriend);
            }

        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact_partner, container, false);
    }
}