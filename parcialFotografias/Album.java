package parcialFotografias;

import java.time.LocalDate;
import java.util.ArrayList;

public class Album extends ElementoFoto{
    private ArrayList<ElementoFoto>elementos;
    

    public Album(String titulo, LocalDate fecha) {
        super(titulo, fecha);
        this.elementos= new ArrayList<>();
    }
    public int getCantidad(){
        int suma=0;
        for(ElementoFoto e: elementos){
            suma+=e.getCantidad();
        }
        return suma;
    }   
    public double getpeso(){
        double suma=0;
        for(ElementoFoto e: elementos){
            suma+= e.getpeso();
        }
        return suma;
    }
    public ArrayList<String>getpersonas(){
        ArrayList<String>personas=new ArrayList<>();
        for(ElementoFoto e :elementos){
            personas.addAll(e.getpersonas());
        }
        return personas;
    }
    public void addElemento(ElementoFoto e){
            this.elementos.add(e);
    }
    public ElementoFoto copia(Condicion c){
        boolean agrego=false;
        Album copia= crearAlbum();
        for(ElementoFoto e:elementos){
            ElementoFoto copiahijo = e.copia(c);
            if(copiahijo!=null){
                copia.addElemento(copiahijo);
                agrego=true;
            }
        }
        if(agrego){
            return copia;
        }
        return null;
    }
    public Album crearAlbum(){
        return new Album(this.getTitulo(),this.getFecha());
    }
}
