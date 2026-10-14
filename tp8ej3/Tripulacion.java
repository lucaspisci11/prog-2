package tp8ej3;

import java.util.ArrayList;

public class Tripulacion extends Universo{
    private String nombre;
    private ArrayList<Universo>personajes;
    

    public Tripulacion(String nombre) {
        this.nombre = nombre;
        this.personajes= new ArrayList<>();
    }
    @Override
    public double getFuerza() {
        double cantidad=0;
        for(Universo p: personajes){
            cantidad+=p.getFuerza();
        }
        return cantidad;
    }
    @Override
    public int getEdad() {
        int edadmayor=0;
        for(Universo p: personajes){
            int edadactual= p.getEdad();
            if(edadactual>edadmayor){
                edadmayor=edadactual;
            }
        }
        return edadmayor;
    }
    @Override
    public double getpeso() {
        return personajes.get(0).getpeso();
    }

    public void agregar(Universo u) {
    personajes.add(u);
}
}
