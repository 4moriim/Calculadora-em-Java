package com.app;

import com.service.CalculadoraService;
import com.model.Operacao;

public class Main {

    public static void main(String[] args) {

        CalculadoraService calc = new CalculadoraService();

        executarOperacao(calc.somar(5, 3));
        executarOperacao(calc.subtrair(10, 4));
        executarOperacao(calc.multiplicar(2, 6));
        executarOperacao(calc.dividir(8, 2));
    }

    private static void executarOperacao(Operacao op) {
        System.out.println("=================================");
        System.out.println("Tipo: " + op.getTipo());
        System.out.println("Valores: " + op.getValor1() + " e " + op.getValor2());
        System.out.println("Resultado: " + op.getResultado());
    }
}