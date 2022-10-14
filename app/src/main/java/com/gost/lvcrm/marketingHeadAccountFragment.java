package com.gost.lvcrm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class marketingHeadAccountFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.create_fragment, container, false);
        Button salesHeadButton = (Button) root.findViewById(R.id.SalesHeadAccountSwitch);
        Button channelPartnerButton = (Button) root.findViewById(R.id.ChannelPartnerAccountSwitch);
        salesHeadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                salesHeadAccountFragment salesHeadAccountFragment = new salesHeadAccountFragment();
                transaction.replace(R.id.container, salesHeadAccountFragment);
                transaction.addToBackStack("name");
                transaction.commit();
            }
        });
        channelPartnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                channelPartnerAccountFragment channelPartnerAccountFragment = new channelPartnerAccountFragment();
                transaction.replace(R.id.container, channelPartnerAccountFragment);
                transaction.addToBackStack("name");
                transaction.commit();
            }
        });
        return root;
    }
}
