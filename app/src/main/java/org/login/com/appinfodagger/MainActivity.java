package org.login.com.appinfodagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Appinfo appinfo;

    TextView name;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerAppinfoComponent.builder().appinfoModule(new AppinfoModule()).build().inject(this);

        name =  findViewById(R.id.tv_name);
        details =  findViewById(R.id.tv_details);

        name.setText(appinfo.getName());
        details.setText(appinfo.getDetails());
    }
}
