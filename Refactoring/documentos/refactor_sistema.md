```java
public class Empresa {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Llamada> llamadas = new ArrayList<>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    private static final double DESCUENTO_JUR = 0.15;
    private static final double DESCUENTO_FIS = 0;

    public boolean agregarNumeroTelefono(String str) {
        return guia.agregarNumeroTelefono(str);
    }

    public String obtenerNumeroLibre() {
        return guia.obtenerNumeroLibre();
    }

    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        Cliente cliente = ClienteFactory.crearCliente(tipo, nombre, this.obtenerNumeroLibre(), data);
        clientes.add(cliente);
        return cliente;
    }

    public Llamada registrarLlamada(Cliente origen, Cliente destino, String tipo, int duracion) {
        Llamada llamada = LlamadaFactory.crearLlamada(tipo, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
        llamadas.add(llamada);
        origen.agregarLlamada(llamada);
        return llamada;
    }

    public double calcularMontoTotalLlamadas(Cliente cliente) {
        return cliente.calcularMontoTotalLlamadas();
    }
}

public class Cliente {
    private List<Llamada> llamadas = new ArrayList<>();
    private String tipo;

    public void agregarLlamada(Llamada llamada) {
        this.llamadas.add(llamada);
    }

    public double calcularMontoTotalLlamadas() {
        double total = 0;
        for (Llamada llamada : this.llamadas) {
            total += llamada.calcularCosto(this.tipo);
        }
        return total;
    }
}

public abstract class Llamada {
    protected int duracion;
    public abstract double calcularCosto(String tipoCliente);
}

public class LlamadaNacional extends Llamada {
    @Override
    public double calcularCosto(String tipoCliente) {
        double baseCost = this.duracion * 3 * 1.21; // Incluye IVA
        return baseCost - (baseCost * Cliente.getDescuento(tipoCliente));
    }
}

public class LlamadaInternacional extends Llamada {
    @Override
    public double calcularCosto(String tipoCliente) {
        double baseCost = (this.duracion * 150 + 50) * 1.21; // Incluye IVA y costo de conexión
        return baseCost - (baseCost * Cliente.getDescuento(tipoCliente));
    }
}

public class ClienteFactory {
    public static Cliente crearCliente(String tipo, String nombre, String numeroTelefono, String data) {
        // Implementación concreta de la fábrica basada en el tipo
    }
}

public class LlamadaFactory {
    public static Llamada crearLlamada(String tipo, String numeroOrigen, String numeroDestino, int duracion) {
        // Implementación concreta de la fábrica basada en el tipo de llamada
    }
}

```