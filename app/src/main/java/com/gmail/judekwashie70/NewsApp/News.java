package com.gmail.judekwashie70.NewsApp;

import org.parceler.Parcel;

@Parcel
public class News {
    private String mTitle;
    private String mAuthor;
    private String mNesDescription;
    private String mImage;

    News(){

    }

    News(String title, String author, String newsDescription, String image){
        mTitle = title;
        mAuthor = author;
        mNesDescription = newsDescription;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getNewsDescription() {
        return mNesDescription;
    }

    public String getImage(){
        return mImage;
    }
}
