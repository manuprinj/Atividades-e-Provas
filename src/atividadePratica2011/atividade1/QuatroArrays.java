package atividadePratica2011.atividade1;

import java.util.Arrays;

public class QuatroArrays {

    private int[] arrayUm = new int[15];
    private int[] arrayDois = new int[15];
    private int[] arrayTres = new int[15];
    private int[] arrayQuatro = new int[15];
    
    public int geraNumerosAleatorios() {
        return ((int) (Math.random() * 20));
    }

    public void populaArrayUmEArrayDois() {
        for (int i = 0; i < 15; i++) {
            arrayUm[i] = geraNumerosAleatorios();
            arrayDois[i] = geraNumerosAleatorios();
        }
    }
    
    public void totalPares(int[] array) {
        int contagemPar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contagemPar++;
            }
        }

        System.out.println("Tem " + contagemPar + " número(s) par(es) no array.");
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
    
    public void totalIguais(int[] array1, int[] array2) {
        int totalNumerosIguais = 0;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    totalNumerosIguais++;
                }
            }
        }

        System.out.println("A quantidade de números iguais nas duas arrays é: " + totalNumerosIguais);
    }

    public void multiplicaArray(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[i] = array1[i] * array2[j];
                arrayTres[i] = array3[i];
            }
        }

        System.out.println("Array 1    : " + Arrays.toString(array1));
        System.out.println("Array 2    : " + Arrays.toString(array2));
        System.out.println("Array Saída: " + Arrays.toString(arrayTres));
    }

    public void somaArrays(int[] array1, int[] array2, int[] array4) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array4[i] = array1[i] + array2[j];
                array4[i] = arrayQuatro[i];
            }
        }

        System.out.println("Array 1    : " + Arrays.toString(array1));
        System.out.println("Array 2    : " + Arrays.toString(array2));
        System.out.println("Array Saída: " + Arrays.toString(arrayQuatro));
    }
    
    public void mostarDados(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void media(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        System.out.println("A média da array é: " + (soma/array.length));
    }

    public void buscaArray(int numero, int[] array) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                System.out.println("O número " + numero + " foi encontrado na posição " + i + " do array.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("-1");
            System.out.println("O número " + numero + " não foi encontrado no array.");
        }
    }
    
    public void busca(int numero) {
        boolean encontrado = false;
        encontrado = isEncontrado(arrayUm, numero, "1.", encontrado);

        encontrado = isEncontrado(arrayDois, numero, "2.", encontrado);

        encontrado = isEncontrado(arrayTres, numero, "3.", encontrado);

        encontrado = isEncontrado(arrayQuatro, numero, "4.", encontrado);

        if (!encontrado) {
            System.out.println("-1");
            System.out.println("O número " + numero + " não foi encontrado no array.");
        }
    }

    private boolean isEncontrado(int[] arrayUm, int numero, String x, boolean encontrado) {
        for (int i = 0; i < arrayUm.length; i++) {
            if (arrayUm[i] == numero) {
                System.out.println("O número " + numero + " foi encontrado na posição " + i + " do array " + x);
                encontrado = true;
            }
        }
        return encontrado;
    }

    public int[] getArrayUm() {
        return arrayUm;
    }

    public int[] getArrayDois() {
        return arrayDois;
    }

    public int[] getArrayTres() {
        return arrayTres;
    }

    public int[] getArrayQuatro() {
        return arrayQuatro;
    }
}
