package parcialpitufo;

public class PitufosRapidos extends Equipos {

    @Override
public double getVelocidad() {
    double velmayor=0;
    for(Aldea m:miembros){
        double aux=m.getVelocidad();
        if (aux>velmayor) {
            velmayor=aux;
        }
    }
    return velmayor;
}

    @Override
    public double getCreatividad() {
        if(!miembros.isEmpty()){
        return miembros.get(0).getCreatividad();
        }
        return 0;
    }
      @Override
    public Equipos cascaron() {
      return  new PitufosRapidos();
    }
} 
