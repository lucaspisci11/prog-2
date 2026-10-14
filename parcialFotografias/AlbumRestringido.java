package parcialFotografias;

import java.time.LocalDate;

public class AlbumRestringido extends Album {
    private int max;
    public AlbumRestringido(String titulo, LocalDate fecha,int max){
        super(titulo, fecha);
        this.max=max;
    }
    
    @Override
    public void addElemento(ElementoFoto e) {
            if (this.getCantidad()+e.getCantidad()<max){
               super.addElemento(e);
            }
    }
    @Override
    public Album crearAlbum() {
    return new AlbumRestringido(this.getTitulo(),this.getFecha(),this.getMax());
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
