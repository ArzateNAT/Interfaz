package mx.unam.primera.com.interfaz10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner categoria_sp,evento_sp;
    ArrayAdapter data_categoria_sp,data_evento_sp;
    List<String> list_categoria_sp,list_evento_sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoria_sp=(Spinner)findViewById(R.id.spinner);
        evento_sp=(Spinner)findViewById(R.id.spinner2);

        list_categoria_sp = new ArrayList<String>();
        list_evento_sp = new ArrayList<String>();
        list_categoria_sp.add("Elige una Categoria...");
        list_categoria_sp.add("Futbol Soccer");
        list_categoria_sp.add("Futbol Americano");
        list_categoria_sp.add("Basketball");
        list_categoria_sp.add("Conciertos");
        list_categoria_sp.add("Eventos Especiales");

        list_evento_sp.add("Cruz Azul VS Chivas");
        list_evento_sp.add("Monterrey VS Tigres");
        list_evento_sp.add("Atlas VS Pachuca");

        data_categoria_sp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list_categoria_sp);
        data_evento_sp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list_evento_sp);

        data_categoria_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        data_evento_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        categoria_sp.setAdapter(data_categoria_sp);
        evento_sp.setAdapter(data_evento_sp);


        categoria_sp.setOnItemSelectedListener(this);
        evento_sp.setOnItemSelectedListener(this);



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

