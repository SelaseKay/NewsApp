package com.gmail.judekwashie70.NewsApp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.parceler.Parcel;
import org.parceler.Parcels;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<News> mNewsList;
    private Context mContext;
    public static final String KEY_NEWS = "keyNews";

    public NewsAdapter(List<News> NewsList, Context context){
        mNewsList = NewsList;
        mContext = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = mNewsList.get(position);
        holder.setUpViewHolder(news);
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public void setNews(List<News> newsList) {
        mNewsList = newsList;
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mNewsTitleTextView;
        private TextView mNewsAuthorTextView;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mNewsTitleTextView = itemView.findViewById(R.id.news_title);
            mNewsAuthorTextView = itemView.findViewById(R.id.news_author);
        }

        public void setUpViewHolder(News news){
            mNewsTitleTextView.setText(news.getTitle());
            mNewsAuthorTextView.setText(news.getAuthor());
        }

        @Override
        public void onClick(View v) {
            News news = mNewsList.get(getLayoutPosition());
            Intent intent = new Intent(mContext, NewsActivity.class);
            intent.putExtra(KEY_NEWS, Parcels.wrap(news));
            mContext.startActivity(intent);

        }
    }

}
