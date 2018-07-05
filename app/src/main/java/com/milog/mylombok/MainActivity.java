package com.milog.mylombok;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.tv_show);

        test();
    }

    private void test() {
        MyUser user = new MyUser();
        user.setName("setName");
        tvShow.setText(user.getName());
    }

}
