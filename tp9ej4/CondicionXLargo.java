package tp9ej4;

public class CondicionXLargo extends Condicion{
    private int largo;

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length()>largo;
    }

}
