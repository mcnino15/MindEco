package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView background;
    LinearLayout splashtext,hometext,menus;
    Animation frombottom;

    Button infoButton, interButton, calButton, userButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        background = (ImageView) findViewById(R.id.background);
        splashtext =(LinearLayout) findViewById(R.id.splashtext);
        hometext =(LinearLayout) findViewById(R.id.hometext);
        menus =(LinearLayout) findViewById(R.id.menus);
        infoButton = (Button) findViewById(R.id.infoButton);
        interButton=(Button) findViewById(R.id.interButton);
        calButton = (Button) findViewById(R.id.calButton);
        userButton = (Button) findViewById(R.id.userButton);

        background.animate().translationY(-810).setDuration(500).setStartDelay(800);
        splashtext.animate().translationY(120).alpha(0).setDuration(600).setStartDelay(300);
        hometext.startAnimation(frombottom);
        menus.startAnimation(frombottom);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, menuinfo.class);
                startActivity(intent);
            }
        });
        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, calculator.class);
                startActivity(i);
            }
        });
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                   startActivity(intent);
            }
        });
        interButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, subir.class);
                startActivity(i);
            }
        });
    }
}