package com.tablighstudio.webview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Mhd Khalid on 11/8/2018.
 */

public class SliderFragmen extends Fragment { // implements View.OnTouchListener {

    private static final String ARG_PARAM1 = "params";

    private String imageUrls;

    public SliderFragmen() {
    }

    public static SliderFragmen newInstance(String params) {
        SliderFragmen fragment = new SliderFragmen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, params);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrls = getArguments().getString(ARG_PARAM1);

        Uri uri = Uri.parse("android.resource://com.bagicode.www.bagitraveloka/drawable/"+imageUrls);

        View view = inflater.inflate(R.layout.slider_fragmen, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Glide.with(getActivity())
                .load(uri)
                .into(img);

//        img.setOnTouchListener(this);
        return view;
    }

//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        switch (motionEvent.getAction())
//        {
//            case MotionEvent.ACTION_DOWN:
//            {
//                // Here u can write code which is executed after the user touch on the screen
//
//                Toast.makeText(getActivity(), "kllik me down", Toast.LENGTH_SHORT).show();
//                break;
//            }
//            case MotionEvent.ACTION_UP:
//            {
//                // Here u can write code which is executed after the user release the touch on the screen
//
//                Toast.makeText(getActivity(), "kllik me up", Toast.LENGTH_SHORT).show();
//                break;
//            }
//            case MotionEvent.ACTION_MOVE:
//            {
//                // Here u can write code which is executed when user move the finger on the screen
//
//                //Toast.makeText(getActivity(), "kllik me move", Toast.LENGTH_SHORT).show();
//                break;
//            }
//        }
//        return true;
//    }
}