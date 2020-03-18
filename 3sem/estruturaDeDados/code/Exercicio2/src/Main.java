import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
//    exercicioA();
    exercicioB();
  }

  // Exercicio 1
  // Leia uma matriz bidimensional quadrada de ordem 4, para armazenar numeros reais.
  // Determine a soma dos elementos na diagonal Principal.
  public static void exercicioA() {
    int linhas = 4;
    int colunas = 4;
    int[][] matriz = new int[linhas][colunas];

    //Preenche a matriz com o numero dos indices

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = 1 + (int) (Math.random() * 10);
      }
    }

    // Printar a matriz:
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    // Soma das diagonais principais
    int soma = 0;
    for (int i = 0; i < matriz.length; i++) {
        soma += matriz[i][i];
    }
    System.out.println("A soma da diagonal principal eh: " + soma);
  }

  // Exercicio 2
  // 2) Elabore um projeto contendo uma classe Compra, com os atributos:
  // produto, código e valor. Elabore uma classe para definir um array
  // de objetos, com quatro elementos. Leia e exiba os resultados,
  // exiba também o total de valor das compras.

  public static void exercicioB() {
    Scanner sc = new Scanner(System.in);
    Compra[] listaDeCompras = new Compra[4];

    for (int i = 0; i < listaDeCompras.length; i++) {
      listaDeCompras[i] = new Compra();
      System.out.print("Qual o nome do produto? ");
      listaDeCompras[i].setProduto(sc.nextLine());
      System.out.print("Qual o preco? do produto? ");
      listaDeCompras[i].setValor(sc.nextInt());
      sc.nextLine();
      listaDeCompras[i].setCodigo(i + 1);
      System.out.println();
    }

    int soma = 0;
    System.out.println("=============================================");
    for (Compra compra :
      listaDeCompras) {
      System.out.println("Codigo do produto: " + compra.getCodigo());
      System.out.println("Nome do produto: " + compra.getProduto());
      System.out.println("Preco do produto: " + compra.getValor());
      soma += compra.getValor();
      System.out.println();
    }
    System.out.println("Valor total das compras: " + soma);
  }
}
