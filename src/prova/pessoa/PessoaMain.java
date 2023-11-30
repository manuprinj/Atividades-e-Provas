package prova.pessoa;

import prova.provaUtils.ProvaUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaMain {
    static List<Pessoa> listaPessoas = new ArrayList<>();
    static int quantidadeTotal = 0;
    static int quantidadeMulheres = 0;
    static int quantidadeHomens = 0;
    static int homemMaisVelho = Integer.MIN_VALUE;
    static String nomeHomemMaisVelho = "";
    static String nomeMulherMaisNova = "";
    static int mulherMaisNova = Integer.MAX_VALUE;
    static float totalSalarios =0;

    public static void main(String[] args) {


        for (int i = 1; i <=6; i++) {
            String nome = ProvaUtils.inputString("Informe o nome da pessoa " + i + ":");
            int anoNascimento = ProvaUtils.inputInt("Informe o ano de nascimento da pessoa " + i + ":");
            String sexo = ProvaUtils.digiteSexo();
            float salario = ProvaUtils.inputFloat("Informe o salário da pessoa " + i + ":");

            Pessoa pessoa = new Pessoa(nome, anoNascimento, sexo, salario);
            listaPessoas.add(pessoa);
            quantidadeTotal++;

            if (Objects.equals(sexo, "F")) {
                int idade = 2023 - anoNascimento;
                if (idade < mulherMaisNova) {
                    nomeMulherMaisNova = nome;
                    mulherMaisNova = idade;
                }
                quantidadeMulheres++;
            } else {
                int idade = 2023 - anoNascimento;
                if (idade > homemMaisVelho) {
                    nomeHomemMaisVelho = nome;
                    homemMaisVelho = idade;
                }
                quantidadeHomens++;
            }

            totalSalarios += salario;
        }

        ProvaUtils.imprimirDadosPessoa(listaPessoas);
        ProvaUtils.imprimirIdadePessoa(listaPessoas);
        imprimirQuantidadeEPercentual();
        imprimirHomemMaisVelho();
        imprimirMulherMaisNova();
        imprimirSalarioEMediaSalarial();
    }

    public static void imprimirQuantidadeEPercentual() {
        float percentualMulheres = (float) (quantidadeMulheres * 100) /quantidadeTotal;
        float percentualHomens = (float) (quantidadeHomens * 100) /quantidadeTotal;

        System.out.println("Quantidade Total: " + quantidadeTotal);
        System.out.println("Quantidade Mulheres: " + quantidadeMulheres);
        System.out.println("Percentual Mulheres: " + percentualMulheres);
        System.out.println("Quantidade Homens: " + quantidadeHomens);
        System.out.println("Percentual Homens: " + percentualHomens);
    }

    public static void imprimirHomemMaisVelho() {
        System.out.println("Homem mais velho: " + nomeHomemMaisVelho);
    }

    public static void imprimirMulherMaisNova() {
        System.out.println("Mulher Mais Nova: " + nomeMulherMaisNova);
    }

    public static void imprimirSalarioEMediaSalarial() {
        float mediaSalarial = totalSalarios/quantidadeTotal;
        System.out.println("Acumulado de todos os salários: R$" + totalSalarios);
        System.out.println("Média Salarial: R$" + mediaSalarial);
    }
}
