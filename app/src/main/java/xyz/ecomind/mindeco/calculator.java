package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class calculator extends AppCompatActivity {

    Button buttongetStart;
    Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        buttongetStart = (Button)findViewById(R.id.getStart);
        buttonback=(Button)findViewById(R.id.backbutton);
        buttongetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calculator.this, calAsk.class);
                startActivity(intent);

            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calculator.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}