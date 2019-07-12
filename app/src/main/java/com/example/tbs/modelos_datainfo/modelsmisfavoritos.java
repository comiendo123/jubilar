package com.example.tbs.modelos_datainfo;

public class modelsmisfavoritos {
    private Integer imgfavoritos;
    private String titulofavoritos;
    private String costofavoritos;
    private String telefonofavorito;
    private String descripcionfavorito;


    public modelsmisfavoritos(String title, String descripcirrron, String est, int coco){

    }
    public modelsmisfavoritos( String titulomisanuncios, String descripcionfavorito, String costofavoritos, String telefonofavorito, int imgfavoritos){

        this.titulofavoritos= titulomisanuncios;
        this.descripcionfavorito=descripcionfavorito;
        this.costofavoritos = costofavoritos;
        this.titulofavoritos= telefonofavorito;
        this.imgfavoritos=imgfavoritos;

    }

    public Integer getImg(){

        return imgfavoritos;
    }
    public void setImg(Integer image)
    {
        this.imgfavoritos = imgfavoritos;
    }

    public String getTitle(){

        return titulofavoritos;
    }

    public void setTitle(String title){
        this.titulofavoritos = titulofavoritos;
    }

    public String getDescripcion(){

        return descripcionfavorito;
    }

    public void setDescripcion(String descripcionfavorito){
        this.descripcionfavorito = descripcionfavorito;
    }

    public String getTelefono(){
        return telefonofavorito;
    }

    public void setTelefono(String telefonofavorito){
        this. telefonofavorito= telefonofavorito;
    }

    public String getCosto(){
        return  costofavoritos;
    }

    public void setCosto(String costomisanuncios){
        this.costofavoritos=costofavoritos;
    }


}
