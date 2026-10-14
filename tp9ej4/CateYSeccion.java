package tp9ej4;

import java.util.ArrayList;

import ParcialVentas.Condicion;

public class CateYSeccion extends Administrador{
    private String imagen;
    private String descripcion;
    protected ArrayList<Administrador>contenidos;

    public CateYSeccion(String imagen, String descripcion) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.contenidos=new ArrayList<>();
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Administrador> getContenidos() {
        return new ArrayList<>(contenidos);
    }

    public void addcontenido(Administrador n){
            contenidos.add(n);
    }
    @Override
    public int cantidadanoticias() {
        int cantidad=0;
        for(Administrador n:contenidos){
            cantidad+=n.cantidadanoticias();
        }
        return cantidad;
    }

    @Override
    public ArrayList<Administrador> buscar(Condicion c) {
        ArrayList<Administrador>resultado= new ArrayList<Administrador>();
        for(Administrador n:contenidos){
            Administrador aux=n;
            resultado.addAll(aux.buscar(c));
        }
        return resultado;
    }
    
}
