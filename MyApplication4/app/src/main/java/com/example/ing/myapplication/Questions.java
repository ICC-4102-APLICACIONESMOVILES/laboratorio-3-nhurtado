package com.example.ing.myapplication;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by ING on 10-04-2018.
 */

@Entity
public class Questions {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int formId;
    private String formName;

    public Questions() {
    }

    public int getQuestionId() { return formId; }
    public void setQuestionId (int formId) { this.formId = formId; }
    public String getQuestionName() { return formName; }
    public void setQuestionName (String formName) { this.formName = formName; }
}
