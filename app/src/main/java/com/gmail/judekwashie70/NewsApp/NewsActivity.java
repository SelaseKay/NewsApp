package com.gmail.judekwashie70.NewsApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NewsActivity extends AppCompatActivity {
    private TextView mTitle1TextView;
    private TextView mTitle2TextView;
    private ImageView mImageView;
    private TextView mDescriptionTextView;
    private TextView mAuthorTextView;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        mTitle2TextView = findViewById(R.id.news_activity_title_2);
        mImageView = findViewById(R.id.news_image);
        mDescriptionTextView = findViewById(R.id.news_description);
        mAuthorTextView = findViewById(R.id.news_activity_author);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        setViews();

    }

    private void setViews(){
        Intent getIntent = getIntent();
        News news = Parcels.unwrap(getIntent.getParcelableExtra(NewsAdapter.KEY_NEWS));
        mTitle2TextView.setText(news.getTitle());
        mDescriptionTextView.setText(news.getNewsDescription());
        mAuthorTextView.setText(news.getAuthor());
        getSupportActionBar().setTitle(news.getTitle());
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        if (!news.getImage().isEmpty())
            Picasso.get().load(news.getImage()).into(mImageView);
    }

}
