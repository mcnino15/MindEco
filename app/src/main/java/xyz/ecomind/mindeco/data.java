package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
import android.os.Bundle;

public class data extends AppCompatActivity {
    private String username,password;

    // Constructor para asignar datos
    data(String username,String password) {
        this.username = username;
        this.password = password;

    }

    String getNombre() {
        return username;
    }

    String getPass() {
        return password;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }
}