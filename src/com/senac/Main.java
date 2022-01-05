package com.senac;

public class Main {

    public static void main(String[] args) {

        double adicaoNumero1 = 4.7D;
        double adicaoNumero2 = 10.4D;
        resultadoAdicao(adicaoNumero1, adicaoNumero2);

        double subtracaoNumero1 = 7.25D;
        double subtracaoNumero2 = 45.7D;
        resultadoSubtracao(subtracaoNumero1, subtracaoNumero2);

        double multiplicacaoNumero1 = 25.0D;
        double multiplicacaoNumero2 = 47.0D;
        resultadoMultiplicacao(multiplicacaoNumero1, multiplicacaoNumero2);

        double divisaoNumero1 = 100.0D;
        double divisaoNumero2 = 10.0D;
        resultadoDivisao(divisaoNumero1, divisaoNumero2);
    }


    private static void resultadoDivisao(double divisaoNumero1, double divisaoNumero2) {
        System.out.println(divisaoNumero1 / divisaoNumero2);
    }

    private static void resultadoMultiplicacao(double multiplicacaoNumero1, double multiplicacaoNumero2) {
        System.out.println(multiplicacaoNumero1 * multiplicacaoNumero2);
    }

    private static void resultadoSubtracao(double subtracaoNumero1, double subtracaoNumero2) {
        System.out.println(subtracaoNumero1 - subtracaoNumero2);
    }

    private static void resultadoAdicao(double adicaoNumero1, double adicaoNumero2) {
        System.out.println(adicaoNumero1 + adicaoNumero2);
    }
}

