package tp9ej2;

import java.util.ArrayList;

public class PistaTodos extends Pista{


    public PistaTodos(int id, String titulo, int duracion, int anio, String artista, String tituloalbum,
            String genero) {
        super(id, titulo, duracion, anio, artista, tituloalbum, genero);        
    }

        @Override
    public ArrayList<Spotify> buscar(Condicion c) {
        ArrayList<Spotify>resultado=super.buscar(c);
       
        resultado.add(this);
        
        return resultado;
    }
}
