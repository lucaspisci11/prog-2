package tp9ej4;

import java.util.ArrayList;

import ParcialVentas.Condicion;

public class Noticia extends Administrador{
    private String titulo;
    private ArrayList<String> palabrasClaves;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClaves= new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }
    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int cantidadanoticias() {
        return 1;
    }
    public void addpalabra(String p){
        palabrasClaves.add(p);
    }

    @Override
    public ArrayList<Administrador> buscar(Condicion c) {
        ArrayList<Administrador>resultado= new ArrayList<Administrador>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    public boolean contienePalabra(String palabra){
        return getPalabrasClaves().contains(palabra);
    }

    public boolean tieneTitulo(String titulo) {
    return this.titulo.equals(titulo);
    }
}
