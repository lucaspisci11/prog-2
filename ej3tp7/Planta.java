package ej3tp7;

import java.util.ArrayList;

public class Planta extends Vivero{
    private String nombre;
    private String clasificacion;
    private String familia;
    private String clase;
    private String tipoplanta;
    private int riego;
    private int sol;
    private ArrayList<String>nombresvulgares;
    
    public Planta(String nombre, String clasificacion, String familia, String clase, String tipoplanta, int riego,
            int sol) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.tipoplanta = tipoplanta;
        this.riego = riego;
        this.sol = sol;
        this.nombresvulgares= new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getTipoplanta() {
        return tipoplanta;
    }
    public void setTipoplanta(String tipoplanta) {
        this.tipoplanta = tipoplanta;
    }
    public int getRiego() {
        return riego;
    }
    public void setRiego(int riego) {
        this.riego = riego;
    }
    public int getSol() {
        return sol;
    }
    public void setSol(int sol) {
        this.sol = sol;
    }
    public ArrayList<String> getNombresvulgares() {
        return new ArrayList<>(nombresvulgares);
    }
    public boolean tienepalabraennombre (String palabra){
        return this.getNombre().contains(palabra);
    }
    public boolean contienevulgar (String palabra){
        return nombresvulgares.contains(palabra);
    }
    @Override
    public ArrayList<Planta> buscar(Condicion c) {
        ArrayList<Planta>resultado= new ArrayList<>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
    public void agregar (String palabra){
        nombresvulgares.add(palabra);
    }
}
