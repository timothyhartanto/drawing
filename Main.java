package com.example.proto.drawing;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {

    DrawIt d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        d = new DrawIt(this);

        setContentView(d);
    }


}
