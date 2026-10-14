package parcialFotografias;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fotografia extends ElementoFoto{
    private int id;
    private double peso;
    private ArrayList<String>personas;
    


    public Fotografia(String titulo , int id, double peso, LocalDate fecha) {
        super(titulo,fecha);
        this.id = id;
        this.peso = peso;
        this.personas =new ArrayList<>();
    }
    public int getCantidad(){
        return 1;
    }
    public double getpeso(){
        return peso;
    }
    public ArrayList<String>getpersonas() {
        return new ArrayList<>(personas);
    }
    public void addpersona(String persona){
        if(!personas.contains(persona)){
           this.personas.add(persona);
        }
    }
    public ElementoFoto copia(Condicion c){
        if(c.cumple(this)){
         Fotografia copia=new Fotografia(this.getTitulo(),this.getId(),this.getPeso(),this.getFecha());
         for(String p: personas){
            copia.addpersona(p);
         }
         return copia;
        }
        return null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean personaaparece(String p){
        return this.personas.contains(p);
    }

}
