package parcialpitufo;

import java.util.ArrayList;


public abstract class Equipos extends Aldea {
    protected ArrayList<Aldea>miembros;

    public ArrayList<String>getHabilidades(){
        ArrayList<String>resultado=new ArrayList<>();
        for(Aldea m: miembros){
        ArrayList<String>aux=m.getHabilidades();
        for(String h: aux){
            if(!resultado.contains(h)){
                resultado.add(h);
            }
        }
        }
        return resultado;
    }
       public int cantidadPitufos(Condicion c) {
        int suma=0;
        for(Aldea m : miembros){
         suma=+m.cantidadPitufos(c);
        }
        return suma;
   }
   public Aldea getcopiaAldea(){
    Equipos copia=  cascaron();
    for(Aldea m: miembros){
        copia.addmiebros(m.getcopiaAldea());
    }
            return copia;
   }
   public abstract Equipos cascaron();

   public void addmiebros(Aldea m){
        miembros.add(m);
   }
}

