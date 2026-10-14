package tp9ej2;

public class Playlist3600 extends Playlist{
    private int tiempo;
    public Playlist3600(String nombre,int tiempo) {
        super(nombre);
        this.tiempo=tiempo;
    }
    @Override
    public void agregar(Spotify p) {
        if (this.getDuracion() <= tiempo) {
            super.agregar(p);
        }
    }
}

