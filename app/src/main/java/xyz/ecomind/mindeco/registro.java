package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class registro extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    Button buttonRegister;
    Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (guardarCuenta(username, password)) {
                    Toast.makeText(registro.this, "Cuenta registrada exitosamente", Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intent = new Intent(registro.this, login.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(registro.this, "Error al registrar la cuenta", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro.this, login.class);
                startActivity(intent);
            }
        });
    }

    private boolean guardarCuenta(String username, String password) {
        try {
            String data = username + "," + password;
            FileOutputStream fileOutputStream = openFileOutput("cuentas.txt", Context.MODE_APPEND);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.write(System.getProperty("line.separator").getBytes());
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}