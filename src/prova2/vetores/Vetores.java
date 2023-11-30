package prova2.vetores;

import java.util.Arrays;

public class Vetores {
    private final int[] arrayA = new int[40];
    private final int[] arrayB = new int[40];

    private final int[] arrayC = new int[40];
    private final int[] arrayD = new int[40];

    public int geraNumerosAleatorios() {
        return ((int) (Math.random() * 45));
    }

    public void populaArrayAEArrayB() {
        for (int i = 0; i < 40; i++) {
            arrayA[i] = geraNumerosAleatorios();
            arrayB[i] = geraNumerosAleatorios();
        }
    }

    public void multiplicaArray(int[] arrayA, int[] arrayB, int[] array3) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                array3[i] = arrayA[i] * arrayB[j];
                arrayC[i] = array3[i];
                i++;
            }
        }
        System.out.println("Array 1    : " + Arrays.toString(arrayA));
        System.out.println("Array 2    : " + Arrays.toString(arrayB));
        System.out.println("Array Saída: " + Arrays.toString(arrayC));
    }

    public void subtraiArrays(int[] arrayA, int[] arrayB, int[] array4) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 39; j >= 0; j--) {
                array4[i] = arrayA[i] - arrayB[j];
                array4[i] = arrayD[i];
                i++;
            }
        }
        System.out.println("Array 1    : " + Arrays.toString(arrayA));
        System.out.println("Array 2    : " + Arrays.toString(arrayB));
        System.out.println("Array Saída: " + Arrays.toString(arrayD));
    }

    public void imprimiArrays() {
        System.out.println("Array A    : " + Arrays.toString(arrayA));
        System.out.println("Array B    : " + Arrays.toString(arrayB));
        System.out.println("Array C    : " + Arrays.toString(arrayC));
        System.out.println("Array D    : " + Arrays.toString(arrayD));
    }

    public void mediaESoma(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        System.out.println("A soma da array é: " + (soma));
        System.out.println("A média da array é: " + (soma/array.length));
    }

    public void maiorValor(int[] array) {
        int maiorNumeroNaArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maiorNumeroNaArray) {
                maiorNumeroNaArray = array[i];
            }
        }

        System.out.println("O maior número da array é: " + maiorNumeroNaArray);
    }

    public void menorValor(int[] array) {
        int menorNumeroNaArray = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorNumeroNaArray) {
                menorNumeroNaArray = array[i];
            }
        }

        System.out.println("O menor número da array é: " + menorNumeroNaArray);
    }

    public int[] getArrayA() {
        return arrayA;
    }

    public int[] getArrayB() {
        return arrayB;
    }

    public int[] getArrayC() {
        return arrayC;
    }

    public int[] getArrayD() {
        return arrayD;
    }
}
