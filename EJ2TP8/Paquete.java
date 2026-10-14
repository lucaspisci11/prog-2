package EJ2TP8;

public class Paquete extends Envio {
    private String Destinatario;
    private String CiudadDestino;
    private String Remintente;
    private String DirecRemitente;
    private double Peso;
    private boolean RetiroSucursal;
    
	public Paquete(int tracking, String destinatario, String ciudadDestino, String remintente, String direcRemitente,
			double peso, boolean retiroSucursal) {
		super(tracking);
		Destinatario = destinatario;
		CiudadDestino = ciudadDestino;
		Remintente = remintente;
		DirecRemitente = direcRemitente;
		Peso = peso;
		RetiroSucursal = retiroSucursal;
	}

	public String getDestinatario() {
		return Destinatario;
	}

	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	public String getCiudadDestino() {
		return CiudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		CiudadDestino = ciudadDestino;
	}
	public void setRemintente(String remintente) {
		Remintente = remintente;
	}

	public String getDirecRemitente() {
		return DirecRemitente;
	}

	public void setDirecRemitente(String direcRemitente) {
		DirecRemitente = direcRemitente;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public boolean isRetiroSucursal() {
		return RetiroSucursal;
	}

	public void setRetiroSucursal(boolean retiroSucursal) {
		RetiroSucursal = retiroSucursal;
	}

	@Override
	public String getRemitente() {
		return Remintente;
	}
    
}
