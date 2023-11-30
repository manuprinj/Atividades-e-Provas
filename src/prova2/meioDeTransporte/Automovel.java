package prova2.meioDeTransporte;

public class Automovel extends Veiculo {
    private int potenciaMotor;

    public Automovel(String marca, String modelo, int qtdeRodas, int potenciaMotor) {
        super(marca, modelo, qtdeRodas);
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Potência do Motor: " + getPotenciaMotor());
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
