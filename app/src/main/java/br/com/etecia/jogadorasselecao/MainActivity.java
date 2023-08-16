package br.com.etecia.jogadorasselecao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Jogadoras> listaJogadoras;

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idRecyclerView = findViewById(R.id.idListaJogadoras);

        listaJogadoras = new ArrayList<>();

        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));
        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));
        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));
        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));
        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));
        listaJogadoras.add(
                new Jogadoras("Letícia Izidoro",
                        "Libertadores da América",
                        "Corinthians",
                        "Goleira",
                        R.drawable.leticia_i));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaJogadoras);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }
}