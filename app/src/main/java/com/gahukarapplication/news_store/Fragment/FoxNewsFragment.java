package com.gahukarapplication.news_store.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.gahukarapplication.news_store.R;
import com.gahukarapplication.news_store.WebViewController;


public class FoxNewsFragment extends Fragment {


    public FoxNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_fox_news, container, false);

        WebView webView = view.findViewById(R.id.webViewfox);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());
        


        return  view;

    }
}