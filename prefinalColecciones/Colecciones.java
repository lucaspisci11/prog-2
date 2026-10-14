package prefinalColecciones;

import java.util.ArrayList;
import java.util.Comparator;

public class Colecciones extends Sistema{
    private ArrayList<Sistema>colecciones;
    private static double porcentajeExtra = 0.001;

    public Colecciones(String Nombre, double porcentajeExtra) {
        super(Nombre);
        this.porcentajeExtra=porcentajeExtra;
    }

    @Override
    public int getAnio() {
        int suma = 0;
        int division = 0;
        for (Sistema e : colecciones) {
            int anio = e.getAnio();
            if (anio > 0) {
                suma += anio;
                division++;
            }
        }
        if (division == 0) {
            return 0;
            }
            return suma / division;
    }
    public double getValor() {
        double suma = 0;
        int cantidadObjetos = 0;

        for (Sistema s : colecciones) {
            suma += s.getValor();
            cantidadObjetos += s.getCantidadObjetos(); // importante: contar todos los niveles
        }

        // suma del porcentaje
        double adicional = suma * porcentajeExtra * cantidadObjetos;

        return suma + adicional;
    }

    
    public int getCantidadObjetos() {
        int total = 1; // se cuenta a sí misma si corresponde
        for (Sistema s : colecciones) {
            total += s.getCantidadObjetos();
        }
        return total;
    }

    @Override
    public double getPeso() {
        double total=0;
        for(Sistema e : colecciones){
            total+= e.getPeso();
        }
        return total;
    }
        @Override
    public boolean contiene(Objeto o) {
        for (Sistema e : colecciones) {
            if (e.contiene(o)) {
                return true;
            }
        }
        return false;
    }

        @Override
        public ArrayList<Objeto> Buscar(Condicion c, Comparator<Objeto> comp) {
        ArrayList<Objeto>resultado=new ArrayList<Objeto>();
        for(Sistema o : colecciones){
            Sistema aux=o;
            resultado.addAll(aux.Buscar(c,comp));
            resultado.sort(comp);
        }
            return resultado;
        }


}
