package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de
    // palavras únicas como atributo. Implemente os seguintes métodos:
    Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    // adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    // removerPalavra(String palavra): Remove uma palavra do conjunto.
    public void removerPalavra(String palavra) {
        if (!this.palavrasSet.isEmpty()) {
            if (palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // verificarPalavra(String palavra): Verifica se uma palavra está presente no
    // conjunto.
    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    // exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
