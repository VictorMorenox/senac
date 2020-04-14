import java.util.Scanner;

public class Customer {
  
  private String nome;
  private String cpf;
  private Account conta;
  
  public void register(int numero) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    nome = sc.nextLine();
    System.out.println("Qual o seu CPF?");
    cpf = sc.nextLine();
  }
  
  public String getCpf() {
    return cpf;
  }
}
