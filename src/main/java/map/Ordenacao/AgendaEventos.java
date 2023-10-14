package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar
    // as datas e seus respectivos Eventos. Cada evento é representado por um objeto
    // da classe "Evento", que possui atributos como nome do evento e o nome da
    // atração. Implemente os seguintes métodos:
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um
    // evento à agenda.
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> e : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = e.getKey();
            Evento evento = e.getValue();
            System.out.println(
                    "Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    // obterProximoEvento(): Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> e : eventosMap.entrySet()) {
            LocalDate dataEvento = e.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                dataProximoEvento = dataEvento;
                proximoEvento = e.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println(
                    "O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + dataProximoEvento);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
                "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação",
                "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software",
                "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação",
                "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial",
                "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}
