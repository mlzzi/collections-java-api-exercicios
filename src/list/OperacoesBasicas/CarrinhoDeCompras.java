package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(
            String nome,
            double preco,
            int quantidade
    ) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinhoDeCompras.remove(nome);
    }

    public double calcularValorTotal() {
        List<Item> itensParaSomar = new ArrayList<>();
        double valores = 0;
        for(Item i : carrinhoDeCompras) {
            valores += i.getPreco() * i.getQuantidade();
        }
        return valores;
    }

    public void exibirItens() {
        List<Item> itensParaMostrar = new ArrayList<>();
        for (Item i : carrinhoDeCompras) {
            System.out.println("Produto: " + i.getNome());
            System.out.println("Preço: " + i.getPreco());
            System.out.println("Quantidade: " + i.getQuantidade());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("teclado", 25.0, 1);
        carrinhoDeCompras.adicionarItem("mouse", 50.0, 3);
        carrinhoDeCompras.adicionarItem("monitor", 798.99, 4);

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
