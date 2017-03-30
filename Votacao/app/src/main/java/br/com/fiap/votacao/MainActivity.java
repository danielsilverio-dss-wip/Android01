package br.com.fiap.votacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgCargo;
    private Spinner spCandidatos;



    private List<Candidato> candidatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
