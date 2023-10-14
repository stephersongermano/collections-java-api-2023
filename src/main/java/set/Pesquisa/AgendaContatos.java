package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do
    // tipo "Contato" como atributo. Cada contato possui atributos como nome e
    // número de telefone. Implemente os seguintes métodos:
    Set<Contato> contatosAgenda;

    public AgendaContatos() {
        this.contatosAgenda = new HashSet<>();
    }

    // adicionarContato(String nome, int numero): Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero) {
        contatosAgenda.add(new Contato(nome, numero));
    }

    // exibirContatos(): Exibe todos os contatos da agenda.
    public void exibirContatos() {
        if (!contatosAgenda.isEmpty()) {
            System.out.println(contatosAgenda);
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma
    // conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPesquisaNome = new HashSet<>(contatosAgenda);
        if (!contatosAgenda.isEmpty()) {
            for (Contato c : contatosAgenda) {
                if (c.getNome().startsWith(nome)) {
                    contatosPesquisaNome.add(c);
                }
            }
            return contatosPesquisaNome;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    // atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de
    // telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosAgenda.isEmpty()) {
            for (Contato c : contatosAgenda) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }
}
