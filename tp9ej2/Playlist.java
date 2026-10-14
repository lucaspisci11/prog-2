package tp9ej2;

import java.util.ArrayList;

public class Playlist extends Spotify{
    private String nombre;
    protected ArrayList<Spotify>pistas;

    public Playlist(String nombre){
        this.nombre=nombre;
        this.pistas= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Spotify> getPistas() {
        return new ArrayList<>(pistas);
    }

    @Override
    public int getDuracion() {
        int total=0;
        for(Spotify e: pistas){
            total+=e.getDuracion();
        }
        return total;
    }
    public void agregar(Spotify p){
            pistas.add(p);
    }
    public void eliminar(Spotify p){
        pistas.remove(p);
    }

    @Override
    public ArrayList<Spotify> buscar(Condicion c) {
        ArrayList<Spotify>resultado= new ArrayList<Spotify>();
        for(Spotify e:pistas){
            Spotify aux=e;
            resultado.addAll(aux.buscar(c));
        }
        return resultado;
    }


}
