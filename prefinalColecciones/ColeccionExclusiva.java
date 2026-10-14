package prefinalColecciones;
import java.util.ArrayList;
import java.util.Comparator;

public class ColeccionExclusiva extends Colecciones {

    public ColeccionExclusiva(String Nombre,double porcentajeExtra) {
        super(Nombre, porcentajeExtra); 
    }

    @Override
    public boolean contiene(Objeto o) {
        return false; // nunca contiene nada
    }

    @Override
    public ArrayList<Objeto> Buscar(Condicion c, Comparator<Objeto> comp) {
        return new ArrayList<>(); // siempre lista vacía
    }

    @Override
    public int getCantidadObjetos() {
        return 0; // para efectos de porcentaje extra, no suma objetos
    }

    @Override
    public double getValor() {
        return 0; // valor 0, no aporta al total
    }

    @Override
    public double getPeso() {
        return 0; // peso 0
    }

    @Override
    public int getAnio() {
        return 0; // puede devolver 0 o algún valor neutro
    }
}
