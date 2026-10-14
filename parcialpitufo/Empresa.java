package parcialpitufo;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
    private ArrayList<Pitufo>reserva;
    
public Pitufo getPitufo(){
    Collections.sort(reserva);
    return reserva.get(0);
}
}
