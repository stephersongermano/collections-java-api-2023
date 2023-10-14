package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do
    // tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um
    // atributo booleano para indicar se a tarefa foi concluída ou não. Implemente
    // os seguintes métodos:
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    // adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    // removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a
    // descrição, se estiver presente.
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("Conjunto vazio");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    // exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    // contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    public int contarTarefas() {
        if (!tarefaSet.isEmpty()) {
            return tarefaSet.size();
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == true) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == false) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de
    // acordo com a descrição.
    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de
    // acordo com a descrição.
    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
    public void limparListaTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("Lista de tarefas vazia");
        }
    }

    @Override
    public String toString() {
        return "ListaTarefas [tarefaSet=" + tarefaSet + "]";
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
