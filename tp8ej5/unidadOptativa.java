package tp8ej5;

public class unidadOptativa extends Unidades{

    @Override
    public double getPuntaje() {
        double mayor=0;
        for(Evaluacion u: unidad){
            double actual= u.getPuntaje();
            if (actual>mayor) {
                mayor=actual;
            }
        }
        return mayor;
    }

    @Override
    public int gettiempoestimado() {
            int mayor=0;
        for(Evaluacion u: unidad){
            int actual= u.gettiempoestimado();
            if (actual>mayor) {
                mayor=actual;
            }
        }
        return mayor;
    }
    
}
