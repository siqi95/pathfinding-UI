package com.group12.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class PathSettingActivity extends AppCompatActivity {
    private Button settingButton;
    private SeekBar comfortSlide;
    private SeekBar speedSlide;
    int speed, comfort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_setting);
        settingButton = findViewById(R.id.saveSettingButton);
        comfortSlide = findViewById(R.id.comfortSlider);
        speedSlide = findViewById(R.id.speedSlider);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                speed = speedSlide.getProgress();
                comfort = comfortSlide.getProgress();
                Intent intent = new Intent(PathSettingActivity.this,SearchActivity.class);
                Bundle b = new Bundle();
                b.putInt("speed", speed);
                b.putInt("comfort", comfort);
                intent.putExtras(b);
                startActivity(intent);
            }
        }
        );
    }
}

