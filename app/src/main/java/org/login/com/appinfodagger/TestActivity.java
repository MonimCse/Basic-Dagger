package org.login.com.appinfodagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class TestActivity extends AppCompatActivity {

    @Inject
    Appinfo appinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        DaggerAppinfoComponent.builder().appinfoModule(new AppinfoModule()).build().inject(this);

    }
}
