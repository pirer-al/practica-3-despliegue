package com.ejemplo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ejemplo.mate.Operacion;

public class AppTest 
{
    private static final double DELTA = 1e-15;

    @Test
    public void testSuma() {
        Operacion op = new Operacion(10.5, 5.5);
        assertEquals(16.0, op.sumar(), DELTA);
    }

    @Test
    public void testResta() {
        Operacion op = new Operacion(10.0, 4.0);
        assertEquals(6.0, op.restar(), DELTA);
    }

    @Test
    public void testMultiplicacion() {
        Operacion op = new Operacion(3.0, 7.0);
        assertEquals(21.0, op.multiplicar(), DELTA);
    }

    @Test
    public void testDivision() {
        Operacion op = new Operacion(10.0, 2.0);
        assertEquals(5.0, op.dividir(), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        Operacion op = new Operacion(10.0, 0.0);
        op.dividir();
    }
}