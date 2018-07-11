package com.milog.mylombok;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import lombok.experimental.ExtensionMethod;
import lombok.var;

@ExtensionMethod({Ext.class})
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

        var a = 10;


        String str = null;
        Ext.or(str, "x");
        tvShow.setText(str.or("HELLO WORLD".toTitleCase()));

    }

}
