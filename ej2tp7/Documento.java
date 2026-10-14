 package ej2tp7;

import java.util.ArrayList;

public class Documento extends Historiador{

    private String titulo;
    private ArrayList<String>autor;
    private String contenido;
    private ArrayList<String>palabrasclave;

    public Documento(String titulo,String contenido){
        this.titulo=titulo;
        this.contenido=contenido;
        this.autor=new ArrayList<>();
        this.palabrasclave=new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutor() {
        return new ArrayList<>(autor);
    }

    public void setAutor(ArrayList<String> autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getPalabrasclave() {
        return new ArrayList<>(palabrasclave);
    }

    public void setPalabrasclave(ArrayList<String> palabrasclave) {
        this.palabrasclave = palabrasclave;
    }

    @Override
    public ArrayList<Documento> buscar(Condicion c) {
        ArrayList<Documento>resultado=new ArrayList<>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    public boolean tienepalabra(String palabra){
        return this.getTitulo().contains(palabra);
    }
    public boolean tienepalabraclave (String palabraclave){
        return this.getPalabrasclave().contains(palabraclave);
    }
    public boolean contieneautor(String autorbuscado){
        return autor.contains(autorbuscado);
    }
    public boolean contienefrase(String frase){
        return this.getContenido().contains(frase);
    }
    public int cantidadPalabras() {
    return contenido.split(" ").length;
    }
    public void agregarautor(String autornuevo){
        autor.add(autornuevo);
    }
    public void agregarpalabra(String palabra){
        palabrasclave.add(palabra);
    }
}
