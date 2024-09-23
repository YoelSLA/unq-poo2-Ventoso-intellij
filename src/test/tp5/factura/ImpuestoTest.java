package test.tp5.factura;

import main.tp5.factura.Impuesto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImpuestoTest {

    private Impuesto IVA;

    @BeforeEach
    public void setUp() {
        IVA = new Impuesto(100.0);
    }

    @Test
    public void testGetPrecio() {
        assertEquals(0, IVA.getPrecio());
    }



}
