package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String disciplinas;
    private List<Float> notas = new ArrayList<>();
    private int faltas = 0;

    public Aluno(String nome, String cpf, String disciplinas) {
        super(nome, cpf);
        this.disciplinas = disciplinas;
        this.faltas = 0;
    }

    public static float calculaMedia(Aluno aluno) {
        return (somarLista(aluno.getNotas()) / aluno.getNotas().size());
    }

    public static void registraFalta(Aluno aluno) {
        aluno.setFaltas(aluno.getFaltas() + 1);
        System.out.println("O aluno " + aluno.getNome() + " está agora com " + aluno.getFaltas() + " falta(s).");
    }

    public static void totalFaltas(Aluno aluno) {
        System.out.println("O aluno " + aluno.getNome() + " está com " + aluno.getFaltas() + " falta(s).");
    }

    public static float somarLista(List<Float> lista) {
        float soma = 0;
        for (float valor : lista) {
            soma += valor;
        }
        return soma;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
