package com.example.tbs.modelos_datainfo;

import android.widget.ImageButton;

public class modelsmiscitas {

    private String fechamiscitas;
    private String horacita;
    private String direccioncita;
    private String vendedor;


    private Integer imgproductocitas;
    private String titulo;
    private String descripcion;
    private String precio;
    private String catidad;
    private String categoria;


    //   private ImageButton llamarmiscita;

   /* public modelsmiscitas(String fecha, String hora, String direccion, int img, String vendr, String titulo, String descripcion, String precio, String catidad, String categoria) {

    }*/

    public modelsmiscitas(String fechamiscitas, String horacita, String direccioncita,  String vendedor, String titulo, String descripcion, String precio, String catidad, String categoria,int imgmiscitas) {//,ImageButton llamarmiscita){

        this.fechamiscitas = fechamiscitas;
        this.horacita = horacita;
        this.direccioncita = direccioncita;
        this.vendedor = vendedor;

        this.imgproductocitas = imgmiscitas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.catidad = catidad;
        this.categoria = categoria;

    }
public String getVendedor(){return vendedor;}

public void setVendedor(String vendedor){
        this.vendedor = vendedor;
}
    public Integer getImg() {
        return imgproductocitas;
    }

    public void setImg(Integer image) {
        this.imgproductocitas = imgproductocitas;
    }


    public String getFecha() {

        return fechamiscitas;
    }

    public void setFecha(String fechamiscitas) {
        this.fechamiscitas = fechamiscitas;
    }


    public String getHoracita() {
        return horacita;
    }

    public void setHoracita(String horacita) {
        this.horacita = horacita;
    }

    public String getDireccioncita() {
        return direccioncita;
    }

    public void setDireccioncita(String direccioncita) {
        this.direccioncita = direccioncita;
    }






    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getCatidad() {
        return catidad;
    }
    public void setCatidad(String catidad) {
        this.catidad = catidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    }

