package tp8ej5;

public class UnidadSecuencial extends Unidades{

    @Override
    public int gettiempoestimado() {
        int cantidad=0;
        for(Evaluacion u: unidad){
            cantidad+=u.gettiempoestimado();
        }
        return cantidad;
    }

    @Override
    public double getPuntaje() {
          double cantidad=0;
        for(Evaluacion u: unidad){
            cantidad+=u.getPuntaje();
        }
        return cantidad;
    }
    
}
