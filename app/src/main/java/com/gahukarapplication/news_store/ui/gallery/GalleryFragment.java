package com.gahukarapplication.news_store.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.gahukarapplication.news_store.R;
import com.gahukarapplication.news_store.WebViewController;
import com.gahukarapplication.news_store.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        new ViewModelProvider(this).get(GalleryViewModel.class);

    binding = FragmentGalleryBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.webViewAljazera);
        webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}