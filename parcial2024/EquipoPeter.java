package parcial2024;

import java.util.ArrayList;

public class EquipoPeter extends Equipo {

    public EquipoPeter(ArrayList<ElementoVenta> Elemento) {
        super(Elemento);
    }
    
    public int getedad(){ 
            int menor=0;
        if (Elemento.size()>0) {
			menor = Elemento.get(0).getEdad();
        
		    for(ElementoVenta e: Elemento) {
			    int aux = e.getEdad();
			    if (aux<menor) {
				    menor = aux;
			    }
            }
        }
        return menor;
     }
}

