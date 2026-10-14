package parcialSectores;

public class CondicionPalabra extends Condicion {
    private String palabra1;
    private String palabra2;
    @Override
    public boolean cumple(Municipio e) {
     return (e.tienePalabra(palabra1) || e.tienePalabra(palabra2)); 
    }
    
}
