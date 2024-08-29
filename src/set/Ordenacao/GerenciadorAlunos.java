package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoSet.remove(a);
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparadorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Mateus", 123456L, 7d);
        gerenciadorAlunos.adicionarAluno("Bianca", 123440L, 6.1d);
        gerenciadorAlunos.adicionarAluno("Julia", 123403L, 9d);
        gerenciadorAlunos.adicionarAluno("Gustavo", 123539L, 0d);
        gerenciadorAlunos.adicionarAluno("Antonia", 125539L, 10d);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(123456);
        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
