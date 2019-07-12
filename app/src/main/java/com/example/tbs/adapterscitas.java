package com.example.tbs;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class adapterscitas extends RecyclerView.Adapter<adapterscitas.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imagenanuncios;

        TextView telefonoanuncios;


        public TextView tit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tit = itemView.findViewById(R.id.nombre);
            telefonoanuncios = itemView.findViewById(R.id.descrip);
            imagenanuncios = (ImageView) itemView.findViewById(R.id.imgenchat);
        }
    }

    public List<modelscitas> listaa;

    public adapterscitas(List<modelscitas> listaa) {
        this.listaa = listaa;
    }

    @Override
    public adapterscitas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menumisamigos, parent, false);
        adapterscitas.ViewHolder viewHolder = new adapterscitas.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(adapterscitas.ViewHolder holder, int position) {
        holder.tit.setText(listaa.get(position).getTitle());


        holder.imagenanuncios.setImageResource(listaa.get(position).getImg());
        holder.telefonoanuncios.setText(listaa.get(position).getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaa.size();
    }



    }