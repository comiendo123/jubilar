package com.example.tbs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imagenanuncios;
        TextView descripcionanuncios;
        TextView costoanuncios;
        TextView cantidadanuncios;
        TextView categoria;
        ListView listatraslado;

   TextView tit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descripcionanuncios = (TextView) itemView.findViewById(R.id.descripcionarticulo);
            costoanuncios = (TextView) itemView.findViewById(R.id.precioarticulo);
            cantidadanuncios = (TextView) itemView.findViewById(R.id.cantidadarticulo);
            tit = itemView.findViewById(R.id.tituloarticulo);
            categoria = itemView.findViewById(R.id.categoriaarticulo);
            imagenanuncios = (ImageView) itemView.findViewById(R.id.img);
         //   listatraslado = (ListView)itemView.findViewById(R.id.lista);
        }
    }

    public List<DataInfo> listaa;

    public MyAdapter(List<DataInfo> listaa) {
        this.listaa = listaa;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemprincipal, parent, false);
        MyAdapter.ViewHolder viewHolder = new MyAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.cantidadanuncios.setText(listaa.get(position).getCantidad());
        holder.tit.setText(listaa.get(position).getTitle());
        holder.descripcionanuncios.setText(listaa.get(position).getDescripcion());
        holder.costoanuncios.setText(listaa.get(position).getCosto());
        holder.imagenanuncios.setImageResource(listaa.get(position).getImg());
        holder.categoria.setText(listaa.get(position).getCategoria());

    }

    @Override
    public int getItemCount() {
        return listaa.size();
    }


}