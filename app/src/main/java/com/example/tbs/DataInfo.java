package com.example.tbs;

public class DataInfo  {
    private Integer imgmisanuncios;
    private String titulomisanuncios;
    private String costomisanuncios;
    private String cantidad;
    private String descripcionmisanuncios;
   private String categoria;

    public DataInfo(String title, String descripcirrron, String est, int coco){

    }
    public DataInfo( String titulomisanuncios, String descripcionmisanuncios, String costomisanuncios, String categoria,String cantidad, int imgmisanuncios){

        this.titulomisanuncios= titulomisanuncios;
        this.descripcionmisanuncios=descripcionmisanuncios;
        this.costomisanuncios = costomisanuncios;
        this.cantidad= cantidad;
        this.categoria= categoria;
        this.imgmisanuncios=imgmisanuncios;

    }

    public String getCantidad(){

        return cantidad;
    }
    public void setCantidad(String cantidad)
    {
        this.cantidad = cantidad;
    }

    public Integer getImg(){

        return imgmisanuncios;
    }
    public void setImg(Integer image)
    {
        this.imgmisanuncios = imgmisanuncios;
    }

    public String getTitle(){

        return titulomisanuncios;
    }

    public void setTitle(String title){
        this.titulomisanuncios = titulomisanuncios;
    }

    public String getDescripcion(){

        return descripcionmisanuncios;
    }

    public void setDescripcion(String descripcionmisanuncios){
        this.descripcionmisanuncios = descripcionmisanuncios;
    }

/*    public String getTelefono(){
        return telefonomisanuncios;
    }

    public void setTelefono(String telefonomisanuncios){
        this. telefonomisanuncios= telefonomisanuncios;
    }
*/
    public String getCosto(){
        return  costomisanuncios;
    }

    public void setCosto(String costomisanuncios){
        this.costomisanuncios=costomisanuncios;
    }


    public String getCategoria() {

        return categoria;
    }
    public void  setCategoria(String cateogoria){this.categoria = categoria;}
}