public class Compra {
    private String produto;
    private String categoria;
    private float preco;
    private int numPedido;

    public Compra(String produto, float preco, int numPedido) {
        this.produto = produto;
        this.preco = preco;
        this.numPedido = numPedido;
    }

    public void retornaProduto() {
        System.out.println("Nome do produto: " + produto);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Numero do pedido: " + numPedido);
    }
    
    public float getPreco() {
        return preco;
    }
}
