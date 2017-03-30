package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{

    private Spinner spSabor;
    private ArrayAdapter<PizzaBean> adpSabor;
    private List<PizzaBean> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spSabor = (Spinner) findViewById(R.id.spSabor);
        obterPizzas();
        exibeSabores();
        spSabor.setOnItemSelectedListener(this);
    }

    private void exibeSabores(){

        adpSabor = new ArrayAdapter<PizzaBean>(this,
                android.R.layout.simple_spinner_item,
                pizzas);
        spSabor.setAdapter(adpSabor);


    }

    private void obterPizzas(){

        pizzas = new ArrayList<PizzaBean>();
        pizzas.add(new PizzaBean("bacon",           10.0, R.drawable.pizzabacon));
        pizzas.add(new PizzaBean("Carbonara",       10.0, R.drawable.pizzacarbonara));
        pizzas.add(new PizzaBean("Pancia del Nono", 10.0, R.drawable.pizzapancianono));
        pizzas.add(new PizzaBean("Queijo",          10.0, R.drawable.pizzaqueijo));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(view.getId() == R.id.spFormaPagto){
            // nada
        } else if(view.getId() == R.id.spSabor){
            PizzaBean sel = (PizzaBean) parent.getItemAtPosition(position);
            Toast.makeText(this, sel.getSabor(), Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
