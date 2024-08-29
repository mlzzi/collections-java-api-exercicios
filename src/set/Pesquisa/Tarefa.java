package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private Boolean status = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean Status) {
        this.status = Status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao()) && Objects.equals(status, tarefa.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), status);
    }

    @Override
    public String toString() {
        return "Tarefa{" + descricao + '\'' +
                ", status=" + status +
                '}';
    }
}
