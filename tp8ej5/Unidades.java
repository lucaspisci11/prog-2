package tp8ej5;

import java.util.ArrayList;

    public abstract class  Unidades extends Evaluacion{
    
    protected  ArrayList<Evaluacion>unidad;

    public Unidades() {
        this.unidad = new ArrayList<>();
    }

    public abstract double getPuntaje();
    public abstract int gettiempoestimado();

    public void addUnidad(Evaluacion u){
            unidad.add(u);
    }
    @Override
    public ArrayList<String> getConceptos() {
        ArrayList<String> resultado = new ArrayList<>();

        for (Evaluacion e : unidad) {
            for (String concepto : e.getConceptos()) {
                if (!resultado.contains(concepto)) {
                    resultado.add(concepto);
                }
            }
        }

        return resultado;
    }
}
