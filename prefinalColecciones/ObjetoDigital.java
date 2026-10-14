package prefinalColecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class ObjetoDigital extends Objeto{

    public ObjetoDigital(String Nombre, String marca, int anio, double valor, double peso) {
        super(Nombre, marca, anio, valor, peso);
        
    }
    
    public double getPeso(){
        return 0;
    }
    public int getAnio(){
        return LocalDate.now().getYear();
    }
    @Override
    public ArrayList<Objeto> Buscar(Condicion c, Comparator<Objeto> comp) {
        ArrayList<Objeto> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public String getMarca() {
        
        return super.getMarca();
    }

    @Override
    public double getValor() {
        
        return super.getValor();
    }

    @Override
    public void setAnio(int anio) {
        
        super.setAnio(anio);
    }

    @Override
    public void setMarca(String marca) {
        
        super.setMarca(marca);
    }

    @Override
    public void setPeso(double peso) {
       
        super.setPeso(peso);
    }

    @Override
    public void setValor(double valor) {
    
        super.setValor(valor);
    }
}
