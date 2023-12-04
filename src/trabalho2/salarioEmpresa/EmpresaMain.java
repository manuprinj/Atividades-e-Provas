package trabalho2.salarioEmpresa;

import trabalho2.EntregarUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static trabalho2.EntregarUtils.calculaSalario;
import static trabalho2.EntregarUtils.mostrarInformacoesFuncionario;

public class EmpresaMain {
    static List<Funcionario> listaFuncionarios = new ArrayList<>();
    static int quantidadeMulheres = 0;
    static int quantidadeHomens = 0;
    static int maiorNumeroDeFilhos = 0;
    static String nomeFuncionarioComMaisFilhos = "";
    static int maiorNumeroDeHorasExtras = 0;
    static String nomeFuncionarioComMaisHorasExtras = "";
    static float maiorSalario = 0;
    static String nomeFuncionarioComMaiorSalario = "";

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            String nome = EntregarUtils.inputString("Informe o nome do funcionário " + i + ":");
            String sexo = EntregarUtils.digiteSexo();
            String cargo = EntregarUtils.inputString("Informe o cargo do funcionário " + i + ":");
            float salario = EntregarUtils.inputFloat("Informe o salário do funcionário " + i + ":");
            int horasExtras = EntregarUtils.inputInt("Informe a quantidade de horas extras do funcionário " + i + ":");
            int numeroFilhos = EntregarUtils.inputInt("Informe a quantidade de filhos do funcionário " + i + ":");

            Funcionario funcionario = new Funcionario(nome, sexo, cargo, salario, horasExtras, numeroFilhos);
            listaFuncionarios.add(funcionario);

            if (Objects.equals(sexo, "F")) {
                quantidadeMulheres++;
            } else {
                quantidadeHomens++;
            }

            if (numeroFilhos > maiorNumeroDeFilhos) {
                nomeFuncionarioComMaisFilhos = nome;
                maiorNumeroDeFilhos = numeroFilhos;
            }

            if (horasExtras > maiorNumeroDeHorasExtras) {
                nomeFuncionarioComMaisHorasExtras = nome;
                maiorNumeroDeHorasExtras = horasExtras;
            }

            float salarioFinal = calculaSalario(salario, numeroFilhos, horasExtras);

            if (salarioFinal > maiorSalario) {
                nomeFuncionarioComMaiorSalario = nome;
                maiorSalario = salarioFinal;
            }

        }

        System.out.println("Lista de Funcionários");
        mostrarInformacoesFuncionario(listaFuncionarios);
        System.out.println("---------------------");
        System.out.println("Quantidade de Homens: " + quantidadeHomens);
        System.out.println("Quantidade de Mulheres: " + quantidadeMulheres);
        System.out.println("---------------------");
        System.out.println("Funcionário com Mais Filhos: " + nomeFuncionarioComMaisFilhos);
        System.out.println("---------------------");
        System.out.println("Funcionário com Mais Horas Extras: " + nomeFuncionarioComMaisHorasExtras);
        System.out.println("---------------------");
        System.out.println("Funcionário com Maior Salário: " + nomeFuncionarioComMaiorSalario);
    }
}
