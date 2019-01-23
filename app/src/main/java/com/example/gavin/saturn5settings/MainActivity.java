package com.example.gavin.saturn5settings;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b_wifi;
    private Button b_bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_wifi = (Button) findViewById(R.id.b_wifi);
        b_bluetooth = (Button) findViewById(R.id.b_bluetooth);

        b_wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent wifiSettings = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
                //startActivity(wifiSettings);

                Intent intent = new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK);
                startActivity(intent);

            }
        });

        b_bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bluetoothPicker = new Intent("android.bluetooth.devicepicker.action.LAUNCH");
                startActivity(bluetoothPicker);

            }
        });
    }

}
