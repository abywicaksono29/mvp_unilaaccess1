package com.tablighstudio.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mhd Khalid on 11/8/2018.
 */

public class FragmenMain extends Fragment {

    private SliderAdapter mAdapter;
    private IndicatorSilde mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;
    private RelativeLayout menu1, menu2, menu3, menu4, menu5, menu6;

    public FragmenMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_activity, container, false);
        // Inflate the layout for this fragment
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu1 = (RelativeLayout) rootView.findViewById(R.id.menu1);
        menu2 = (RelativeLayout) rootView.findViewById(R.id.menu2);
        menu3 = (RelativeLayout) rootView.findViewById(R.id.menu3);
        menu4 = (RelativeLayout) rootView.findViewById(R.id.menu4);
        menu5 = (RelativeLayout) rootView.findViewById(R.id.menu5);
        menu6 = (RelativeLayout) rootView.findViewById(R.id.menu6);


        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), sso.class);
                startActivity(goPindah);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), vclass.class);
                startActivity(goPindah);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), kkn.class);
                startActivity(goPindah);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), siakad.class);
                startActivity(goPindah);
            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), simanila.class);
                startActivity(goPindah);
            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), unila.class);
                startActivity(goPindah);
            }
        });
        // jika internet aktfif
        setupSliderOfline();

        return rootView;
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();

        mAdapter = new SliderAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new IndicatorSilde(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    private void setupSliderOfline() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(SliderFragmen.newInstance("unila_rektorat1"));
        fragments.add(SliderFragmen.newInstance("unila_rektorat1"));
        fragments.add(SliderFragmen.newInstance("unila_rektorat1"));
        fragments.add(SliderFragmen.newInstance("unila_rektorat1"));

        mAdapter = new SliderAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new IndicatorSilde(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

}