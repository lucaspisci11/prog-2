package parcialpitufo;

import java.util.ArrayList;

public abstract class Aldea {
  public abstract double getVelocidad();
  public abstract double getCreatividad();
  public abstract ArrayList<String>getHabilidades();
  public abstract int cantidadPitufos(Condicion c);
  public abstract Aldea getcopiaAldea();
}
