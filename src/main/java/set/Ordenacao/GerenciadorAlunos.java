package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de
    // alunos. Cada aluno terá atributos como nome, matrícula e nota.
    // Implementaremos os seguintes métodos:
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    // adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno
    // ao conjunto.
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    // removerAluno(long matricula): Remove um aluno ao conjunto a partir da
    // matricula, se estiver presente.
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);

        } else {
            throw new RuntimeException("Conjunto vazio");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada.");
        }
    }

    // exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética
    // pelo nome.
    public void exibirAlunosPorNome() {
        Set<Aluno> alunoOrdemAlfabetica = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunoOrdemAlfabetica);
        } else {
            System.out.println("Conjunto vazio");
        }

    }

    // exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente
    // de nota.
    public void exibirAlunosPorNota() {
        Set<Aluno> alunoOrdemNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosSet.isEmpty()) {
            alunoOrdemNota.addAll(alunosSet);
            System.out.println(alunoOrdemNota);
        } else {
            System.out.println("Conjunto vazio");
        }

    }

    // exibirAlunos(): Exibe todos os alunos do conjunto.
    public void exibirAlunos() {
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSet);
        } else {
            System.out.println("Conjunto vazio");
        }

    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
