package parcial2024;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private String codigo;
    private int dni;
    private int monto;
    private int cantvendidas;

    public Venta(LocalDate fecha, String codigo, int dni, int monto, int cantvendidas) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.dni = dni;
        this.monto = monto;
        this.cantvendidas = cantvendidas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCantvendidas() {
        return cantvendidas;
    }

    public void setCantvendidas(int cantvendidas) {
        this.cantvendidas = cantvendidas;
    }
    public int getGanancias(){
        return monto*cantvendidas;
    }
    
}
