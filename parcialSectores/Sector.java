package parcialSectores;

import java.util.ArrayList;

import prefinalColecciones.Sistema;

public class Sector extends Municipio{

    private ArrayList<Municipio>elementos;
    public Sector() {
        elementos = new ArrayList<>();
    }

    @Override
    public double getVolumen() {
    double suma=0;
    for(Municipio e : elementos){
        suma+=e.getVolumen();
    }
        return suma;
    }

    @Override
    public double getPeso() {
        double suma=0;
        for(Municipio e: elementos){
            suma+=e.getPeso();
        }
             return suma;
    }

    @Override
    public int getPedidos() {
        int suma=0;
        for(Municipio e: elementos){
            suma+=e.getPedidos();
        }
        return suma;
   }

    @Override
  public boolean tienePalabra(String p) {
    for (Municipio e : elementos) {
        if (e.tienePalabra(p)) {
            return true;
        }
    }
    return false;
}
    public void addElemento(Municipio e){
         elementos.add(e);
    }

    @Override
    public ArrayList<Pedidos> buscar(Condicion c) {
    ArrayList<Pedidos>resultado=new ArrayList<Pedidos>();
        for(Municipio e: elementos){
        Municipio aux= e;
        resultado.addAll(aux.buscar(c));
         }
        return resultado;
    }
}
