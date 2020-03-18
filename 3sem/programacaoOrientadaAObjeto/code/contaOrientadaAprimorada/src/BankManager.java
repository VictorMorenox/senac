import java.util.Scanner;

public class BankManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mainAccount;
    int secondAccount;
    double value;

    System.out.println("Seja bem vindo ao gerenciador de banco!");
    System.out.print("Qual o nome do seu banco? ");
    String bankName = sc.nextLine();

    Bank bank = new Bank(bankName);

    System.out.println(bankName + " foi uma otima escolha!");
    System.out.println();

    int opcao;
    do {
      System.out.println("Escolha o que deseja fazer nos enviando o numero selecionado ou escreva qualquer outro numero para sair");
      System.out.println("1. Cadastrar um novo cliente;");
      System.out.println("2. Saque;");
      System.out.println("3. Deposito;");
      System.out.println("4. Transferencia;");
      System.out.println("5. Listar todos os clientes;");
      System.out.println("6. Listar cliente especifico;");
      System.out.println("7. Ver o registro de atividades.");
      opcao = sc.nextInt();
      sc.nextLine();
      switch (opcao) {
        case 1:
          if (bank.register()) {
            System.out.println("Cliente cadastrado com sucesso!");
            bank.returnEspecificAccount(bank.lastIdCustomer());
            System.out.println();
          } else {
            System.out.println("Deu erro ao cadastrar o cliente, favor tentar novamente mais tarde.");
          }
          break;
        case 2:
          System.out.println("De qual conta voce deseja sacar?");
          bank.returnAllAccounts();
          mainAccount = sc.nextInt();
          System.out.println("Qual o valor?");
          value = sc.nextDouble();
          sc.nextLine();
          if (bank.withdraw(mainAccount, value)) {
            System.out.println("Voce sacou " + value);
          } else {
            System.out.println("Saldo insuficiente!");
          }
          break;
        case 3:
          System.out.println("Para qual conta deseja depositar?");
          mainAccount = sc.nextInt();
          System.out.println("Qual o valor?");
          value = sc.nextDouble();
          sc.nextLine();
          bank.deposit(mainAccount, value);
          System.out.println("Voce depositou " + value);
          break;
        case 4:
          System.out.println("De qual conta deseja transferir?");
          mainAccount = sc.nextInt();
          System.out.println("Para qual conta deseja transferir?");
          secondAccount = sc.nextInt();
          System.out.println("Qual valor?");
          value = sc.nextDouble();
          sc.nextLine();
          if (bank.transfer(mainAccount, secondAccount, value)) {
            System.out.println("Voce transferiu " + value + " da conta " + mainAccount + " para a conta " + secondAccount);
          } else {
            System.out.println("Saldo insuficiente!");
          }
          break;
        case 5:
          bank.returnAllAccounts();
          break;
        case 6:
          System.out.println("Digite o numero da conta para saber os dados: ");
          mainAccount = sc.nextInt();
          bank.returnEspecificAccount(mainAccount);
          break;
        case 7:
          bank.returnLog();
          break;
        default:
          System.exit(1);
      }
    } while (true);
  }
}
