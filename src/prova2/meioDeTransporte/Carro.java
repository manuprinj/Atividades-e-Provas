package prova2.meioDeTransporte;

public class Carro extends Automovel {
    private int qtdePassageiros;
    private int distRevisao;
    private Boolean status;

    //status true = necessita revisao
    //status false = na revisao
    //status null = ok

    public Carro(String marca, String modelo, int qtdeRodas, int potenciaMotor, int qtdePassageiros) {
        super(marca, modelo, qtdeRodas, potenciaMotor);
        this.qtdePassageiros = qtdePassageiros;
        this.distRevisao = 10000;
        this.status = null;
    }

    public void registraViagem(int valor) {
        int distRevisaoAtualizada =  getDistRevisao() - valor;
        if (distRevisaoAtualizada <= 0) {
            System.out.println("Está na hora de fazer uma revisão!");
             setStatus(true);
        } else {
             setDistRevisao(distRevisaoAtualizada);
        }
    }

    public void iniciaRevisao() {
        if (getStatus()) {
            setStatus((!getStatus()));
            System.out.println("Status alterado com sucesso!");
        } else if (!getStatus()){
            System.out.println("O carro já está em revisão!");
        } else {
            System.out.println("O carro não precisa de revisão!");
        }
    }

    public void finalizaRevisao() {
        if (!getStatus()) {
             setStatus(null);
            System.out.println("Status alterado com sucesso!");
        } else if (getStatus()){
            System.out.println("O carro ainda não iniciou a revisão!");
        } else {
            System.out.println("O carro não precisa de revisão!");
        }
    }
    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Quantidade de Passageiros: " + getQtdePassageiros());
        System.out.println("Distância Revisão: " +  getDistRevisao());
        mostraStatus();
    }

    public void mostraStatus() {
        if (getStatus() == null) {
            System.out.println("Status: Tudo OK");
        } else if (!getStatus()){
            System.out.println("Status: Está na Revisão");
        } else {
            System.out.println("Status: Necessita Revisão");
        }
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getDistRevisao() {
        return distRevisao;
    }

    public void setDistRevisao(int distRevisao) {
        this.distRevisao = distRevisao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
