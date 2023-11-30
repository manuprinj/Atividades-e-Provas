package prova.elevador;

public class Elevador {
    private int andar;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;

    public Elevador() {}

    //o -1 foi usado para ser desconsiderado o térreo;
    public void inicializa(int capacidadeElevador, int totalAndares) {
        setCapacidadeElevador(capacidadeElevador);
        setAndar(0);
        setQuantidadePessoas(0);
        setTotalAndares(totalAndares - 1);
    }

    public void entra() {
        int totalPessoasEntra = 0;
        totalPessoasEntra = getQuantidadePessoas() + 1;

        if(totalPessoasEntra > getCapacidadeElevador()) {
            System.out.println("O Elevador já está lotado!");
        } else {
            setQuantidadePessoas(totalPessoasEntra);
            System.out.println("O elevador está atualmente com " + getQuantidadePessoas() + " pessoas.");
        }
    }

    public void entra(int quantidadePessoasEntraramElevador) {
        int totalPessoasEntra = getQuantidadePessoas() + quantidadePessoasEntraramElevador;

        if(totalPessoasEntra > getCapacidadeElevador()) {
            System.out.println("O Elevador já está lotado!");
        } else {
            setQuantidadePessoas(totalPessoasEntra);
            System.out.println("O elevador está atualmente com " + getQuantidadePessoas() + " pessoas.");
        }
    }

    public void sai() {
        int totalPessoasSai = getQuantidadePessoas() - 1;

        if(totalPessoasSai < 0) {
            System.out.println("O Elevador não tem ninguém!");
        } else if (totalPessoasSai > getQuantidadePessoas()){
            System.out.println("Não há essa quantidade de pessoas para sair do elevador!");
        } else {
            setQuantidadePessoas(totalPessoasSai);
            System.out.println("O elevador está atualmente com " + getQuantidadePessoas() + " pessoas.");
        }
    }

    public void sai(int quantidadePessoasSairamElevador) {
        int totalPessoasSai = getQuantidadePessoas() - quantidadePessoasSairamElevador;

        if(totalPessoasSai < 0) {
            System.out.println("O Elevador não tem ninguém!");
        } else if (totalPessoasSai > getQuantidadePessoas()){
            System.out.println("Não há essa quantidade de pessoas para sair do elevador!");
        } else {
            setQuantidadePessoas(totalPessoasSai);
            System.out.println("O elevador está atualmente com " + getQuantidadePessoas() + " pessoas.");
        }
    }

    public void sobe() {
        int subindoAndar = getAndar() + 1;

        if(subindoAndar > getTotalAndares()) {
            System.out.println("O Elevador já está no último andar!");
        } else {
            setAndar(subindoAndar);
            System.out.println("O elevador está atualmente no andar " + getAndar());
        }
    }

    public void sobe(int quantidadeAndaresParaSubir) {
        int subindoAndar = getAndar() + quantidadeAndaresParaSubir;

        if(subindoAndar > getTotalAndares()) {
            System.out.println("O Elevador passará do último andar!");
        } else {
            setAndar(subindoAndar);
            System.out.println("O elevador está atualmente no andar " + getAndar());
        }
    }

    public void desce() {
        int descendoAndar = getAndar() - 1;

        if(descendoAndar < 0) {
            System.out.println("O Elevador já está no térreo!");
        } else {
            setAndar(descendoAndar);
            System.out.println("O elevador está atualmente no andar " + getAndar());
        }
    }

    public void mostrar() {
        System.out.println("Andar atual: " + getAndar());
        System.out.println("Total de Andares: " + getTotalAndares());
        System.out.println("Quantidade de passageiros: " + getQuantidadePessoas());
        System.out.println("Capacidade Elevador: " + getCapacidadeElevador());
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
