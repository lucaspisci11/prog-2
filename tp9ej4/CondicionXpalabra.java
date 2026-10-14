package tp9ej4;

public class CondicionXpalabra extends Condicion{
    private String palabra1;
    private String palabra2;
    @Override
    public boolean cumple(Noticia n) {
        return n.contienePalabra(palabra1) && n.contienePalabra(palabra2);
    }
    
}
