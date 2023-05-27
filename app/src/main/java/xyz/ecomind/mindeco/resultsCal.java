package xyz.ecomind.mindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultsCal extends AppCompatActivity {
    TextView res_nev;
    private TextView cal_nev;
    private TextView cal_com;
    private TextView cal_ag;
    private TextView cal_ar;
    private TextView cal_gas;
    private TextView cal_basura;

    Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_cal);
        res_nev=findViewById(R.id.res_nev);
        cal_nev = findViewById(R.id.cal_nev);
        cal_com = findViewById(R.id.cal_com);
        cal_ag = findViewById(R.id.cal_ag);
        cal_ar = findViewById(R.id.cal_ar);
        cal_gas = findViewById(R.id.cal_gas);
        cal_basura = findViewById(R.id.cal_basura);


        ValoresManager valoresManager = ValoresManager.getInstance();
        double pet = valoresManager.getPet();
        double pebd = valoresManager.getPebd();
        double pead = valoresManager.getPead();
        double bopp = valoresManager.getBopp();
        double vidrio = valoresManager.getVidrio();
        double carton = valoresManager.getCarton();
        double lataAl = valoresManager.getLataAl();
        double lataHj = valoresManager.getLataHJ();

        double a = pet + pebd + pead + bopp + vidrio + carton + lataAl + lataHj;
        double resultadoRefri = refri(a);
        double resultadoCombustible = combustible(a);
        double resultadoEmison = emison(a);
        double resultadoAgua = agua(a);
        double resultadoArbol = arbol(a);
        double resultadoCamion = camion(a);
        cal_nev.setText(String.valueOf(resultadoRefri) + " días y noches");
        cal_com.setText(String.valueOf(resultadoCombustible) + " km");
        cal_ag.setText(String.valueOf(resultadoAgua) + " días");
        cal_ar.setText(String.valueOf(resultadoArbol) + " árboles" );
        cal_gas.setText(String.valueOf(resultadoEmison) + " Kg de CO2");
        cal_basura.setText(String.valueOf(resultadoCamion) + " camiones de basura");

        buttonback=(Button)findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(resultsCal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public double refri (double a){
        return a*16;
    }
    public double combustible (double a){
        return a*5.89;
    }
    public double emison (double a){
        return a*1.87;
    }
    public double agua (double a){
        return a*1;
    }
    public double arbol (double a){
        return a*1;
    }
    public double camion (double a){
        return a*0.02;
    }
}