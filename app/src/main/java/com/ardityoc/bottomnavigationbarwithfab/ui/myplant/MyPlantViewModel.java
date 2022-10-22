package com.ardityoc.bottomnavigationbarwithfab.ui.myplant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyPlantViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MyPlantViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("MyPlants");
    }

    public LiveData<String> getText() {
        return mText;
    }
}