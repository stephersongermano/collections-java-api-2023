package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Crie uma classe chamada "Dicionario" que utilize um Map para armazenar
    // palavras e suas respectivas definições. Implemente os seguintes métodos:
    private Map<String, String> dicionarioPalavras;

    public Dicionario() {
        this.dicionarioPalavras = new HashMap<>();
    }

    // adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e
    // sua definição ao dicionário, associando a palavra à sua definição
    // correspondente.
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioPalavras.put(palavra, definicao);
    }

    // removerPalavra(String palavra): Remove uma palavra do dicionário, dado o
    // termo a ser removido.
    public void removerPalavra(String palavra) {
        if (!dicionarioPalavras.isEmpty()) {
            dicionarioPalavras.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    // exibirPalavras(): Exibe todas as palavras e suas definições do dicionário,
    // mostrando cada palavra seguida de sua respectiva definição.
    public void exibirPalavras() {
        if (!dicionarioPalavras.isEmpty()) {
            System.out.println(dicionarioPalavras);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    // pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e
    // retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioPalavras.isEmpty()) {
            palavraPesquisada = dicionarioPalavras.get(palavra);
            if (palavraPesquisada == null) {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Conjunto vazio");
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
