package ParcialVentas;

import java.util.ArrayList;

public class EquipoPeter extends Equipo {

    public EquipoPeter(ArrayList<ElementoVenta> elementos) {
        super(elementos);
    }
    
    public int getedad(){ 
            int menor=0;
        if (elementos.size()>0) {
			menor = elementos.get(0).getEdad();
        
		    for(ElementoVenta e: elementos) {
			    int aux = e.getEdad();
			    if (aux<menor) {
				    menor = aux;
			    }
            }
        }
        return menor;
     }
}



