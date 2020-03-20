package com.group12.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class PathSettingActivity extends AppCompatActivity {
    private Button settingButton;
    private Switch railSwitch;
    private Switch luasSwitch;
    private Switch busSwitch;
    boolean rail, luas, bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_setting);
        settingButton = findViewById(R.id.saveSettingButton);
        railSwitch = findViewById(R.id.railSwitch);
        luasSwitch = findViewById(R.id.luasSwitch);
        busSwitch = findViewById(R.id.busSwitch);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                rail = railSwitch.isChecked();
                luas = luasSwitch.isChecked();
                bus = busSwitch.isChecked();
                Intent intent = new Intent(PathSettingActivity.this,SearchActivity.class);
                Bundle b = new Bundle();
                b.putBoolean("Rail", rail);
                b.putBoolean("Luas", luas);
                b.putBoolean("Bus", bus);
                intent.putExtras(b);
                startActivity(intent);
            }
        }
        );
    }
}

