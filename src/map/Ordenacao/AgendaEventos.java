package map.Ordenacao;

import set.Pesquisa.AgendaContatos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData;
        Evento proximoEvento;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 01), "Festa 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 17), "Festa 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 02), "Festa 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 01, 13), "Festa 1", "Atração 1");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
