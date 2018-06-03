package com.example.android.miwok;

/**
 * {@link word} represents a vocabulary word that the user wants to learn.
 * It containts a defalult translation and a Miwok translation for that word
 */

public class Word {

    //    Default translation for the word
    private String mDefaultTranslation;

    //    Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Creante new Word object
     *
     * @param defaultTranslation is the word in a language that a user is alreasy familiar with
     *
     * @param mywokTranslation is the word in the Mywok translation
     */

    public Word(String defaultTranslation, String mywokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = mywokTranslation;
    }

    /**
     * Get the default translation of the word
     */

    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}


