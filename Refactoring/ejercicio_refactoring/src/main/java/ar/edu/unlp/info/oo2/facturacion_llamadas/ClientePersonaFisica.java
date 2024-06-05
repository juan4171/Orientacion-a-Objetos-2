package ar.edu.unlp.info.oo2.facturacion_llamadas;
public class ClientePersonaFisica extends Cliente{
	private	static final double DESCUENTO = 0;

	private String dni;
	public ClientePersonaFisica(String nombre, String numeroTelefono, String dni){
		super(nombre, numeroTelefono);
		this.dni = dni;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}

	@Override
    public double getDescuento() {
        return ClientePersonaFisica.DESCUENTO;
    }
}