package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de
    // compras online. O carrinho deve ser implementado como uma lista de itens.
    // Cada item é representado por uma classe chamada "Item" que possui atributos
    // como nome, preço e quantidade. Implemente os seguintes métodos:

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    // adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao
    // carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    // removerItem(String nome): Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em
    // consideração o preço e a quantidade de cada item.
    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {

            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus
    // nomes, preços e quantidades.
    public void exibirItens() {
        for (Item item : itemList) {
            System.out.println(item.getItemDescricao());
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("-----------------------------");
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }

}
