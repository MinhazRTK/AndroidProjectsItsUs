package com.batch2.m0nk3y.itsus;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BookmarkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    List<AboutUs> siteList;
    RecyclerView recyclerView;


    public BookmarkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BookmarkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BookmarkFragment newInstance(String param1, String param2) {
        BookmarkFragment fragment = new BookmarkFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bookmark, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        siteList = new ArrayList<>();

        siteList.add(new AboutUs(
                1,
                "Google",
                "https://google.com",
                R.drawable.google_logo));

        siteList.add(new AboutUs(
                1,
                "Gmail",
                "https://gmail.com",
                R.drawable.gmail_logo));

        siteList.add(new AboutUs(
                1,
                "Yahoo!",
                "https://yahoo.com",
                R.drawable.yahoo_logo));
        siteList.add(new AboutUs(
                1,
                "Yahoo Mail",
                "https://ymail.com",
                R.drawable.ymail_logo));

        siteList.add(new AboutUs(
                1,
                "Facebook",
                "https://facebook.com",
                R.drawable.fb_logo));

        siteList.add(new AboutUs(
                1,
                "Outlook",
                "https://live.com",
                R.drawable.outlook_logo));

        siteList.add(new AboutUs(
                1,
                "Youtube",
                "https://youtube.com",
                R.drawable.youtube_logo));
        siteList.add(new AboutUs(
                1,
                "Bikroy.com",
                "https://bikroy.com",
                R.drawable.bikroy_logo));

        AdapterForAbout adapter = new AdapterForAbout(getActivity(), siteList);

        recyclerView.setAdapter(adapter);


        return v;
    }

}
