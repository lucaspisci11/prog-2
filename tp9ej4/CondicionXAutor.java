package tp9ej4;

public class CondicionXAutor extends Condicion{
    private String nombreautor;

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(nombreautor);
    }
}
