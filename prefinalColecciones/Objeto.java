package prefinalColecciones;

import java.util.ArrayList;
import java.util.Comparator;

public class Objeto extends Sistema{
    private String marca;
    private int anio;
    private double valor;
    private double peso;
    
    public Objeto( String Nombre,String marca, int anio, double valor, double peso) {
        super(Nombre);
        this.marca = marca;
        this.anio = anio;
        this.valor = valor;
        this.peso = peso;
    }

    @Override
    public int getAnio() {
        return anio;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int getCantidadObjetos() {   
                return 1;
    }
    
    @Override
public boolean equals(Object o) {
    if (this == o) {
        return true;
    }

    if (o == null) {
        return false;
    }

    if (this.getClass() != o.getClass()) {
        return false;
    }

    Objeto otro = (Objeto) o;

    if (this.anio != otro.anio) {
        return false;
    }

    if (this.valor != otro.valor) {
        return false;
    }

    if (this.peso != otro.peso) {
        return false;
    }

    if (!this.Nombre.equals(otro.Nombre)) {
        return false;
    }

    if (!this.marca.equals(otro.marca)) {
        return false;
    }

    return true;
    }
    @Override
        public boolean contiene(Objeto o) {
         return this.equals(o);
    }

    @Override
    public ArrayList<Objeto> Buscar(Condicion c, Comparator<Objeto> comp) {
        ArrayList<Objeto>resultado=new ArrayList<Objeto>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }    
}
