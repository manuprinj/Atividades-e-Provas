package trabalho2.campeonatoFutebol;

import trabalho2.EntregarUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static trabalho2.EntregarUtils.sexoAtletaPorExtenso;

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
        for (int i = 0; i < 5; i++) {
            String nome = EntregarUtils.inputString("Digite o nome do atleta "+ (i+1) + ": ");
            int ano = EntregarUtils.inputInt("Digite o ano de nascimento do atleta "+ (i+1) + ": ");
            String sexo = EntregarUtils.digiteSexo();
            int numeroGols = EntregarUtils.inputInt("Digite o número de gols do atleta "+ (i+1) + ": ");

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
        for (int i = 0; i < listaAtletas.size(); i++) {
            System.out.println("Nome Atleta " + (i+1) + ": " + listaAtletas.get(i).getNome());
            System.out.println("Ano de Nascimento Atleta " + (i+1) + ": " + listaAtletas.get(i).getAnoNascimento());
            System.out.println("Sexo Atleta " + (i+1) + ": " + sexoAtletaPorExtenso(listaAtletas.get(i)));
            System.out.println("Número de Gols Atleta " + (i+1) + ": " + listaAtletas.get(i).getNumeroGols());
            System.out.println("-----");
        }
        System.out.println("----------------------------");
    }

    public static String sexoComMaisAtleta() {
        if (numeroMulheres > numeroHomens) {
            return "Feminino";
        } else if (numeroMulheres == numeroHomens){
            return "Ambos os sexos têm a mesma quantidade de atletas";
        } else {
            return "Masculino";
        }
    }

    public static void consultaLista() {
        System.out.println("----------------------------");
        System.out.println("Quantidade Atleta Feminino: " + numeroMulheres);
        System.out.println("Quantidade Atleta Masculino: " + numeroHomens);
        System.out.println("----------------------------");
        System.out.println("Percentual: ");
        System.out.println("Homens: " + ((numeroHomens*100)/numeroAtletas) + "%");
        System.out.println("Mulheres: " + ((numeroMulheres*100)/numeroAtletas) + "%");
        System.out.println("----------------------------");
        System.out.println("Sexo com mais atletas: " + sexoComMaisAtleta());
        System.out.println("----------------------------");
        System.out.println("Atleta com maior numero de gols: " + nomeAtletaMaiorNumeroGols);
        System.out.println("----------------------------");
    }

    public static void menu() {
        System.out.println("  -- Menu -- ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Sair");
        System.out.println("Informe uma opção:");
        opcao = SCANNER.nextInt();
    }
}
