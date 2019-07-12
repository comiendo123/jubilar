package com.example.tbs.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tbs.R;
import com.example.tbs.modelos_datainfo.modelsmisfavoritos;

import java.util.List;

public class adaptersmisfavoritos  extends RecyclerView.Adapter<adaptersmisfavoritos.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenfavorito;
        TextView descripcionfavoritos;
        TextView costofavoritos;
        TextView cantidadfavoritos;
        TextView telefonofavoritos;


        public TextView titfavorito;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descripcionfavoritos = (TextView) itemView.findViewById(R.id.descripcionfavoritos);
            costofavoritos= (TextView) itemView.findViewById(R.id.preciofavoritos);
            cantidadfavoritos = (TextView) itemView.findViewById(R.id.cantidadfavoritos);
            titfavorito= itemView.findViewById(R.id.nombre);
            telefonofavoritos = itemView.findViewById(R.id.descrip);
            imagenfavorito = (ImageView) itemView.findViewById(R.id.imgfavoritos);
        }
    }

    public List<modelsmisfavoritos> listaa;

    public adaptersmisfavoritos(List<modelsmisfavoritos> listaa) {
        this.listaa = listaa;
    }

    @Override
    public adaptersmisfavoritos.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.misfavoritos, parent, false);
        adaptersmisfavoritos.ViewHolder viewHolder = new adaptersmisfavoritos.ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(adaptersmisfavoritos.ViewHolder holder, int position) {
        holder.titfavorito.setText(listaa.get(position).getTitle());
        holder.descripcionfavoritos.setText(listaa.get(position).getDescripcion());
        holder.costofavoritos.setText(listaa.get(position).getCosto());
        holder.imagenfavorito.setImageResource(listaa.get(position).getImg());
        holder.telefonofavoritos.setText(listaa.get(position).getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaa.size();
    }
}



