package tp9ej2;

import java.util.ArrayList;

public class PlaylistPromo extends Playlist{
    private Pista promocionada; 
    public PlaylistPromo(String nombre) {
        super(nombre);
    }
@Override
    public ArrayList<Spotify> buscar(Condicion c) {

    ArrayList<Spotify> resultado = super.buscar(c);

    resultado.add(promocionada);
    
    return resultado;
}
}
