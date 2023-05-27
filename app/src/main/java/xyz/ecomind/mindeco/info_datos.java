package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info_datos extends AppCompatActivity {
    Button buttonback;
    Button buttonyellow;
    Button buttonblue;
    Button buttongreen;
    Button buttonorange;
    Button buttonred;
    Button buttongrey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_datos);
        buttonyellow=(Button)findViewById(R.id.buttonyellow);
        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, menuinfo.class);
                startActivity(intent);
            }
        });
        buttonyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, yellow_basura.class);
                startActivity(intent);
            }
        });
        buttonblue=(Button)findViewById(R.id.buttonblue);
        buttonblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, azul_basura.class);
                startActivity(intent);
            }
        });
        buttongreen=(Button)findViewById(R.id.buttongreen);
        buttongreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, verde_basura.class);
                startActivity(intent);
            }
        });
        buttonorange=(Button)findViewById(R.id.buttonorange);
        buttonorange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, naranja_basura.class);
                startActivity(intent);
            }
        });
        buttonred=(Button)findViewById(R.id.buttonred);
        buttonred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, rojo_basura.class);
                startActivity(intent);
            }
        });
        buttonyellow=(Button)findViewById(R.id.buttonyellow);
        buttonyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, yellow_basura.class);
                startActivity(intent);
            }
        });
        buttongrey=(Button)findViewById(R.id.buttongrey);
        buttongrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_datos.this, gris_basura.class);
                startActivity(intent);
            }
        });
    }
}