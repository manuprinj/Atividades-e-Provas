package trabalho1;

import utils.InputUtils;

import java.util.List;

public class ProdutoUtils {

    public static double atualizaSubtotalProduto(int saldo, double valorUnitario) {
        return saldo * valorUnitario;
    }

    public static void mostrarInformacoes(List<Produto> produtos) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Descrição: " + produtos.get(i).getDescricao());
            System.out.println("Unidade de Medida: " + produtos.get(i).getUnidadeMedida());
            System.out.println("Saldo: " + produtos.get(i).getSaldo());
            System.out.println("Valor Unitário: R$" + produtos.get(i).getValorUnitario());
            System.out.println("SubTotal: R$" + atualizaSubtotalProduto(produtos.get(i).getSaldo(), produtos.get(i).getValorUnitario()));
        }
    }

    public static void realizaVenda(List<Produto> listaProdutos, String descricao) {
        Produto produto = buscaProduto(listaProdutos,descricao);
        if (produto != null) {
            int quantidade = InputUtils.inputInt("Digite a quantidade que será comprada do produto: ");
            int quantidadeAtual = produto.getSaldo() - quantidade;
            if (quantidadeAtual < 0) {
                System.out.println("Saldo insuficiente para a realização da compra!");
            } else {
                System.out.println("Venda Realizada!");
                System.out.println("O saldo atualizado do produto é: " + quantidadeAtual);
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static Produto buscaProduto(List<Produto> listaProdutos, String descricao) {
        for (Produto listaProduto : listaProdutos) {
            if (listaProduto.getDescricao().contains(descricao)) {
                return listaProduto;
            }
            return null;
        }
        return null;
    }
}
