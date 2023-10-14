package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar
    // as palavras e a quantidade de vezes que cada palavra aparece em um texto.
    // Implemente os seguintes métodos:
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    // adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à
    // contagem.
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    // removerPalavra(String palavra): Remove uma palavra da contagem, se estiver
    // presente.
    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    // exibirContagemPalavras(): Exibe todas as palavras e suas respectivas
    // contagens.
    public void exibirContagemPalavras() {
        if (!palavrasMap.isEmpty()) {
            System.out.println(palavrasMap);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    // encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e
    // retorna a palavra e sua contagem.
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorQuantidadeRepeticoes = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> e : palavrasMap.entrySet()) {
            if (e.getValue() > maiorQuantidadeRepeticoes) {
                maiorQuantidadeRepeticoes = e.getValue();
                palavraMaisFrequente = e.getKey();
            }
        }
        return palavraMaisFrequente;
    }
}
