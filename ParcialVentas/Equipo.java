package ParcialVentas;

import java.util.ArrayList;

public class Equipo extends ElementoVenta {
    ArrayList<ElementoVenta> elementos;

    public Equipo(ArrayList<ElementoVenta> elementos) {
        this.elementos=new ArrayList<>();
    }
    public void addElemento(ElementoVenta elemento){
        elementos.add(elemento);
    }
    @Override
    public int getCantidadVentas() {
    int suma=0;
    for(ElementoVenta e: elementos){
        suma+=e.getCantidadVentas();
    }
    return suma;
    }

    @Override
    public int getCantidadProductos() {
       int suma=0;
       for(ElementoVenta e: elementos){
        suma+=e.getCantidadProductos();
       }
       return suma;
    }

    @Override
    public double getGanacias() {
        double ganacias=0;
        for(ElementoVenta e: elementos){
            ganacias+=e.getGanacias();
        }
        return ganacias;
    }

    @Override
    public int getEdad() {
        int edadtotal=0;
    for(ElementoVenta e: elementos){
        edadtotal+=e.getEdad();
    }
    if(elementos.size()>0){
      return  edadtotal/elementos.size();
        }
        else{
            return 0;
        }
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado= new ArrayList<Vendedor>();
        for(ElementoVenta v : elementos){
           ElementoVenta aux= v;
             resultado.addAll(aux.buscar(c));
        }
        return resultado;
    }


}
