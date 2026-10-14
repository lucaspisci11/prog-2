package parcialpitufo;


public class PitufosCreativos extends Equipos {

    @Override
    public double getVelocidad() {
    return miembros.get(miembros.size()-1).getVelocidad();
    }

    @Override
    public double getCreatividad() {
        double mayor=0;
    for(Aldea m: miembros){
        double aux=m.getCreatividad();
            if(aux>mayor)
                mayor=aux;
            }
        return mayor;
    }

    @Override
    public Equipos cascaron() {
      return  new PitufosCreativos();
    }

}
