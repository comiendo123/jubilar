package com.example.tbs.cosaspacopiar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tbs.R;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class perfildeverdad extends AppCompatActivity {
    RecyclerView recicler ;
    ArrayList<modelperfil> listarecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poiuytr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    listarecycler = new ArrayList<modelperfil>();
    recicler = (RecyclerView) findViewById(R.id.reciclerperfiloficial);
        recicler.setLayoutManager(new LinearLayoutManager(getBaseContext()));
    obtencion();
    adaptersperfil adapter = new adaptersperfil(getContext(), listarecycler);
        recicler.setAdapter(adapter);

}
    public ArrayList<modelperfil> obtencion() {
        List<modelperfil> datos = new ArrayList<>();


        listarecycler.add(new modelperfil("","","","esaz", "telefono",R.drawable.brand));
        listarecycler.add(new modelperfil("","","","esaz", "telefono",R.drawable.brand));
        listarecycler.add(new modelperfil("","","","esaz", "telefono",R.drawable.brand));
        listarecycler.add(new modelperfil("","","","esaz", "telefono",R.drawable.brand));
        listarecycler.add(new modelperfil("","","","esaz", "telefono",R.drawable.brand));
        return listarecycler;

    }

    public static class poiuytr extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_poiuytr);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }
}
