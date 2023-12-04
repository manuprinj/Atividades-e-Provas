package atividadePratica0910.volei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 2) A Federação Catarinense de Vôlei necessita de uma aplicação
 * para cadastrar as equipes que participaram do Campeonato
 * Estadual Adulto do ano de 2022.
 * a) Das equipes serão informados (nome, cidade, nome do
 * técnico, quantidade de pontos, número de vitórias, saldo de
 * sets vencidos, colocação final no campeonato e o email da
 * equipe).
 * b) Não se sabe o número de equipes.
 * c) Ao final deve-se:
 * i) Imprimir todos os dados da equipe campeã;
 * ii) Imprimir o nome da equipe e a cidade das 3 primeiras
 * classificadas;
 * iii) Quantidade de equipes;
 */
public class VoleiMain {
    public static void main(String[] args) {

        List<Equipe> equipes = new ArrayList<>();
        TerminalUtils.println("Cadastro de equipes que participaram do Campeonato Estadual Adulto do ano de 2022");
        int menu;
        do {
            TerminalUtils.println("Dados da equipe " + (equipes.size() + 1) + ":");
            equipes.add(cadastroEquipe());
            menu = TerminalUtils.inputInteger("Deseja cadastrar mais uma equipe?\n1 - Sim\n2 - Não");
        } while (menu == 1);

        //Do maior para o menor
        equipes.sort(Comparator.comparing(Equipe::getPontos).reversed());

        //Do menor para o maior
        equipes.sort(Comparator.comparing(Equipe::getPontos));

        Equipe campea = equipes.get(0);
        TerminalUtils.println("Dados da equipe campeã:");
        TerminalUtils.println("Nome: " + campea.getNome());
        TerminalUtils.println("Cidade: " + campea.getCidade());
        TerminalUtils.println("Tecnico: " + campea.getTecnico());
        TerminalUtils.println("Pontos: " + campea.getPontos());
        TerminalUtils.println("Vitorias: " + campea.getVitorias());
        TerminalUtils.println("Saldo de sets vencidos: " + campea.getSaldoSetsVencidos());
        TerminalUtils.println("Colocacao Final: 1º Lugar");
        TerminalUtils.println("Email: " + campea.getEmail());
        TerminalUtils.println("\nEquipes classificadas:");
        for (int i = 0; i < Math.min(equipes.size(), 3); i++) {
            TerminalUtils.println(i + 1 + "º lugar - " + equipes.get(i).getNome() + " - " + equipes.get(i).getCidade());
        }
        TerminalUtils.println("\nQuantidade de equipes: " + equipes.size());
    }

    public static Equipe cadastroEquipe() {
        Equipe equipe = new Equipe();
        equipe.setNome(TerminalUtils.inputString("Nome:"));
        equipe.setCidade(TerminalUtils.inputString("Cidade:"));
        equipe.setTecnico(TerminalUtils.inputString("Tecnico:"));
        equipe.setPontos(TerminalUtils.inputInteger("Pontos:"));
        equipe.setVitorias(TerminalUtils.inputInteger("Vitorias:"));
        equipe.setSaldoSetsVencidos(TerminalUtils.inputInteger("Saldo de sets vencidos:"));
        equipe.setEmail(TerminalUtils.inputString("Email:"));
        return equipe;
    }
}
