package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calAskII extends AppCompatActivity {
    Button nextButtons;
    private EditText editTextBopp;
    private EditText editTextVidrio;
    private EditText editTextCarton;

    Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_ask_ii);
        nextButtons=(Button)findViewById(R.id.nextButton);
        editTextBopp= findViewById(R.id.editTextBopp);
        editTextVidrio=findViewById(R.id.editTextVidrio);
        editTextCarton=findViewById(R.id.editTextCarton);
        nextButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bopp = Double.parseDouble(editTextBopp.getText().toString());
                double vidrio = Double.parseDouble(editTextVidrio.getText().toString());
                double carton = Double.parseDouble(editTextCarton.getText().toString());

                ValoresManager valoresManager = ValoresManager.getInstance();
                valoresManager.setBopp(bopp);
                valoresManager.setVidrio(vidrio);
                valoresManager.setCarton(carton);
                Intent intent = new Intent(calAskII.this, calAskIII.class);
                startActivity(intent);
            }
        });
        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calAskII.this, calAsk.class);
                startActivity(intent);
            }
        });
    }
}