package prova2.meioDeTransporte;

public class Moto extends Automovel {
    private boolean realizaEntregas;
    private int entregasRealizadas;
    private int distanciaPercorrida;

    //realizaEntregas = true realiza apenas entregas
    //realizaEntregas = false realiza apenas viagens

    public Moto(String marca, String modelo, int qtdeRodas, int potenciaMotor, boolean realizaEntregas) {
        super(marca, modelo, qtdeRodas, potenciaMotor);
        this.realizaEntregas = realizaEntregas;
        this.entregasRealizadas = 0;
        this.distanciaPercorrida = 0;
    }
    @Override
    public void mostraDados() {
        super.mostraDados();
        mostraStatus();
        System.out.println("Entregas Realizadas: " + getEntregasRealizadas());
        System.out.println("Distância Percorrida: " + getDistanciaPercorrida());
    }

    public void mostraStatus() {
        if (isRealizaEntregas()) {
            System.out.println("Realiza entregas");
        } else {
            System.out.println("Não realiza entregas");
        }
    }

    public void realizaEntrega(Moto moto) {
        if (moto.isRealizaEntregas()) {
            setEntregasRealizadas(moto.getEntregasRealizadas() + 1);
            System.out.println("Quantidade de entregas atualizadas: " + getEntregasRealizadas());
        } else {
            System.out.println("Essa moto não está habilitada a realizar entregas");
        }
    }

    public void registraViagem(Moto moto, int valor) {
        if (!moto.isRealizaEntregas()) {
            setDistanciaPercorrida(moto.getDistanciaPercorrida() + valor);
            System.out.println("Valor de distância atualizada: " + getDistanciaPercorrida());
        } else {
            System.out.println("Essa moto não está habilitada a realizar viagens");
        }
    }

    public boolean isRealizaEntregas() {
        return realizaEntregas;
    }

    public void setRealizaEntregas(boolean realizaEntregas) {
        this.realizaEntregas = realizaEntregas;
    }

    public int getEntregasRealizadas() {
        return entregasRealizadas;
    }

    public void setEntregasRealizadas(int entregasRealizadas) {
        this.entregasRealizadas = entregasRealizadas;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
}
