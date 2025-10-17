package test.java;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
public class FiguraTest {
    @Test public void testCalcularArea() { Figura figura = new Figura("Triangulo"); assertEquals(10.0, figura.calcularArea(4.0, 5.0)); assertEquals(0.0, figura.calcularArea(0.0, 5.0)); }
    @Test public void testCambiarNombre() { Figura figura = new Figura("Circulo"); assertEquals("Nuevo", figura.cambiarNombre("Nuevo")); assertNull(figura.cambiarNombre("")); assertNull(figura.cambiarNombre(null)); }
    @Test public void testEsCuadrado() { Figura figura = new Figura("Cuadrado"); assertTrue(figura.esCuadrado(5.0, 5.0)); assertTrue(figura.esCuadrado(0.0, 0.0)); assertFalse(figura.esCuadrado(5.0, 3.0)); }
}