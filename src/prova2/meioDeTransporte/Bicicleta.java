package prova2.meioDeTransporte;

public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;
    private boolean status;

    //status true = parado
    //status false = em viagem

    public Bicicleta(String marca, String modelo, int qtdeRodas, int numMarchas, boolean bagageiro, boolean status) {
        super(marca, modelo, qtdeRodas);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
        this.status = status;
    }

    public void iniciaViagem() {
        if (getStatus()) {
            setStatus((!getStatus()));
            System.out.println("Status alterado com sucesso!");
        } else {
            System.out.println("A bicicleta já está em viagem!");
        }
    }

    public void encerrarViagem() {
        if (getStatus()) {
            setStatus((getStatus()));
            System.out.println("Status alterado com sucesso!");
        } else {
            System.out.println("A bicicleta já está parada!");
        }
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Número de Marchas: " + getNumMarchas());
        System.out.println(mostraBagageiro());
        mostraStatus();
    }

    public void mostraStatus() {
        if (getStatus()) {
            System.out.println("Status: Parado");
        } else {
            System.out.println("Status: Em Viagem");
        }
    }

    public String mostraBagageiro() {
        if (isBagageiro()) {
            System.out.println("Bagageiro: Sim");
        } else {
            System.out.println("Bagageiro: Não");
        }
        return "";
    }
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
