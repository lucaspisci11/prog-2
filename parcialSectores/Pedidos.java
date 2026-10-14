package parcialSectores;

import java.util.ArrayList;

public class Pedidos extends Municipio{
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private double Peso;
    private double Volumen;
    private ArrayList<String>claves;

    public Pedidos(String nombre, String apellido, String direccion, double peso, double volumen) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Peso = peso;
        Volumen = volumen;
        this.claves = new ArrayList<>();
    }

    public void addElemento(String p){
             claves.add(p);
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double volumen) {
        Volumen = volumen;
    }
    public ArrayList<String>getPalabras(){
        return new ArrayList<>(claves);
    }

    @Override
    public int getPedidos() {
        return 1;
    }

    @Override
  public boolean tienePalabra(String p) {
    for (String clave : claves) {
        if (clave.equals(p)) { 
            return true;
        }
    }
    return false;
}

    @Override
    public ArrayList<Pedidos> buscar(Condicion c) {
        ArrayList<Pedidos>resultado=new ArrayList<Pedidos>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
}
