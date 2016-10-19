package com.example.android.miwok;

/**
 * Created by venky on 13/8/16.
 */
public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    // Drawable resource ID
    private int mImageResourceId = 0;

    //variable to store audio resourceId

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,  int audioResourceId )
    {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation()
    {
        return  mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public int getAudioResourceId() {

        return mAudioResourceId;
    }
}
