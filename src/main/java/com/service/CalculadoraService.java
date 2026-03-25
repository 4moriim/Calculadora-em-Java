package com.service;

import com.model.Operacao;

public class CalculadoraService {

    public Operacao somar(double a, double b) {
        double resultado = a + b;
        return new Operacao("SOMA", a, b, resultado);
    }

    public Operacao subtrair(double a, double b) {
        double resultado = a - b;
        return new Operacao("SUBTRAÇÃO", a, b, resultado);
    }

    public Operacao multiplicar(double a, double b) {
        double resultado = a * b;
        return new Operacao("MULTIPLICAÇÃO", a, b, resultado);
    }

    public Operacao dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        double resultado = a / b;
        return new Operacao("DIVISÃO", a, b, resultado);
    }
}