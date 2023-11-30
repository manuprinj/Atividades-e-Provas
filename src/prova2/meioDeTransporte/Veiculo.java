package prova2.meioDeTransporte;

public class Veiculo {
    private String marca;
    private String modelo;
    private int qtdeRodas;
    private int velocidade;

    public Veiculo(String marca, String modelo, int qtdeRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdeRodas = qtdeRodas;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        setVelocidade(getVelocidade() + valor);
        System.out.println("O veículo acelerou com sucesso, e a sua velocidade atual é: " + getVelocidade());
    }

    public void frear(int valor) {
        if (getVelocidade() == 0) {
            System.out.println("O veículo encontra-se parado, não é possível frear!");
        } else if (valor > getVelocidade()) {
            System.out.println("O valor informado é maior que a velocidade atual, não é possível frear!!");
        } else {
            setVelocidade(getVelocidade() - valor);
            System.out.println("O veículo freou com sucesso, e a sua velocidade atual é: " + getVelocidade());
        }
    }

    public void mostraDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de Rodas: " + getQtdeRodas());
        System.out.println("Velocidade: " + getVelocidade());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
