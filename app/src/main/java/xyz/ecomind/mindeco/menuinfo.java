package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuinfo extends AppCompatActivity {
    Button buttonback;
    Button buttoninfo;
    Button buttonlugar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuinfo);
        buttoninfo=(Button)findViewById(R.id.buttoninfo);
        buttonlugar=(Button)findViewById(R.id.buttonlugar);
        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuinfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttoninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuinfo.this, info_datos.class);
                startActivity(intent);
            }
        });
        buttonlugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuinfo.this, placeOne.class);
                startActivity(intent);
            }
        });
    }
}