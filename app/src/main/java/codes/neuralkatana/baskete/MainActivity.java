package codes.neuralkatana.baskete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import codes.neuralkatana.baskete.logic.Time;

public class MainActivity extends AppCompatActivity {
    private Time timeA;
    private Time timeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeA = new Time();
        timeB = new Time();

        //TimeA
        Button botaoTresPontosTimeA = findViewById(R.id.tresPontosA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeA();
            }
        });

        Button botaoDoisPontosTimeA = findViewById(R.id.doisPontosA);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeA();
            }
        });

        Button botaoUmPontoTimeA = findViewById(R.id.tiroLivreA);
        botaoUmPontoTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoTimeA();
            }
        });

        //TIME B
        Button botaoTresPontosTimeB = findViewById(R.id.tresPontosB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeB();
            }
        });

        Button botaoDoisPontosTimeB = findViewById(R.id.doisPontosB);
        botaoDoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeB();
            }
        });

        Button botaoUmPontoTimeB = findViewById(R.id.tiroLivreB);
        botaoUmPontoTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoTimeB();
            }
        });

    }
    /*
                        TIME A
     */
    public void mostrarPlacarTimeA(int pontuacao){
        TextView placarTimeA = findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeA(){
        timeA.tresPontos();
        mostrarPlacarTimeA(timeA.getPontuacaoTime());
    }

    public void addDoisPontosTimeA(){
        timeA.doisPontos();
        mostrarPlacarTimeA(timeA.getPontuacaoTime());
    }

    public void addUmPontoTimeA(){
        timeA.tiroLivre();
        mostrarPlacarTimeA(timeA.getPontuacaoTime());
    }

    /*
                    TIME B
     */
    public void mostrarPlacarTimeB(int pontuacao){
        TextView placarTimeB = findViewById(R.id.placarTimeB);
        placarTimeB.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeB(){
        timeB.tresPontos();
        mostrarPlacarTimeB(timeB.getPontuacaoTime());
    }

    public void addDoisPontosTimeB(){
        timeB.doisPontos();
        mostrarPlacarTimeB(timeB.getPontuacaoTime());
    }

    public void addUmPontoTimeB(){
        timeB.tiroLivre();
        mostrarPlacarTimeB(timeB.getPontuacaoTime());
    }

}
