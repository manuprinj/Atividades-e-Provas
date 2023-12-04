package atividadePratica0910.novaVeneza;

import utils.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizacaoNovaVeneza {
    static List<Visitante> listaVisitantes = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    static int opcao = 0;
    static int numeroVisitantes =0;
    static int numeroMulheres = 0;
    static int numeroHomens = 0;
    static int menoreDe18Anos = 0;
    static int quantidadeCidade = 0;


    public static void main(String[] args) {
        while (opcao != 2) {
            menu();
            if (opcao == 1) cadastrar();
        }

    }

    private static void cadastrar() {
        String nome = InputUtils.inputString("Digite o nome do visitante: ");
        String cpf = InputUtils.getCPF("Digite o CPF do visitante: ");
        String cidade = InputUtils.inputString("Digite a cidade de residência do visitante: ").toUpperCase();
        String sexo = InputUtils.inputString("Digite o sexo do visitante (F ou M): ").toUpperCase();
        String profissao = InputUtils.inputString("Digite a profissão do visitante: ");
        int ano = InputUtils.inputInt("Digite o ano de nascimento do visitante: ");

        Visitante visitante = new Visitante(nome, cpf, cidade, sexo, profissao, ano);
        listaVisitantes.add(visitante);
        numeroVisitantes ++;
        if (sexo.equals("F")) numeroMulheres++;
        if (sexo.equals("M")) numeroHomens++;
        if (ano > 2005) menoreDe18Anos++;
        if (!listaVisitantes.contains(cidade)) quantidadeCidade++;

        desejaContinuarCadastrando();
    }

    private static void desejaContinuarCadastrando() {
        int desejaCadastrarMais = InputUtils.inputInt("Deseja cadastrar outro visitante? 1 - Sim | 2 - Não");

        if (desejaCadastrarMais == 1) {
            cadastrar();
        } else {
            consultaListaOrganizadores();
        }
    }

    public static void consultaListaOrganizadores() {
        System.out.println("Dados Visitantes: ");
        System.out.println("Número total de visitantes: " + numeroVisitantes);
        System.out.println("Número de Homens: " + numeroHomens);
        System.out.println("Número de Mulheres: " + numeroMulheres);
        System.out.println("Percentual: ");
        System.out.println("Percentual de Homens: " + (numeroHomens/numeroVisitantes));
        System.out.println("Percentual de Mulheres: " + (numeroMulheres/numeroVisitantes));
        System.out.println("Quantidade Menor 18 anos: " + menoreDe18Anos);
        System.out.println("Número de cidades visitantes: " + quantidadeCidade);
    }

    public static void menu(){
            System.out.println("  -- Menu -- ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Sair");
            System.out.println("Informe uma opção:");
            opcao = SCANNER.nextInt();
    }
}
