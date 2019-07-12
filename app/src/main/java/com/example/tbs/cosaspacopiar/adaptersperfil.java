package com.example.tbs.cosaspacopiar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tbs.DataInfo;
import com.example.tbs.MyAdapter;
import com.example.tbs.R;

import java.security.AccessControlContext;
import java.util.List;

public class adaptersperfil extends RecyclerView.Adapter<adaptersperfil.ViewHolder> {

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

    public List<modelperfil> listaa;

    public adaptersperfil(AccessControlContext context, List<modelperfil> listaa) {
        this.listaa = listaa;
    }

    @Override
    public adaptersperfil.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_perfilees, parent, false);
        adaptersperfil.ViewHolder viewHolder = new adaptersperfil.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(adaptersperfil.ViewHolder holder, int position) {
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