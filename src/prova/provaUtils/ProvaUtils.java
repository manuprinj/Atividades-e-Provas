package prova.provaUtils;

import prova.pessoa.Pessoa;

import java.util.List;
import java.util.Scanner;

public class ProvaUtils {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final String VALOR_INVALIDO = "Valor inválido!";

    public static String digiteSexo() {
        String sexo;
        do {
            System.out.println("Digite o sexo: (F/M)");
            sexo = SCANNER.nextLine().toUpperCase();
        } while (!sexo.equals("F") && !sexo.equals("M"));
        return sexo;
    }

    public static void imprimirDadosPessoa(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sexo: " + sexoPorExtenso(pessoa));
            System.out.println("Ano Nascimento: " + pessoa.getAnoNascimento());
            System.out.println("Salário: " + pessoa.getSalario());
        }
    }

    private static String sexoPorExtenso(Pessoa pessoa) {
        if (pessoa.getSexo().equals("F")){
            return "Feminino";
        } else {
            return "Masculino";
        }
    }

    public static void imprimirIdadePessoa(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            int idade = 2023 - pessoa.getAnoNascimento();
            System.out.println("Idade " + pessoa.getNome() + ": " + idade + " anos");
        }
    }

    public static float inputFloat(String mensagem) {
        Float valor = null;
        while (valor == null) {
            System.out.println(mensagem);
            try {
                valor = Float.parseFloat(SCANNER.nextLine().replace(",", "."));
            } catch (Exception e) {
                System.out.println(VALOR_INVALIDO);
            }
        }
        return valor;
    }

    public static int inputInt(String mensagem) {
        Integer valor = null;
        while (valor == null) {
            System.out.println(mensagem);
            try {
                valor = Integer.parseInt(SCANNER.nextLine());
            } catch (Exception e) {
                System.out.println(VALOR_INVALIDO);
            }
        }
        return valor;
    }

    public static String inputString(String mensagem) {
        String valor = "";
        while (valor.isBlank()) {
            System.out.println(mensagem);
            valor = SCANNER.nextLine();
        }
        return valor;
    }
}
