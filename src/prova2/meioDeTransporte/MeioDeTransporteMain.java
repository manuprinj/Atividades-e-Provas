package prova2.meioDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class MeioDeTransporteMain {
    public static void main(String[] args) {
        List<Bicicleta> listaBicicletas = new ArrayList<>();
        List<Moto> listaMotos = new ArrayList<>();
        List<Carro> listaCarros = new ArrayList<>();

        Bicicleta bicicleta = new Bicicleta("Kaloi", "Aro 16", 2, 12, false, true);
        listaBicicletas.add(bicicleta);
        Bicicleta bicicleta2 = new Bicicleta("Kaloi", "Aro 20", 2, 8, true, true);
        listaBicicletas.add(bicicleta2);

        Moto moto = new Moto("Honda", "Biz 2007", 2, 12, false);
        listaMotos.add(moto);
        Moto moto2 = new Moto("Honda", "CG 2015", 2, 12, true);
        listaMotos.add(moto2);
        Moto moto3 = new Moto("Honda", "CG 2012", 2, 12, true);
        listaMotos.add(moto3);

        Carro carro = new Carro("Renault", "Duster 2016", 4, 100, 5);
        listaCarros.add(carro);
        Carro carro2 = new Carro("JEEP", "Compass 2023", 4, 110, 5);
        listaCarros.add(carro2);
        Carro carro3 = new Carro("JEEP", "Compass 2015", 4, 110, 5);
        listaCarros.add(carro3);

        //Metodos do Veiculo
        listaMotos.get(0).acelerar(100);
        listaCarros.get(1).acelerar(100);
        listaMotos.get(0).frear(80);
        listaCarros.get(1).frear(80);
        listaMotos.get(0).mostraDados();
        listaCarros.get(1).mostraDados();

        System.out.println("----------------");

        //Metodos do Automóvel
        listaCarros.get(2).mostraDados();

        System.out.println("----------------");

        //Metodos do Carro
        listaCarros.get(0).registraViagem(10250);
        listaCarros.get(0).iniciaRevisao();
        listaCarros.get(0).finalizaRevisao();
        listaCarros.get(0).mostraDados();

        System.out.println("----------------");

        //Metodos da Moto
        listaMotos.get(1).mostraDados();
        listaMotos.get(1).realizaEntrega(moto2);
        listaMotos.get(1).registraViagem(moto2, 100);
        listaMotos.get(2).registraViagem(moto3, 100);
        listaMotos.get(1).mostraDados();
        listaMotos.get(2).mostraDados();

        System.out.println("----------------");

        //Metodos da Bicicleta
        listaBicicletas.get(0).acelerar(100);
        listaBicicletas.get(0).frear(80);
        listaBicicletas.get(0).mostraDados();
    }
}
