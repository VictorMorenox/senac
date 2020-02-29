import java.util.ArrayList;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
//    arrayNormal(); // Exercicio a)
//    arrayList(); // Exercicio b)
  }

  public static void arrayNormal() {

    Scanner sc = new Scanner(System.in);

    Compra[] listaDeCompras = new Compra[4];

    // Preenche o array
    for (int i = 0; i < listaDeCompras.length; i++) {
      listaDeCompras[i] = new Compra();

      System.out.print("Qual o nome do " + (i + 1) + " produto?: ");
      listaDeCompras[i].setProduto(sc.nextLine());

      System.out.print("Digite a categoria do produto: ");
      listaDeCompras[i].setCategoria(sc.nextLine());

      System.out.print("Digite o preco do produto: ");
      listaDeCompras[i].setPreco(sc.nextFloat());

      sc.nextLine();

      listaDeCompras[i].setNumPedido(i + 1);
      System.out.println();
    }

    // Printa o array
    System.out.println("============== RELATORIO ==============");
    for (Compra compra :
      listaDeCompras) {
      System.out.println("Nome do produto: " + compra.getProduto());
      System.out.println("Categoria do produto: " + compra.getCategoria());
      System.out.println("Preco do produto: " + compra.getPreco());
      System.out.println("Numero do pedido: " + compra.getNumPedido());
      System.out.println("=============================================================");
    }
  }

  public static void arrayList() {
    Scanner sc = new Scanner(System.in);

    ArrayList<Compra> listaDeCompras = new ArrayList<Compra>();
    String opcao;
    int cont = 1;

    // Preenche o array
    do {
      Compra compra = new Compra();

      System.out.print("Qual o nome do " + cont + " produto?: ");
      compra.setProduto(sc.nextLine());

      System.out.print("Digite a categoria do produto: ");
      compra.setCategoria(sc.nextLine());

      System.out.print("Digite o preco do produto: ");
      compra.setPreco(sc.nextFloat());
      sc.nextLine();
      System.out.println();

      compra.setNumPedido(cont);

      listaDeCompras.add(compra);
      cont++;

      System.out.println("Deseja cadastrar uma nova compra? (s/n)");
      opcao = sc.nextLine();
    } while (!opcao.equalsIgnoreCase("n"));

    // Printa o relatorio
    for (Compra compra :
      listaDeCompras) {
      System.out.println("============== RELATORIO ==============");
      for (Compra pedido :
        listaDeCompras) {
        System.out.println("Nome do produto: " + pedido.getProduto());
        System.out.println("Categoria do produto: " + pedido.getCategoria());
        System.out.println("Preco do produto: " + pedido.getPreco());
        System.out.println("Numero do pedido: " + pedido.getNumPedido());
        System.out.println("=============================================================");
      }
    }
  }
}
