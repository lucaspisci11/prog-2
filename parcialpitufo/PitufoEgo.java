package parcialpitufo;

import java.util.ArrayList;

public class PitufoEgo extends Pitufo {
    int multiplicador;
    public PitufoEgo(String nombre, int aniosexpe, double velocidad, double creatividad,int multiplicador) {
        super(nombre, aniosexpe, velocidad, creatividad);
        this.multiplicador=multiplicador;
    }
    public double getCreatividad(){
        return getCreatividad()*multiplicador;
    }
    public double getVelocidad(){
        return getVelocidad()*multiplicador;
    }
    public int getAniosexpe(){
        return getAniosexpe()*multiplicador;
    }
     public  Pitufo copiaPitufo(){
        return new PitufoEgo(this.getNombre(),this.getAniosexpe(),this.getVelocidad(),this.getCreatividad(),multiplicador);
    }


    
}
