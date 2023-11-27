import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    private int matricula;
    private List<String> disciplinas = new ArrayList<>();
    private boolean situacao;
    static Scanner scanner = new Scanner(System.in);


    public Professor(String nome, String cpf, int matricula, List<String> disciplinas) {
        super(nome, cpf);
        this.matricula = matricula;
        this.disciplinas = disciplinas;
        this.situacao = true;
    }

    public static void alteraSituacao(Professor professor) {
        String situacaoContraria;

        if (professor.getSituacao()) {
            situacaoContraria = "Inativo";
        } else {
            situacaoContraria = "Ativo";
        }

        if (professor.getSituacao()) {
            System.out.println("A situação atual do professor " + professor.getNome() + " é:" + "Ativo");
        } else {
            System.out.println("A situação atual do professor " + professor.getNome() + " é:" +"Inativo");
        }

        System.out.print("Deseja alterar a situação para " + situacaoContraria + "?\n");
        System.out.println("1 - Sim\n2 - Não");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            //Caso caia nessa situação ele vai sempre inverter, se tiver true vai virar false e vice-versa
            professor.setSituacao(!professor.getSituacao());
            System.out.println("Situação alterada com sucesso!");
        } else {
            System.out.println("Não foi alterada a situação!");
        }
    }

    public static void consultaDisciplinas(Professor professor) {
        System.out.println("Disciplinas:");
        for (int i = 0; i < professor.getDisciplinas().size(); i++) {
            System.out.println(professor.getDisciplinas().get(i));
        }
    }

    public static void cadastraDisciplina(Professor professor) {
        System.out.println("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        professor.getDisciplinas().add(nomeDisciplina);
    }

    public static void mostraSituacao(Professor professor) {
        if (professor.getSituacao()) {
            System.out.println("Ativo");
        } else {
            System.out.println("Inativo");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
