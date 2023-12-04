package trabalho1;

import utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {
    static List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            String descricao = InputUtils.inputString("Digite a descrição do produto " + (i+1) + ": ").trim();
            String unidadeMedida = InputUtils.inputString("Digite a unidade de medida " + (i+1) + " (Ex.: cm, m): ");
            int saldo = InputUtils.inputInt("Digite o saldo do produto " + (i+1) + ": ");
            double valorUnitario = InputUtils.inputDouble("Digite o valor unitário do produto " + (i+1) + ": ");
            Produto produto = new Produto(descricao, unidadeMedida, saldo, valorUnitario);
            listaProdutos.add(produto);
        }

        ProdutoUtils.mostrarInformacoes(listaProdutos);

        String descricao = InputUtils.inputString("Digite a descrição do produto: ");
        ProdutoUtils.realizaVenda(listaProdutos, descricao);
    }
}
