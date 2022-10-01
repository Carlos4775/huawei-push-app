package com.unapec.push.demo;

// TODO: import classes from Analytics Kit

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;

public class SettingActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText editFavorSport;
    private String strFavorSport;

// TODO: Define a var for Analytics Instance
    HiAnalyticsInstance instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // TODO: Genarate Analytics Kit Instance
        instance = HiAnalytics.getInstance(this);

        btnSave = (Button)findViewById(R.id.save_setting_button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editFavorSport = (EditText)findViewById(R.id.edit_favoraite_sport);
                strFavorSport = editFavorSport.getText().toString().trim();
                // TODO: save favorite sport by user setUserProperty
                instance.setUserProfile("favor_sport",strFavorSport);
            }
        });
    }
}