package com.test;

import com.service.CalculadoraService;
import com.model.Operacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    CalculadoraService calc = new CalculadoraService();

    @Test
    public void testSoma() {
        Operacao op = calc.somar(5, 3);
        assertEquals(8, op.getResultado());
    }

    @Test
    public void testeFalhaProposital() {
        Operacao op = calc.somar(2, 2);
        assertEquals(10, op.getResultado()); // vai falhar de propósito
    }
}
