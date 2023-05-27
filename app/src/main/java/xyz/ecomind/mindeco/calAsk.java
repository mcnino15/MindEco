package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calAsk extends AppCompatActivity {
    Button buttonextButton;
    Button buttonback;
    private EditText editTextPet;
    private EditText editTextPebd;
    private EditText editTextPead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_ask);
        buttonextButton = (Button) findViewById(R.id.nextButtons);
        editTextPet = findViewById(R.id.editTextPet);
        editTextPebd = findViewById(R.id.editTextPebd);
        editTextPead = findViewById(R.id.editTextPead);
        buttonextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pet = Double.parseDouble(editTextPet.getText().toString());
                double pebd = Double.parseDouble(editTextPebd.getText().toString());
                double pead = Double.parseDouble(editTextPead.getText().toString());

                ValoresManager valoresManager = ValoresManager.getInstance();
                valoresManager.setPet(pet);
                valoresManager.setPebd(pebd);
                valoresManager.setPead(pead);

                Intent intent = new Intent(calAsk.this, calAskII.class);
                startActivity(intent);
            }
        });
        buttonback = (Button) findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calAsk.this, calculator.class);
                startActivity(intent);
            }
        });
    }

}