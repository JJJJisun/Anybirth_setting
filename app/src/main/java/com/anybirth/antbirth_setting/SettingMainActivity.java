package com.anybirth.antbirth_setting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SettingMainActivity extends AppCompatActivity {

    RelativeLayout setting_user;
    RelativeLayout setting_alram;
    RelativeLayout setting_notice;
    RelativeLayout setting_policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_main);

        setTitle("설정");

        setting_user = (RelativeLayout) findViewById(R.id.setting_user);
        setting_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingMainActivity.this, SettingUserActivity.class);
                startActivity(intent);
            }
        });

        setting_alram = (RelativeLayout) findViewById(R.id.setting_alram);
        setting_alram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingMainActivity.this, SettingAlramActivity.class);
                startActivity(intent);
            }
        });

        setting_notice = (RelativeLayout) findViewById(R.id.setting_notice);
        setting_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingMainActivity.this, SettingNoticeActivity.class);
                startActivity(intent);
            }
        });

        setting_policy = (RelativeLayout) findViewById(R.id.setting_policy);
        setting_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingMainActivity.this, SettingPolicyActivity.class);
                startActivity(intent);
            }
        });

    }
}
