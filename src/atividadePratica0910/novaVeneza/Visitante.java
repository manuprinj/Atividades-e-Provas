package atividadePratica0910.novaVeneza;

public class Visitante {
    private String nome;
    private String cpf;
    private String cidadeResidencia;
    private String sexo;
    private String profissao;
    private int anoNascimento;

    public Visitante(String nome, String cpf, String cidadeResidencia, String sexo, String profissao, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidadeResidencia = cidadeResidencia;
        this.sexo = sexo;
        this.profissao = profissao;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidadeResidencia() {
        return cidadeResidencia;
    }

    public void setCidadeResidencia(String cidadeResidencia) {
        this.cidadeResidencia = cidadeResidencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
