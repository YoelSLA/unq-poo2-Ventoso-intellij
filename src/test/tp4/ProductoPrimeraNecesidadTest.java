package test.tp4;

import main.tp4.producto.ProductoPrimeraNecesidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoPrimeraNecesidadTest {

    private ProductoPrimeraNecesidad leche;

    @BeforeEach
    public void setUp() {

        leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
    }

    @Test
    void testCalcularPrecio() {

        assertEquals(new Double(7.2), leche.getPrecio());
    }
}
