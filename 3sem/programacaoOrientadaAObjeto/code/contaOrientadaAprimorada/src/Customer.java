import java.util.Scanner;

public class Customer {

  private String nome;
  private String cpf;
  private int numero;

  public void register(int numero) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    nome = sc.nextLine();
    System.out.println("Qual o seu CPF?");
    cpf = sc.nextLine();
    this.numero = numero;
  }

  public String getCpf() {
    return cpf;
  }
}
