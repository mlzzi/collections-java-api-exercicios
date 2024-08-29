package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public void encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        Integer frequencia = Integer.MIN_VALUE;
        if (!contagemPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                Integer contagem = entry.getValue();
                if (contagem > frequencia) {
                    frequencia = contagem;
                    palavraFrequente = entry.getKey();
                }
            }
            System.out.println("A palavra mais frequênte é: " + palavraFrequente);
        }
    }

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.adicionarPalavra("Feijão", 10);
        contagemPalavras.adicionarPalavra("Abacate", 3);
        contagemPalavras.adicionarPalavra("Goiaba", 8);
        contagemPalavras.adicionarPalavra("Milho", 1);
        contagemPalavras.adicionarPalavra("Feijão", 12);
        contagemPalavras.adicionarPalavra("Mandioca", 456);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Feijão");
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();

    }
}
