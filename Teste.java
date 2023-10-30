public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Produto Teste", 50.0, 10);

        produto.incrementarEstoque(2);
        System.out.println("Valor total em estoque: " + produto.calcularValorTotal());

        produto.realizarVenda(2);
        System.out.println("Valor total em estoque após venda: " + produto.calcularValorTotal());
    }
}