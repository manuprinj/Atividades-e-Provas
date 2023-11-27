package atividade1;

import java.util.Scanner;

public class QuatroArraysMain {
    private static final Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        QuatroArrays quatroArrays = new QuatroArrays();

        //Apenas populando os dois primeiros arrays
        quatroArrays.populaArrayUmEArrayDois();

        System.out.println("Quantidade de números pares do array 1");
        quatroArrays.totalPares(quatroArrays.getArrayUm());
        System.out.println("                   ");
        System.out.println("Quantidade de números pares do array 2");
        quatroArrays.totalPares(quatroArrays.getArrayDois());

        System.out.println("--------------------------------------------");
        
        System.out.println("Maior valor Array 1");
        quatroArrays.maiorValor(quatroArrays.getArrayUm());
        System.out.println("                   ");
        System.out.println("Maior valor Array 2");
        quatroArrays.maiorValor(quatroArrays.getArrayDois());

        System.out.println("--------------------------------------------");

        System.out.println("Quantidade de números iguais do array 1 e array 2");
        quatroArrays.totalIguais(quatroArrays.getArrayUm(), quatroArrays.getArrayDois());

        System.out.println("--------------------------------------------");

        System.out.println("Multiplicação do array 1 e array 2");
        quatroArrays.multiplicaArray(quatroArrays.getArrayUm(), quatroArrays.getArrayDois(), quatroArrays.getArrayTres());

        System.out.println("--------------------------------------------");

        System.out.println("Soma do array 1 e array 2");
        quatroArrays.somaArrays(quatroArrays.getArrayUm(), quatroArrays.getArrayDois(), quatroArrays.getArrayQuatro());

        System.out.println("--------------------------------------------");

        System.out.println("Dados do array 1");
        quatroArrays.mostarDados(quatroArrays.getArrayUm());
        System.out.println("                   ");
        System.out.println("Dados do array 2");
        quatroArrays.mostarDados(quatroArrays.getArrayDois());
        System.out.println("                   ");
        System.out.println("Dados do array 3");
        quatroArrays.mostarDados(quatroArrays.getArrayTres());
        System.out.println("                   ");
        System.out.println("Dados do array 4");
        quatroArrays.mostarDados(quatroArrays.getArrayQuatro());

        System.out.println("--------------------------------------------");
        
        System.out.println("Média dos Valores do array 1: ");
        quatroArrays.media(quatroArrays.getArrayUm());
        System.out.println("                   ");
        System.out.println("Média dos Valores do array 2: ");
        quatroArrays.media(quatroArrays.getArrayDois());
        System.out.println("                   ");
        System.out.println("Média dos Valores do array 3: ");
        quatroArrays.media(quatroArrays.getArrayTres());
        System.out.println("                   ");
        System.out.println("Média dos Valores do array 4: ");
        quatroArrays.media(quatroArrays.getArrayQuatro());

        System.out.println("--------------------------------------------");

        System.out.println("Informe o valor que deve ser encontrado na array 1: ");
        int valor1 = scanner.nextInt();
        quatroArrays.buscaArray(valor1, quatroArrays.getArrayUm());
        System.out.println("                   ");
        System.out.println("Informe o valor que deve ser encontrado na array 2: ");
        int valor2 = scanner.nextInt();
        quatroArrays.buscaArray(valor2, quatroArrays.getArrayDois());
        System.out.println("                   ");
        System.out.println("Informe o valor que deve ser encontrado na array 3: ");
        int valor3 = scanner.nextInt();
        quatroArrays.buscaArray(valor3, quatroArrays.getArrayTres());
        System.out.println("                   ");
        System.out.println("Informe o valor que deve ser encontrado na array 4: ");
        int valor4 = scanner.nextInt();
        quatroArrays.buscaArray(valor4, quatroArrays.getArrayQuatro());

        System.out.println("--------------------------------------------");

        System.out.println("Informe o valor que deve ser encontrado em uma das arrays: ");
        int valor = scanner.nextInt();
        quatroArrays.busca(valor);
    }
}
