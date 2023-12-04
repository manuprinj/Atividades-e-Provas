package atividadePratica0910.campeonatoFutebol;

public class Atleta {
    private String nome;
    private int anoNascimento;
    private String sexo;
    private int numeroGols;

    public Atleta(String nome, int anoNascimento, String sexo, int numeroGols) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.numeroGols = numeroGols;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumeroGols() {
        return numeroGols;
    }

    public void setNumeroGols(int numeroGols) {
        this.numeroGols = numeroGols;
    }
}
