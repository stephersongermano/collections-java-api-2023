package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Crie uma classe chamada "SomaNumeros" que possui uma lista de números
    // inteiros como atributo. Implemente os seguintes métodos:
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    // adicionarNumero(int numero): Adiciona um número à lista de números.
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    // calcularSoma(): Calcula a soma de todos os números na lista e retorna o
    // resultado.
    public Integer calcularSoma() {
        int somaNumeros = 0;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                somaNumeros += i;
            }
            return somaNumeros;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    // encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
    public Integer encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (maiorNumero < i) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    // encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
    public Integer encontrarMenorNumero() {
        int menorNumero = 0;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (menorNumero > i) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    // exibirNumeros(): Retorna uma lista contendo todos os números presentes na
    // lista.
    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
