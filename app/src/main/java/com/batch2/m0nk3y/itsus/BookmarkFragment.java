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
        View v =  inflater.inflate(R.layout.fragment_bookmark, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        siteList = new ArrayList<>();

        siteList.add(new AboutUs(
                1,
                "Minhaz Rahman",
                "https://facebook.com/llxx.lord.xxll",
                R.drawable.minhaz));

        siteList.add(new AboutUs(
                1,
                "Fahmi Farzana",
                "20161012010",
                R.drawable.fahmi));

        siteList.add(new AboutUs(
                1,
                "Mahbuba Ani",
                "20161012010",
                R.drawable.oni));
        siteList.add(new AboutUs(
                1,
                "Senjuti Biswas",
                "20161017010",
                R.drawable.minhaz));

        siteList.add(new AboutUs(
                1,
                "Minhaz Rahman",
                "20161012010",
                R.drawable.minhaz));

        siteList.add(new AboutUs(
                1,
                "Fahmi Farzana",
                "20161012010",
                R.drawable.fahmi));

        siteList.add(new AboutUs(
                1,
                "Mahbuba Ani",
                "20161012010",
                R.drawable.oni));
        siteList.add(new AboutUs(
                1,
                "Senjuti Biswas",
                "20161017010",
                R.drawable.minhaz));

        AdapterForAbout adapter = new AdapterForAbout(getActivity(),siteList);

        recyclerView.setAdapter(adapter);



        return  v;
    }

}
