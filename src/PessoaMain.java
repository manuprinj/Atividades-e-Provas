import java.util.*;

public class PessoaMain {
    static List<Aluno> listaAlunos = new ArrayList<>();
    static List<Professor> listaProfessores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 15) {
            System.out.println("  -- Menu -- ");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Notas de Um Aluno");
            System.out.println("3 - Calcular a Média do Aluno");
            System.out.println("4 - Calcular a Média da Disciplina");
            System.out.println("5 - Registrar Nova Falta");
            System.out.println("6 - Consultar o Total de Faltas");
            System.out.println("7 - Listar os Alunos");
            System.out.println("8 - Listar as Notas e Médias da Disciplina");
            System.out.println("9 - Cadastrar Professor");
            System.out.println("10 - Alterar a Situação do Professor(Ativo/Inativo)");
            System.out.println("11 - Listar os Professores");
            System.out.println("12 - Cadastrar as Disciplinas de Um Professor");
            System.out.println("13 - Listar as Disciplinas de Um Professor");
            System.out.println("14 - Buscar Professores que Lecionam Uma Disciplina");
            System.out.println("15 - Sair\n");
            System.out.println("Informe uma opção:");
            opcao = scanner.nextInt();

            if (opcao == 1) cadastrarAluno();
            if (opcao == 2) registrarNotaAluno();
            if (opcao == 3) calcularMediaDoAluno();
            if (opcao == 4) mediaDisciplina();
            if (opcao == 5) registratNovaFalta();
            if (opcao == 6) consultarFaltasAluno();
            if (opcao == 7) listarAlunos();
            if (opcao == 8) listarNotasEMediasDaDisciplina();
            if (opcao == 9) cadastrarProfessor();
            if (opcao == 10) alterarASituacaoDoProfessor();
            if (opcao == 11) listarProfessores();
            if (opcao == 12) cadastrarDisciplinaDeUmProfessor();
            if (opcao == 13) consultarDisciplinaDeUmProfessor();
            if (opcao == 14) buscarProfessoresDeUmaDisciplina();
        }
    }

    public static Aluno buscaAluno() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados!");
            return null;
        }

        while (true) {
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            for (Aluno aluno : listaAlunos) {
                if (aluno.getNome().contains(nomeAluno)) {
                    return aluno;
                }
            }
        }
    }

    static void cadastrarAluno() {
        List<String> disciplinasCadastradasNoSistema = getDisciplinasCadastradasNoSistema();

        if (disciplinasCadastradasNoSistema.isEmpty()) {
            System.out.println("Não há disciplinas cadastradas ainda! Cadastre um professor antes!");
            return;
        }

        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Informe o cpf do aluno:");
        String cpf = scanner.nextLine();
        String disciplina = disciplina(disciplinasCadastradasNoSistema);

        Aluno aluno = new Aluno(nome, cpf, disciplina);
        listaAlunos.add(aluno);
    }

    public static List<String> getDisciplinasCadastradasNoSistema() {
        Set<String> listaDisciplinas = new HashSet<>();

        for (Professor professor : listaProfessores) {
            listaDisciplinas.addAll(professor.getDisciplinas());
        }

        return new ArrayList<>(listaDisciplinas);
    }

    private static String disciplina(List<String> disciplinasCadastradasNoSistema) {
        while (true) {
            System.out.println("Selecione a disciplina: ");
            for (int i = 0; i < disciplinasCadastradasNoSistema.size(); i++) {
                String nomeDisciplina = disciplinasCadastradasNoSistema.get(i);
                System.out.println((i) + " - " + nomeDisciplina);
            }

            int opcao = scanner.nextInt();

            if (!(opcao < 0 || opcao > disciplinasCadastradasNoSistema.size())) {
                return disciplinasCadastradasNoSistema.get(opcao);
            }
        }
    }

    static void registrarNotaAluno() {
        Aluno aluno = buscaAluno();

        if (aluno == null) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            float nota = scanner.nextFloat();
            aluno.getNotas().add(nota);
        }
    }

    static void calcularMediaDoAluno() {
        Aluno aluno = buscaAluno();

        if (aluno == null) {
            return;
        }

        if (aluno.getNotas().isEmpty()) {
            System.out.println("Aluno não tem nota cadastrada!");
            return;
        }

        System.out.println("Média do Aluno: " + Aluno.calculaMedia(aluno));
    }

    static void mediaDisciplina() {
        float total = (float) 0;
        int quantidadeAlunos = 0;

        List<String> disciplinasCadastradasNoSistema = getDisciplinasCadastradasNoSistema();
        String disciplina = disciplina(disciplinasCadastradasNoSistema);

        for (Aluno aluno : listaAlunos) {
            if (aluno.getDisciplinas().equals(disciplina)) {
                total += Aluno.calculaMedia(aluno);
                quantidadeAlunos++;
            }
        }

        System.out.println("Média da Disciplina " + disciplina + ": " + (total/quantidadeAlunos));
    }


    static void registratNovaFalta() {
        Aluno aluno = buscaAluno();

        if (aluno == null) {
            return;
        }

        Aluno.registraFalta(aluno);
    }

    static void consultarFaltasAluno() {
        Aluno aluno = buscaAluno();

        if (aluno == null) {
            return;
        }

        Aluno.totalFaltas(aluno);
    }

    static void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Aluno " + (i+1) + ": " + listaAlunos.get(i).getNome());
        }
    }

    static void listarNotasEMediasDaDisciplina() {
        List<String> disciplinasCadastradasNoSistema = getDisciplinasCadastradasNoSistema();
        String disciplina = disciplina(disciplinasCadastradasNoSistema);

        System.out.println("Alunos da disciplina com notas e média:");

        for (Aluno aluno : listaAlunos) {
            if (aluno.getDisciplinas().equals(disciplina)) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Notas: " + aluno.getNotas());
                System.out.println("Média: " + Aluno.calculaMedia(aluno));
                System.out.println("------------------------");
            }
        }
    }

    public static Professor buscaProfessor() {
        if (listaProfessores.isEmpty()) {
            System.out.println("Não há alunos cadastrados!");
            return null;
        }

        while (true) {
            System.out.println("Digite o nome do professor: ");
            String nomeProfessor = scanner.nextLine();
            for (Professor professor : listaProfessores) {
                if (professor.getNome().contains(nomeProfessor)) {
                    return professor;
                }
            }
        }
    }

    static void cadastrarProfessor() {
        List<String> listaDisciplinas = new ArrayList<>();
        int quantidadeDisciplinas;

        System.out.println("Informe o nome do professor:");
        String nome = scanner.nextLine();

        System.out.println("Informe o cpf do professor:");
        String cpf = scanner.nextLine();

        System.out.println("Informe a matrícula do professor:");
        int matricula = scanner.nextInt();

        System.out.println("Informe a quantidade de disciplinas que o professor leciona no momento: ");
        quantidadeDisciplinas = scanner.nextInt();

        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.println("Informe a disciplina " + (i+1) + ": ");
            String disciplina = scanner.nextLine();
            listaDisciplinas.add(disciplina);
        }

        Professor professor = new Professor(nome, cpf, matricula, listaDisciplinas);
        listaProfessores.add(professor);
    }

    static void alterarASituacaoDoProfessor() {
        Professor professor = buscaProfessor();

        if (professor == null) {
            return;
        }

        Professor.alteraSituacao(professor);
    }

    static void listarProfessores() {
        System.out.println("Lista de Professores:");
        for (int i = 0; i < listaProfessores.size(); i++) {
            System.out.println("Professor " + (i+1) + ": ");
            System.out.println("Nome: " + listaProfessores.get(i).getNome());
            System.out.println("Matrícula: " + listaProfessores.get(i).getMatricula());
            System.out.println(consultarSituacaoDeUmProfessor(listaProfessores.get(i)));
            Professor.consultaDisciplinas(listaProfessores.get(i));
        }
    }

    static void cadastrarDisciplinaDeUmProfessor() {
        Professor professor = buscaProfessor();

        if (professor == null) {
            return;
        }

        Professor.cadastraDisciplina(professor);
    }

    static void consultarDisciplinaDeUmProfessor() {
        Professor professor = buscaProfessor();

        if (professor == null) {
            return;
        }

        Professor.consultaDisciplinas(professor);
    }

    static String consultarSituacaoDeUmProfessor(Professor professor) {
        if (professor.getSituacao()) {
            System.out.println("Ativo");
        } else {
            System.out.println("Inativo");
        }
        return null;
    }

    private static void buscarProfessoresDeUmaDisciplina() {
        List<String> disciplinasCadastradasNoSistema = getDisciplinasCadastradasNoSistema();
        String disciplina = disciplina(disciplinasCadastradasNoSistema);

        System.out.println("Professores da disciplina " + disciplina + ": ");
        for (Professor listaProfessore : listaProfessores) {
            if (listaProfessore.getDisciplinas().contains(disciplina)) {
                System.out.println("Nome: " + listaProfessore.getNome());
            }
        }
    }
}
