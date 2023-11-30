package prova.pessoa;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private String sexo;
    private float salario;

    public Pessoa() {}

    public Pessoa(String nome, int anoNascimento, String sexo, float salario) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
