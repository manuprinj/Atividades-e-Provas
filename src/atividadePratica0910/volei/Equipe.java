package atividadePratica0910.volei;

class Equipe {
    private String nome;
    private String cidade;
    private String tecnico;
    private Integer pontos;
    private Integer vitorias;
    private Integer saldoSetsVencidos;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getSaldoSetsVencidos() {
        return saldoSetsVencidos;
    }

    public void setSaldoSetsVencidos(Integer saldoSetsVencidos) {
        this.saldoSetsVencidos = saldoSetsVencidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
