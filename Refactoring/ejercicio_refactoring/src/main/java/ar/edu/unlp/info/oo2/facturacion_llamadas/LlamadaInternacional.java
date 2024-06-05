package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
    private static final double PRECIO_SEGUNDO = 150;
    private static final double ADICIONAL = 50;
    public LlamadaInternacional(String numeroOrigen, String numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }


    @Override
    public double getPrecioSegundo() {
        return PRECIO_SEGUNDO;
    }

    @Override
    public double getAdicional() {
        return ADICIONAL; 
    }
}
