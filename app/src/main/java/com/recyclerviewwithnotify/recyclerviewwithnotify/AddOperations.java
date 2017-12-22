package com.recyclerviewwithnotify.recyclerviewwithnotify;

import android.widget.TextView;

/**
 * Created by smartron on 21/12/17.
 */

public class AddOperations {

    public AddOperations(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = value1+value2;
    }

    private int value1;
    private int value2;
    private int result;


    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
