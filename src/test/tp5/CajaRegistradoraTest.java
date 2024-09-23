package test.tp5;

import main.tp5.CajaRegistradora;
import main.tp5.producto.ProductoCooperativa;
import main.tp5.producto.ProductoEmpresaTradicional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaRegistradoraTest {

    private CajaRegistradora cajaRegistradora;
    private ProductoCooperativa leche;
    private ProductoEmpresaTradicional azucar;

    @BeforeEach
    public void setUp() {
        leche = new ProductoCooperativa(100.0, 10);
        azucar = new ProductoEmpresaTradicional(200.0, 5);

        cajaRegistradora = new CajaRegistradora();

    }

    @Test
    public void creacionCajaRegistradora() {
        assertEquals(0, cajaRegistradora.getPagables().size());
    }

    @Test
    public void seAgregaUnProductoALaCaja() {
        cajaRegistradora.registrarPagable(leche);

        assertEquals(1, cajaRegistradora.getPagables().size());

    }

    @Test
    public void seCuentaElMontoAPagarPorElCliente() {
        cajaRegistradora.registrarPagable(leche);
        cajaRegistradora.registrarPagable(azucar);

        assertEquals(210.0, cajaRegistradora.montoTotalAPagar());
    }


}
