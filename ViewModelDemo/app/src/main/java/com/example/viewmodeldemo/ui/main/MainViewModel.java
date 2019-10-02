package com.example.viewmodeldemo.ui.main;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private static final Float usd_to_eu_rate = 0.74F;
    private String dollarText = "";
    private Float result = 0F;


    public void setAmount(String value) {
        this.dollarText = value;
        result = Float.valueOf(dollarText) * usd_to_eu_rate;
    }

    public Float getResult() {
        return result;
    }
}
