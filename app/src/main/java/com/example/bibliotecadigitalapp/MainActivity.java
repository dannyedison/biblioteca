package com.example.bibliotecadigitalapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init ();

    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("Cien años de soledad", "Gabriel García Márquez", R.drawable.cienanios));
        elements.add(new ListElement("El Principito", "Antoine de Saint-Exupéry", R.drawable.elprincipito));
        elements.add(new ListElement("La Vorágine", "José Eustasio Rivera", R.drawable.lavoragine));
        elements.add(new ListElement("El Hueco", "Germán Castro", R.drawable.elhueco));
        elements.add(new ListElement("Como agua para el chocolate", "Laura Esquivel", R.drawable.comoagua));

        ListAdapter listAdapter  = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}
