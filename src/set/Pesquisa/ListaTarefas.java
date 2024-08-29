package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        int contador = 0;
        for (Tarefa t : tarefaSet) {
            if (!tarefaSet.isEmpty()) {
                contador++;
            } else {
                System.out.println("Lista de tarefas vazia");
            }
        }
        System.out.println(contador);
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.getStatus()) {
                tarefasConcluidas.add(t);
            }
        }
        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.getStatus()) {
                tarefasPendentes.add(t);
            }
        }
        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                t.setStatus(false);
            }
        }
    }


    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Capinar jardim");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Lavar o carro");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaConcluida("Capinar jardim");

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaPendente("Capinar jardim");
        listaTarefas.obterTarefasPendentes();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
