package service;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CaffeineBeverageTest {

    private ByteArrayOutputStream out;
    private CaffeineBeverage coffee;
    private CaffeineBeverage tea;

    @Before
    public void before() {

        coffee = new Coffee();
        tea = new Tea();

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testCoffee() {

        coffee.prepareRecipe();

        String resultado = out.toString();

        assertTrue(resultado.contains("Hirviendo agua"));
        assertTrue(resultado.contains("Preparando café"));
        assertTrue(resultado.contains("Sirviendo en la taza"));
        assertTrue(resultado.contains("Agregando azúcar"));
    }

    @Test
    public void testTea() {

        tea.prepareRecipe();

        String resultado = out.toString();

        assertTrue(resultado.contains("Hirviendo agua"));
        assertTrue(resultado.contains("Preparando té"));
        assertTrue(resultado.contains("Sirviendo en la taza"));
        assertTrue(resultado.contains("Agregando miel"));
    }

    @Test
    public void testToString() {

        assertEquals("Coffee", coffee.toString());
        assertEquals("Tea", tea.toString());
    }
}