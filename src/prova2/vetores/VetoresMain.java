package prova2.vetores;

import java.util.Arrays;

public class VetoresMain {
    public static void main(String[] args) {
        Vetores vetores = new Vetores();

        System.out.println("Populando o array A e array B");
        vetores.populaArrayAEArrayB();
        System.out.println("Array 1    : " + Arrays.toString(vetores.getArrayA()));
        System.out.println("Array 2    : " + Arrays.toString(vetores.getArrayB()));

        System.out.println("--------------------------------------------");

        System.out.println("Multiplicação do array A e array B");
        vetores.multiplicaArray(vetores.getArrayA(), vetores.getArrayB(), vetores.getArrayC());

        System.out.println("--------------------------------------------");

        System.out.println("Subtração do array A e array B");
        vetores.subtraiArrays(vetores.getArrayA(), vetores.getArrayB(), vetores.getArrayD());

        System.out.println("--------------------------------------------");

        System.out.println("Imprima Todos os Vetores Gerados:");
        vetores.imprimiArrays();

        System.out.println("--------------------------------------------");

        System.out.println("Média e Soma de Todos os Vetores Gerados:");
        System.out.println("Vetor A:");
        vetores.mediaESoma(vetores.getArrayA());
        System.out.println("--------");
        System.out.println("Vetor B:");
        vetores.mediaESoma(vetores.getArrayB());
        System.out.println("--------");
        System.out.println("Vetor C:");
        vetores.mediaESoma(vetores.getArrayC());
        System.out.println("--------");
        System.out.println("Vetor D:");
        vetores.mediaESoma(vetores.getArrayD());

        System.out.println("--------------------------------------------");

        System.out.println("Maior e Menor Número de Todos os Vetores Gerados:");
        System.out.println("Vetor A:");
        vetores.maiorValor(vetores.getArrayA());
        vetores.menorValor(vetores.getArrayA());
        System.out.println("--------");
        System.out.println("Vetor B:");
        vetores.maiorValor(vetores.getArrayB());
        vetores.menorValor(vetores.getArrayB());
        System.out.println("--------");
        System.out.println("Vetor C:");
        vetores.maiorValor(vetores.getArrayC());
        vetores.menorValor(vetores.getArrayC());
        System.out.println("--------");
        System.out.println("Vetor D:");
        vetores.maiorValor(vetores.getArrayD());
        vetores.menorValor(vetores.getArrayD());
    }
}
