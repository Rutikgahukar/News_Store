package com.gahukarapplication.news_store.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.gahukarapplication.news_store.R;
import com.gahukarapplication.news_store.WebViewController;


public class SkyNewsFragment extends Fragment {


    public SkyNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sky_news, container, false);

        WebView webView = view.findViewById(R.id.WebViewSky);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new WebViewController());


        return view;
    }
}