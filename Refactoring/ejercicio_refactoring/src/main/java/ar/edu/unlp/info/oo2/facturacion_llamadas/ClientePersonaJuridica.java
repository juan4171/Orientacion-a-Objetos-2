package ar.edu.unlp.info.oo2.facturacion_llamadas;
public class ClientePersonaJuridica extends Cliente{
	private static final double DESCUENTO = 0.15;

	private String cuit;
	public ClientePersonaJuridica(String nombre, String numeroTelefono, String cuit){
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return ClientePersonaJuridica.DESCUENTO;
	}
}