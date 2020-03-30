import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String opcao;
    static final int MAX_COMPRA = 4;
    static int numeroPedido = 1;
    static Compra[] listaDeCompras = new Compra[MAX_COMPRA];
    static int[][] matriz = new int[4][4];
    static int valorTotal = 0;

    public static void main(String[] args) {
        opcao = pergunteS("Qual exercicio deseja ver?\na)\nb)");

        if (opcao.equalsIgnoreCase("a")) {
            exercicioA();
        } else if (opcao.equalsIgnoreCase("b")) {
            exercicioB();
        } else {
            System.exit(0);
        }
    }

    static public void exercicioA() {
        preencheMatriz(matriz);
        printaMatriz(matriz);
        somaDiagonalPrincipal(matriz);
    }

    static public void exercicioB() {
        for (Compra compra :
                listaDeCompras) {
            String nome = pergunteS("Nome do produto: ");
            float preco = pergunteF("Preco do produto: ");
            sc.nextLine();
            Compra temp = new Compra(nome, preco, numeroPedido);
            valorTotal += temp.getPreco();
            listaDeCompras[numeroPedido - 1] = temp;
            numeroPedido++;
        }

        System.out.println("\n\nListagem dos produtos:");
        for (Compra compra :
                listaDeCompras) {
            compra.retornaProduto();
            System.out.println("==============================");
        }
        System.out.println("Valor total: " + valorTotal);
    }

    static void preencheMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    static void printaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println(soma);
    }

    static public String pergunteS(String pergunta) {
        System.out.println(pergunta);
        return sc.nextLine();
    }

    static public float pergunteF(String pergunta) {
        System.out.println(pergunta);
        return sc.nextFloat();
    }

    static public int pergunteI(String pergunta) {
        System.out.println(pergunta);
        return sc.nextInt();
    }


}






quickSort(arr[], comeco, fim) {
    if (comeco < fim)
    {
        /* pi is partitioning index, arr[pi] is now
           at right place */
        pi = partition(arr, comeco, fim);

        quickSort(arr, comeco, pi - 1);  // Before pi
        quickSort(arr, pi + 1, fim); // After pi
    }
}