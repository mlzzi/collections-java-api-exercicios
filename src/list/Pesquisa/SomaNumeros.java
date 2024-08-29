package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numbersList;

    public SomaNumeros() {
        this.numbersList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numbersList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer i : numbersList) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (int i : numbersList) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = numbersList.get(0);
        for (int i : numbersList) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numbersList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(361);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(142);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}
