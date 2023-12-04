package trabalho2.controleMedicacoes;

import java.time.LocalTime;

public class Medicamento {
    private String nome;
    private int quantidade;
    private int quantidadeDose;
    private LocalTime hora;
    private Status status;

    public Medicamento(String nome, int quantidade, int quantidadeDose, LocalTime hora) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.quantidadeDose = quantidadeDose;
        this.hora = hora;
        this.status = Status.AGUARDANDO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeDose() {
        return quantidadeDose;
    }

    public void setQuantidadeDose(int quantidadeDose) {
        this.quantidadeDose = quantidadeDose;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
