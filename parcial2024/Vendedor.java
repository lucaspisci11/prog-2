package parcial2024;

import java.util.ArrayList;

public class Vendedor extends ElementoVenta{
    private  String nombre;
    private String apellido;
    private  int edad;
    private ArrayList<Venta>Ventas;

    public Vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Ventas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Venta> getVentas() {
        return new ArrayList<>(Ventas);
    }

    @Override
    public int getGanaciasProducto() {
        int cantidad=0;
        for(Venta v: Ventas){
            cantidad+=v.getGanancias();
        }
        return  cantidad;
    }

    @Override
    public int getCantProducto() {
        int cantidad=0;
        for(Venta v: Ventas){
            cantidad+=v.getCantvendidas();
        }
        return  cantidad;
    }

    @Override
    public int getCantVenta() {
        return Ventas.size();
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado=new ArrayList<Vendedor>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
    public boolean vendisteA(String codigoBuscado) {
    for (int i = 0; i < Ventas.size(); i++) {
        if (Ventas.get(i).getCodigo().equalsIgnoreCase(codigoBuscado)) {
            return true;
        }
    }
    return false;
}
}
