package tp9ej2;

import java.util.ArrayList;

public class Pista extends Spotify{
    private int id;
    private String titulo;
    private int duracion;
    private int anio;
    private  String artista;
    private String tituloalbum;
    private String genero;
    
    public Pista(int id, String titulo, int duracion,int anio, String artista, String tituloalbum, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio=anio;
        this.artista = artista;
        this.tituloalbum = tituloalbum;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTituloalbum() {
        return tituloalbum;
    }

    public void setTituloalbum(String tituloalbum) {
        this.tituloalbum = tituloalbum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public ArrayList<Spotify> buscar(Condicion c) {
        ArrayList<Spotify>resultado=new ArrayList<Spotify>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
    
}
