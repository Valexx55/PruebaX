package basico.android.cftic.edu.miprimerboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String TAG_LOG = "MIAPP";


    //PARTE FUNCIONAL O DINÁMICA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ImageView imageView = findViewById(R.id.);
        //imageView.setImageResource(R.drawable.vamos_rafa);
        //R.drawable.baseline_3d_rotation_black_

    }



    public void botonDarLaVuelta(View view)
    {
        //TODO GESTIONAR EL EVENTO DEL BOTÓN
        //int id_vista = view.getId();
        //RECOGER EL TEXTO INTRODUCIDO
        EditText editText = this.findViewById(R.id.texto_usuario);//cojo la caja
        String texto_introducido = editText.getText().toString();//leo el contenido
        Log.d("MIAPP", "Texto intro = " + texto_introducido);
        //DAR LA VUELTA
        String cad_reves = MainActivity.cadenaReves(texto_introducido);

        //MOSTRARLO
        TextView caja_destino = findViewById(R.id.caja_destino);
        caja_destino.setText(cad_reves);


        //casting de String a float

        float peso = Float.parseFloat("34.9");
        int peso2 = Integer.parseInt("54");

    }

    private static String cadenaReves (String cadena){

        String cadenaInvertida = "";
        int longuitud = cadena.length()-1;

        for (int x=longuitud; x>=0; x--) { //cojemos y enpezamos por el final de la cadena (length - 1)

            //cadenaInvertida += cadena.charAt(x);
            cadenaInvertida = cadenaInvertida + cadena.charAt(x); //y vamos añadiendo caracter por caracter a la nueva cadena
        }

        return cadenaInvertida;
    }




    private static String cadenaReves2 (String cadena){

        String cadenaInvertida = null;

            StringBuilder stringBuilder = new StringBuilder(cadena);
            cadenaInvertida = stringBuilder.reverse().toString();


        return cadenaInvertida;
    }
}
