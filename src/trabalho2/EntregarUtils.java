package trabalho2;


import trabalho2.campeonatoFutebol.Atleta;
import trabalho2.controleMedicacoes.Medicamento;
import trabalho2.controleMedicacoes.Status;
import trabalho2.salarioEmpresa.Funcionario;
import utils.InputUtils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class EntregarUtils {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final String VALOR_INVALIDO = "Valor inválido!";

    public static void administracao(List<Medicamento> listaMedicamentos) {
        String nomeMedicamento = InputUtils.inputString("Digite o nome do medicamento: ");
        Medicamento medicamento = buscaMedicamento(listaMedicamentos,nomeMedicamento);
        if (medicamento != null) {
            if (medicamento.getQuantidade() < medicamento.getQuantidadeDose()) {
                System.out.println("Não há quantidade suficiente para esta dose!");
            } else {
                System.out.println("Medicamento Administrado com sucesso!");
                medicamento.setQuantidade(medicamento.getQuantidade() - medicamento.getQuantidadeDose());
                medicamento.setStatus(Status.ADMINISTRADO);
            }
        } else {
            System.out.println("Medicamento não encontrado!");
        }
    }

    public static void reset(List<Medicamento> listaMedicamentos) {
        for (Medicamento medicamento : listaMedicamentos) {
            medicamento.setStatus(Status.AGUARDANDO);
        }
    }

    public static void mostrarInformacoesMedicamentos(List<Medicamento> medicamentos) {
        for (Medicamento medicamento : medicamentos) {
            System.out.println("Nome Medicamento: " + medicamento.getNome());
            System.out.println("Quantidade: " + medicamento.getQuantidade());
            System.out.println("Quantidade por dose: " + medicamento.getQuantidadeDose());
            System.out.println("Hora: " + medicamento.getHora());
            System.out.println("Status: " + medicamento.getStatus());
        }
    }

    public static Medicamento buscaMedicamento(List<Medicamento> listaMedicamentos, String nomeMedicamento) {
        for (Medicamento listaMedicamento : listaMedicamentos) {
            if (listaMedicamento.getNome().contains(nomeMedicamento)) {
                return listaMedicamento;
            }
        }
        return null;
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

    public static int inputInt() {
        Integer valor = null;
        while (valor == null) {
            try {
                valor = Integer.parseInt(SCANNER.nextLine());
            } catch (Exception e) {
                System.out.println(VALOR_INVALIDO);
            }
        }
        return valor;
    }

    public static LocalTime inputLocalTime(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String input = SCANNER.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                return LocalTime.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato de horário inválido. Use o formato HH:mm:ss");
            }
        }
    }

    public static String inputString(String mensagem) {
        String valor = "";
        while (valor.isBlank()) {
            System.out.println(mensagem);
            valor = SCANNER.nextLine();
        }
        return valor;
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

    public static float calculaSalario(float salarioBase, int numeroFilhos, int horasExtras) {
        return (float) ((salarioBase) + (23.50 * numeroFilhos) + (39.50 * horasExtras));
    }

    public static void mostrarInformacoesFuncionario(List<Funcionario> listaFuncionarios) {
        for (Funcionario listaFuncionario : listaFuncionarios) {
            System.out.println("Nome do Funcionário: " + listaFuncionario.getNome());
            System.out.println("Sexo: " + sexoFuncionarioPorExtenso(listaFuncionario));
            System.out.println("Salário Base: R$" + listaFuncionario.getSalarioBase());
            System.out.println("Horas Extras: " + listaFuncionario.getHorasExtras());
            System.out.println("Número de Filhos: " + listaFuncionario.getNumeroFilhos());
            System.out.println("Salário Final: R$" + calculaSalario(listaFuncionario.getSalarioBase(), listaFuncionario.getNumeroFilhos(), listaFuncionario.getHorasExtras()));
        }
    }

    private static String sexoFuncionarioPorExtenso(Funcionario funcionario) {
        if (funcionario.getSexo().equals("F")){
            return "Feminino";
        } else {
            return "Masculino";
        }
    }

    public static String sexoAtletaPorExtenso(Atleta atleta) {
        if (atleta.getSexo().equals("F")){
            return "Feminino";
        } else {
            return "Masculino";
        }
    }

    public static String digiteSexo() {
        String sexo;
        do {
            System.out.println("Digite o sexo: (F/M)");
            sexo = SCANNER.nextLine().toUpperCase();
        } while (!sexo.equals("F") && !sexo.equals("M"));
        return sexo;
    }
}
