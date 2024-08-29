package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Subir", "Ato gente sobe.");
        dicionario.adicionarPalavra("Subir", "Ato de subir de nivel.");
        dicionario.adicionarPalavra("Descer", "Ato de descer.");
        dicionario.adicionarPalavra("Falar", "Ato de falar.");
        dicionario.adicionarPalavra("Correr", "Ato de correr.");
        dicionario.adicionarPalavra("Programar", "Ato de criar programas.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Correr");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Programar"));
    }
}
