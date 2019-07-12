package com.example.tbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class descripcion_articulo extends AppCompatActivity {

    //no olvidar traer los datos
/*    ImageView imageView;
    TextView descripcion;
    String añadirdescripcion;
    Integer añadirimagen;
*/
    Integer image;
    String descrip, title;

    ImageView image2;
    TextView descrip2, title2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_articulo);
    /*    imageView=findViewById(R.id.imageview);
        descripcion=findViewById(R.id.descripcion);*/

   //este es el oficial
        image2=findViewById(R.id.imageview);
        descrip2=findViewById(R.id.adicional);
        title2=findViewById(R.id.tituloarticulo);
//trae elementos de la anterior pagina
/*
        añadirimagen=getIntent().getIntExtra("imagenmiscitas",0);
        añadirdescripcion=getIntent().getStringExtra("descrpcionmiscitas");
        imageView.setImageResource(añadirimagen);
        descripcion.setText(añadirdescripcion);
*/
//este es el oficial
        image=getIntent().getIntExtra("img",0);
        descrip=getIntent().getStringExtra("descripcion");
        title=getIntent().getStringExtra("title");

        image2.setImageResource(image);
        descrip2.setText(descrip);
        title2.setText(title);
    }
    public void crearcita (View v){
        Intent btncrearcita = new Intent(this, realizarcita.class);
        startActivity(btncrearcita);
    }
    public void perfil_vendedor (View v){
        Intent btnperfilvendedor = new Intent(this, perfilvendedor.class);
        startActivity(btnperfilvendedor);
    }

    public void ir_chat (View v){
        Intent btnirchat = new Intent(this, chatprincipal.class);
        startActivity(btnirchat);
    }
}
