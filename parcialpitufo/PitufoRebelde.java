package parcialpitufo;

import java.util.ArrayList;

public class PitufoRebelde extends Pitufo {
    int resta;
    int division;
    public PitufoRebelde(String nombre, int aniosexpe, double velocidad, double creatividad,int resta,int division) {
            super(nombre, aniosexpe, velocidad, creatividad);
            this.resta=resta;
            this.division=division;
    }
    public double getVelocidad(){
        return getVelocidad()-resta;
    }
    public double getCreatividad(){
        return getCreatividad()/division;
    }
    public ArrayList<String>gethabilidades(){
    ArrayList<String>resultado=new ArrayList<>();
        resultado.add(habilidades.get(0));
        return resultado;
    }
    public  Pitufo copiaPitufo(){
        return new PitufoRebelde(this.getNombre(),this.getAniosexpe(),this.getVelocidad(),this.getCreatividad(),resta,division);
    }

    
}

