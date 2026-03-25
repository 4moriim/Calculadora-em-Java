package com.model;

public class Operacao {

    private String tipo;
    private double valor1;
    private double valor2;
    private double resultado;

    // Construtor
    public Operacao(String tipo, double valor1, double valor2, double resultado) {
        this.tipo = tipo;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "tipo='" + tipo + '\'' +
                ", valor1=" + valor1 +
                ", valor2=" + valor2 +
                ", resultado=" + resultado +
                '}';
    }
}
