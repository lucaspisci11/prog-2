package parcial2024;

import java.util.ArrayList;

public class Equipo extends ElementoVenta {
     ArrayList<ElementoVenta>Elemento;

   public Equipo(ArrayList<ElementoVenta> elementos) {
        this.Elemento=new ArrayList<>();
    }

    @Override
    public int getGanaciasProducto() {
        int cantidad=0;
        for (ElementoVenta e: Elemento){
            cantidad+=e.getGanaciasProducto();
        }
        return cantidad;
    }

    @Override
    public int getCantProducto() {
        int cantidad=0;
        for(ElementoVenta e: Elemento){
            cantidad+=e.getCantProducto();
        }
        return cantidad;
    }

    @Override
    public int getCantVenta() {
        int cantidad=0;
        for(ElementoVenta e: Elemento){
            cantidad+=e.getCantVenta();
        }
        return cantidad;
    }

    @Override
    public int getEdad() {
        int contador=0;int total=0;
        for(ElementoVenta e: Elemento){
            total+=e.getEdad();
            contador++;
        }
        return total/contador;
    }
        public void addElemento(ElementoVenta elemento){
        Elemento.add(elemento);
    }

        @Override
        public ArrayList<Vendedor> buscar(Condicion c) {
            ArrayList<Vendedor> resultado= new ArrayList<Vendedor>();
            for(ElementoVenta e: Elemento){
               ElementoVenta aux= e;
             resultado.addAll(aux.buscar(c));
            }
            return resultado;
        }
    
}
