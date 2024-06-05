package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
    private static final double PRECIO_SEGUNDO = 3;
    public LlamadaNacional(String numeroOrigen, String numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

    @Override
    public double getPrecioSegundo() {
        return PRECIO_SEGUNDO; 
    }
}

