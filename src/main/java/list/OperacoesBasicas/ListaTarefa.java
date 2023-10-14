package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como
    // atributo.
    // Cada tarefa é representada por uma classe chamada "Tarefa" que possui um
    // atributo de descrição.

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a
    // descrição fornecida.
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // removerTarefa(String descricao): Remove uma tarefa da lista com base em sua
    // descrição.

    // obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as
    // tarefas na lista.
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

}