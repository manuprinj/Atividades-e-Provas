package trabalho2.controleMedicacoes;

import trabalho2.EntregarUtils;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoMain {
    static List<Medicamento> listaMedicamentos = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String nome = EntregarUtils.inputString("Informe o nome da medicação " + (i+1) + ":");
            int quantidade = EntregarUtils.inputInt("Informe a quantidade que há na embalagem do medicamento " + (i+1) + ":");
            int quantidadeDose = EntregarUtils.inputInt("Informe a quantidade que deverá ser tomado na dose do medicamento " + (i+1) + ":");
            LocalTime hora = EntregarUtils.inputLocalTime("Digite um horário (HH:mm:ss): ");

            Medicamento medicamento = new Medicamento(nome, quantidade, quantidadeDose, hora);
            listaMedicamentos.add(medicamento);
        }

        System.out.println("INFORMAÇÕES APÓS CADASTROS");
        EntregarUtils.mostrarInformacoesMedicamentos(listaMedicamentos);

        System.out.println("-----------");
        System.out.println("ADMINISTRAÇÃO");
        EntregarUtils.administracao(listaMedicamentos);
        EntregarUtils.administracao(listaMedicamentos);

        System.out.println("-----------");
        System.out.println("INFORMAÇÕES APÓS ADMINISTRÇÃO");
        EntregarUtils.mostrarInformacoesMedicamentos(listaMedicamentos);

        System.out.println("-----------");
        System.out.println("RESET");
        EntregarUtils.reset(listaMedicamentos);

        System.out.println("-----------");
        System.out.println("INFORMAÇÕES APÓS RESET");
        EntregarUtils.mostrarInformacoesMedicamentos(listaMedicamentos);
    }
}
