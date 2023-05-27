package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calAskIII extends AppCompatActivity {
    Button buttongetResult;
    Button buttonbackButton;
    private EditText editTextLataAL;
    private EditText editTextLataHJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_ask_iii);
        buttongetResult=(Button)findViewById(R.id.getResults);
        buttonbackButton=(Button)findViewById(R.id.backButton);
        editTextLataAL= findViewById(R.id.editTextLataAl);
        editTextLataHJ=findViewById(R.id.editTextLataHJ);

        buttongetResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calAskIII.this, resultsCal.class);
                startActivity(intent);
                double lataAl = Double.parseDouble(editTextLataAL.getText().toString());
                double lataHj = Double.parseDouble(editTextLataHJ.getText().toString());

                ValoresManager valoresManager = ValoresManager.getInstance();
                valoresManager.setLataAl(lataAl);
                valoresManager.setLataHJ(lataHj);


            }
        });
        buttonbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calAskIII.this, calAskII.class);
                startActivity(intent);
            }
        });

    }
}