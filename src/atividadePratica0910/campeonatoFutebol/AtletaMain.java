package atividadePratica0910.campeonatoFutebol;

import utils.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtletaMain {

    static List<Atleta> listaAtletas = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    static int opcao = 0;
    static int numeroAtletas = 0;
    static int numeroMulheres = 0;
    static int numeroHomens = 0;
    static int maiorNumeroGols = 0;
    static String nomeAtletaMaiorNumeroGols = "";
    public static void main(String[] args) {
        while (opcao != 2) {
            menu();
            if (opcao == 1) cadastrar();
        }

    }

    private static void cadastrar() {
        for (int i = 0; i < 2; i++) {
            String nome = InputUtils.inputString("Digite o nome do atleta "+ (i+1) + ": ");
            int ano = InputUtils.inputInt("Digite o ano de nascimento do atleta "+ (i+1) + ": ");
            String sexo = InputUtils.inputString("Digite o sexo do atleta (F ou M) "+ (i+1) + ": ").toUpperCase();
            int numeroGols = InputUtils.inputInt("Digite o número de gols do atleta "+ (i+1) + ": ");

            Atleta atleta = new Atleta(nome,ano, sexo, numeroGols);
            listaAtletas.add(atleta);
            numeroAtletas ++;
            if (sexo.equals("F")) numeroMulheres++;
            if (sexo.equals("M")) numeroHomens++;
            if (numeroGols > maiorNumeroGols) {
                nomeAtletaMaiorNumeroGols = atleta.getNome();
                maiorNumeroGols = numeroGols;
            }
        }
        consultaLista();
        consultaListaTodosAtletas();
    }

    public static void consultaListaTodosAtletas() {
        System.out.println("Dados Atletas: ");
        for (Atleta listaAtleta : listaAtletas) {
            System.out.println("Nome: " + listaAtleta.getNome());
            System.out.println("Ano de Nascimento: " + listaAtleta.getAnoNascimento());
            System.out.println("Sexo: " + listaAtleta.getSexo());
            System.out.println("Número de Gols: " + listaAtleta.getNumeroGols());
        }
    }

    public static void consultaLista() {
        System.out.println("Quantidade Atleta Feminino: " + numeroMulheres);
        System.out.println("Quantidade Atleta Masculino: " + numeroHomens);
        System.out.println("Percentual: ");
        System.out.println("Percentual de Homens: " + (numeroHomens/numeroAtletas));
        System.out.println("Percentual de Mulheres: " + (numeroMulheres/numeroAtletas));
//        System.out.println("Sexo com mais atletas: " + listaAtleta.getSexo());
        System.out.println("Atleta com maior numero de gols: " + nomeAtletaMaiorNumeroGols);
    }

    public static void menu() {
        System.out.println("  -- Menu -- ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Sair");
        System.out.println("Informe uma opção:");
        opcao = SCANNER.nextInt();
    }
}
