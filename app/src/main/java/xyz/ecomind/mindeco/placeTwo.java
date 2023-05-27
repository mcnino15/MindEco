package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class placeTwo extends AppCompatActivity {
    Button buttonback;
    Button nextButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_two);
        nextButtons=(Button)findViewById(R.id.nextButton);
        nextButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placeTwo.this, placeThree.class);
                startActivity(intent);
            }
        });
        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placeTwo.this, placeOne.class);
                startActivity(intent);
            }
        });
    }
}