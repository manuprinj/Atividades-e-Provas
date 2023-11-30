package prova.elevador;

public class ElevadorMain {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(10, 12);

        elevador.entra();
        elevador.entra(4);

        elevador.sai();
        elevador.sai(2);

        elevador.mostrar();

        elevador.sobe();
        elevador.sobe(12);

        elevador.mostrar();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();

        elevador.mostrar();
    }
}
