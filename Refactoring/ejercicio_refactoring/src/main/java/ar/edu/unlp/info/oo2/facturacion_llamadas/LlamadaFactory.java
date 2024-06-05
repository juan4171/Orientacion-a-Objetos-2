package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaFactory {
    public static Llamada crearLlamada(String tipo, String numeroOrigen, String numeroDestino, int duracion) {
        switch (tipo) {
            case "nacional":
                return new LlamadaNacional(numeroOrigen, numeroDestino, duracion);
            case "internacional":
                return new LlamadaInternacional(numeroOrigen, numeroDestino, duracion);
            default:
                throw new IllegalArgumentException("Tipo de llamada no válido");
        }
    }
}
