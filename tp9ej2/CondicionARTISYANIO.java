package tp9ej2;

public class CondicionARTISYANIO extends Condicion{
    private int anio;
    private String artista;


    public boolean cumple(Pista e){
        return e.getAnio()==anio && e.getArtista().equals(artista);
    }
}
