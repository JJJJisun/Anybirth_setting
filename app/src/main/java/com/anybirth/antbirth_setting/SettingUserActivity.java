package com.anybirth.antbirth_setting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SettingUserActivity extends AppCompatActivity {

    RelativeLayout user_phone;
    RelativeLayout user_password;
    RelativeLayout user_signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_user);

        setTitle("내 계정");

        user_phone = (RelativeLayout) findViewById(R.id.user_phone);
        user_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingUserActivity.this, SettingUserPhoneActivity.class);
                startActivity(intent);
            }
        });

        user_password = (RelativeLayout) findViewById(R.id.user_password);
        user_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingUserActivity.this, SettingUserPasswordActivity.class);
                startActivity(intent);
            }
        });

        user_signout = (RelativeLayout) findViewById(R.id.user_signout);
        user_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingUserActivity.this, SettingUserSingoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
