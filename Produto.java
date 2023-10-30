public class Produto {
    private int codigo, estoque;
    private String descricao;
    private double valor;


    public Produto(int codigo, String descricao, double valor, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    public void incrementarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    public void realizarVenda(int quantidade) {
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public double calcularValorTotal() {
        return this.valor * this.estoque;
    }
}
