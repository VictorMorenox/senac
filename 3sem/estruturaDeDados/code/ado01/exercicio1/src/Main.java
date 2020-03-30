import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String opcao;
    static final int MAX_COMPRA = 4;
    static int numeroDoPedido = 1;
    static Compra[] listaDeCompras = new Compra[MAX_COMPRA];
    static ArrayList<Compra> listaCompras = new ArrayList<Compra>();

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
        for (Compra compra :
                listaDeCompras) {
            String nome = pergunteS("Nome do produto: ");
            String categoria = pergunteS("Categoria do produto: ");
            float preco = pergunteF("Preco do produto: ");
            sc.nextLine();
            Compra temp = new Compra(nome, categoria, preco, numeroDoPedido);
            listaDeCompras[numeroDoPedido - 1] = temp;
            numeroDoPedido++;
        }

        System.out.println("\n\nListagem dos produtos:");
        for (Compra compra :
                listaDeCompras) {
            compra.retornaProduto();
            System.out.println("==============================");
        }
    }

    static public void exercicioB() {
        do {
            opcao = pergunteS("Deseja cadastrar um item? (Sim, Nao)");

            if (opcao.equalsIgnoreCase("sim")) {
                String nome = pergunteS("Nome do produto: ");
                String categoria = pergunteS("Categoria do produto: ");
                float preco = pergunteF("Preco do produto: ");
                sc.nextLine();
                Compra temp = new Compra(nome, categoria, preco, numeroDoPedido);
                listaCompras.add(temp);
                numeroDoPedido++;
            }
        } while (opcao.equalsIgnoreCase("sim"));

        System.out.println("\n\nListagem dos produtos:");
        for (Compra compra :
                listaCompras) {
            compra.retornaProduto();
            System.out.println("==============================");
        }
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
