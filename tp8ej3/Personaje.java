package tp8ej3;

public class Personaje extends Universo{
    private String nombre;
    private int edad;
    private double peso;
    private double fuerza;
    private static int fuerzadefecto;
    private Fruta fruta;

    public Personaje(int edad, double peso, double fuerza, boolean comiofruta, int fuerzadefecto, Fruta fruta,String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.fuerza = fuerza;
        this.fuerzadefecto = fuerzadefecto;
        this.fruta=fruta;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFuerza() {
        if(fruta==null){
            return fuerzadefecto;
        }
        return fruta.calcularFuerza(peso);
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFuerzadefecto() {
        return fuerzadefecto;
    }

    public void setFuerzadefecto(int fuerzadefecto) {
        this.fuerzadefecto = fuerzadefecto;
    }

    @Override
    public double getpeso() {
        return peso;
    }


    
    
}
