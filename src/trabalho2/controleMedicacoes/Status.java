package trabalho2.controleMedicacoes;

public enum Status {
    ADMINISTRADO("Administrado"),
    AGUARDANDO("Aguardando");

    private final String nome;

    Status(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
