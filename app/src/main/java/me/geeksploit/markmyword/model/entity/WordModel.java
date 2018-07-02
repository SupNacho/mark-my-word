package me.geeksploit.markmyword.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class WordModel {
    @PrimaryKey
    private long id;
    private String word;
    private String translate;
    private String description;
    private String imgUri;

    public WordModel(long id, String word, String translate) {
        this.id = id;
        this.word = word;
        this.translate = translate;
        this.description = "";
    }

    @Ignore //temp ignore, need only one constructor for room
    public WordModel(long id, String word, String translate, String description, String imgUri) {
        this(id, word, translate);
        this.description = description;
        this.imgUri = imgUri;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public String getTranslate() {
        return translate;
    }

    public String getDescription() {
        return description;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgUri() {
        return imgUri;
    }
}
