package parcialFotografias;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoFoto implements Comparable<ElementoFoto> {
    private String titulo;
    private LocalDate fecha;

    public ElementoFoto(String titulo, LocalDate fecha){
        this.titulo = titulo;
        this.fecha = fecha;
    }
    public abstract int getCantidad();
    public abstract double getpeso();
    public abstract ArrayList<String>getpersonas();
    public abstract ElementoFoto copia(Condicion c);
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int compareTo(ElementoFoto e){
        int resultado=this.getFecha().compareTo(e.getFecha());
        if (resultado==0) {
         return Double.compare(this.getpeso(),e.getpeso());
        }
        return resultado;
    }
}
