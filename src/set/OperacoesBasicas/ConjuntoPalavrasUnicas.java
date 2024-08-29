package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : palavraSet) {
            if (p == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        System.out.println(palavraSet.contains(palavra));
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }


    @Override
    public String toString() {
        return palavraSet.toString();
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("patins");
        conjuntoPalavrasUnicas.adicionarPalavra("pascoa");
        conjuntoPalavrasUnicas.adicionarPalavra("girafa");
        conjuntoPalavrasUnicas.adicionarPalavra("girafa");
        conjuntoPalavrasUnicas.adicionarPalavra("azeitona");
        conjuntoPalavrasUnicas.adicionarPalavra("carro");

        System.out.println(conjuntoPalavrasUnicas);

        conjuntoPalavrasUnicas.removerPalavra("pascoa");
        System.out.println(conjuntoPalavrasUnicas);

        conjuntoPalavrasUnicas.verificarPalavra("girafa");
        conjuntoPalavrasUnicas.verificarPalavra("ioio");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
