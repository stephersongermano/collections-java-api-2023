package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números
    // inteiros como atributo. Implemente os seguintes métodos:
    List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    // adicionarNumero(int numero): Adiciona um número à lista.
    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    // ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a
    // interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    // ordenarDescendente(): Ordena os números da lista em ordem descendente usando
    // um Comparable e a class Collections.
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
