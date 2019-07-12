package com.example.tbs.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tbs.R;
import com.example.tbs.descripcion_articulo;
import com.example.tbs.modelos_datainfo.modelsmiscitas;

import java.util.List;

public class adaptersmiscitas<context> extends RecyclerView.Adapter<adaptersmiscitas.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgarticulo;

        TextView nombremiscitas;

         TextView fechamiscitas;

         RelativeLayout linea;
         Context context;
        TextView horacita;
        TextView direccioncita;
        TextView vendedor;

        TextView titulo;
        TextView descripcion;
        TextView precio;
        TextView catidad;
        TextView categoria;
        // ImageButton llamadamiscitas;


                public ViewHolder(@NonNull View itemView) {
            super(itemView);
         nombremiscitas = (TextView) itemView.findViewById(R.id.vendedor);
         direccioncita = (TextView) itemView.findViewById(R.id.dirreccion);
         horacita = (TextView) itemView.findViewById(R.id.hora);
         fechamiscitas = (TextView) itemView.findViewById(R.id.fecha);


        titulo = (TextView) itemView.findViewById(R.id.tituloarticulo);
        descripcion= (TextView) itemView.findViewById(R.id.descripcionarticulo);
         imgarticulo = (ImageView) itemView.findViewById(R.id.imgarticulo);
         precio = (TextView) itemView.findViewById(R.id.precioarticulo);
         catidad = (TextView) itemView.findViewById(R.id.cantidadarticulo);
         categoria = (TextView) itemView.findViewById(R.id.categoriaarticulo);


                }
    }

    public List<modelsmiscitas> listaa;

    public adaptersmiscitas(List<modelsmiscitas> listaa) {
        this.listaa = listaa;
    }

    @Override
    public adaptersmiscitas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.miscitas, parent, false);
        adaptersmiscitas.ViewHolder viewHolder = new adaptersmiscitas.ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(adaptersmiscitas.ViewHolder holder, final int position) {
        holder.nombremiscitas.setText(listaa.get(position).getVendedor());
        holder.direccioncita.setText(listaa.get(position).getDireccioncita());
        holder.horacita.setText(listaa.get(position).getHoracita());
        holder.imgarticulo.setImageResource(listaa.get(position).getImg());
        holder.fechamiscitas.setText(listaa.get(position).getFecha());
        holder.titulo.setText(listaa.get(position).getTitulo());
        holder.descripcion.setText(listaa.get(position).getDescripcion());
        holder.precio.setText(listaa.get(position).getPrecio());
        holder.catidad.setText(listaa.get(position).getCatidad());
        holder.categoria.setText(listaa.get(position).getCategoria());






/*        holder.linea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),descripcion_articulo.class);
                intent.putExtra("imagenmiscitas",listaa.get(position).getImg());
           //     intent.putExtra("descrpcionmiscitas",listaa.get(position).getDescrpcion());
                (v.getContext()).startActivity(intent);

            }
        });


*/

        }



    @Override
    public int getItemCount() {
        return listaa.size();
    }
}