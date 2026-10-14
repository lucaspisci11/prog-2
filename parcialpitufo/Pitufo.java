package parcialpitufo;

import java.util.ArrayList;

public class Pitufo extends Aldea implements Comparable<Pitufo>{
    private String nombre;
    private  int aniosexpe;
    private  double velocidad;
    private  double creatividad;
    protected ArrayList<String>habilidades;

    public Pitufo(String nombre, int aniosexpe, double velocidad, double creatividad) {
        this.nombre = nombre;
        this.aniosexpe = aniosexpe;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        this.habilidades=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosexpe() {
        return aniosexpe;
    }

    public void setAniosexpe(int aniosexpe) {
        this.aniosexpe = aniosexpe;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(double creatividad) {
        this.creatividad = creatividad;
    }
    public ArrayList<String>getHabilidades(){
    return new ArrayList<String>(habilidades);
    }
    public void addhabilidad(String h){
        if(!habilidades.contains(h)){
            habilidades.add(h);
        }
    }

    @Override
    public int cantidadPitufos(Condicion c) {
        if(c.cumple(this)){
            return 1;
        }
            return 0;
   }

    @Override
    public int compareTo(Pitufo o) {
    int resultado=this.getAniosexpe()-o.getAniosexpe();
        if(resultado==0){
        resultado=Double.compare(this.getVelocidad(),o.getVelocidad());
        }
        if(resultado==0){
            return this.getNombre().compareTo(o.getNombre());
        }
        return resultado;
        
    }

    @Override
    public Aldea getcopiaAldea() {
    Pitufo copia= copiaPitufo();
    for(String h: habilidades){
        copia.addhabilidad(h);
    }
        return copia;
    }
    public  Pitufo copiaPitufo(){
     return new Pitufo(nombre,aniosexpe,velocidad,creatividad);
    }
   
}
