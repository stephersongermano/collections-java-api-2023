package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar
    // os produtos, suas quantidades em estoque e seus respectivos preços. Cada
    // produto possui um código como chave e um objeto Produto como valor, contendo
    // nome, quantidade e preço. Implemente os seguintes métodos:
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // adicionarProduto(long cod, String nome, int quantidade, double preco):
    // Adiciona um produto ao estoque, juntamente com a quantidade disponível e o
    // preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    // exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e
    // preços.
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    // calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque,
    // considerando a quantidade e o preço de cada produto.
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    // obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja,
    // aquele com o maior preço.
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    // obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja,
    // aquele com o menor preço.
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    // obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está
    // em maior quantidade no estoque, considerando o valor total de cada produto
    // (quantidade * preço).
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorQtd = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> e : estoqueProdutosMap.entrySet()) {
                if ((e.getValue().getPreco() * e.getValue().getQuantidade()) > maiorValor) {
                    maiorValor = e.getValue().getPreco() * e.getValue().getQuantidade();
                    maiorQtd = e.getValue();
                }
            }
        }
        return maiorQtd;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 4, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

    }
}
