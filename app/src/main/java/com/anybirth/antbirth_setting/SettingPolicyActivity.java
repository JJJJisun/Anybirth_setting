package com.anybirth.antbirth_setting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SettingPolicyActivity extends AppCompatActivity {

    RelativeLayout company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_policy);

        company = (RelativeLayout) findViewById(R.id.company);
        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingPolicyActivity.this, SettingPolicyCompanyActivity.class);
                startActivity(intent);
            }
        });
    }
}
