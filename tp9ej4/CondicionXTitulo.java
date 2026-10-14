package tp9ej4;

public class CondicionXTitulo extends Condicion{
    private String titulobuscado;

    @Override
    public boolean cumple(Noticia n) {
        return n.tieneTitulo(titulobuscado);
    }
    
}
