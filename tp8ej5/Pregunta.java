package tp8ej5;

import java.util.ArrayList;

public class Pregunta extends Evaluacion{
    private String enunciado;
    private double puntaje;
    private int tiempoestimado;
    private ArrayList<String>conceptos;

    public Pregunta(String enunciado, double puntaje, int tiempoestimado) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoestimado = tiempoestimado;
        this.conceptos= new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int gettiempoestimado() {
        return tiempoestimado;
    }

    public void setTiempoestimado(int tiempoestimado) {
        this.tiempoestimado = tiempoestimado;
    }

    public ArrayList<String> getConceptos() {
        return new ArrayList<>(conceptos);
    }

    public void addConcepto(String concepto) {
    if (!conceptos.contains(concepto)) {
        conceptos.add(concepto);
    }
}
    
}
