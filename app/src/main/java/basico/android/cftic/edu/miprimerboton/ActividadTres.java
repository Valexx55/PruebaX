package basico.android.cftic.edu.miprimerboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class ActividadTres extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_tres);
        Log.d("MIAPP", "Estoy en oncreate");
        String valor = getResources().getString(R.string.saludo);
        Log.d("MIAPP", "Saludo = " + valor);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //valor
        Log.d("MIAPP", "Estoy en onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MIAPP", "Estoy en onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MIAPP", "Estoy en onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MIAPP", "Estoy en onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MIAPP", "Estoy en destroy");
    }
}
