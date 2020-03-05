public class Compra {
  private String produto;
  private String categoria;
  private float preco;
  private int numPedido;

  public String getProduto() {
    return produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public int getNumPedido() {
    return numPedido;
  }

  public void setNumPedido(int numPedido) {
    this.numPedido = numPedido;
  }
}
