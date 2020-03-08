public class Bank {
  private static int numTotalContas = 4;

  private String nome;
  private int codigo;
  private Customer[] customers;
  private Account[] accounts;

  public Bank(String nome) {
    this.nome = nome;
    codigo = 1;
    customers = new Customer[numTotalContas];
    accounts = new Account[numTotalContas];
  }

  public boolean register() {
    try {
      Customer customer = new Customer();
      customer.register(codigo);
      customers[indexAccount(codigo)] = customer;
      Account account = new Account(customer.getCpf(), codigo);
      accounts[indexAccount(codigo)] = account;
      codigo++;
      return true;
    } catch (Exception ex) {
      System.out.println(ex);
      return false;
    }
  }

  public int indexAccount(int numero) {
    return numero - 1;
  }

  public boolean withdraw(int accountNumber, double value) {
    if (accounts[indexAccount(accountNumber)].subtract(value)) {
      return true;
    }
    return false;
  }

  public boolean deposit(int accountNumber, double value) {
    accounts[indexAccount(accountNumber)].sum(value);
    return true;
  }

  public boolean transfer(int mainAccount, int secondAccount, double value) {
    if (accounts[indexAccount(mainAccount)].subtract(value)) {
      accounts[indexAccount(secondAccount)].sum(value);
      return true;
    }
    return false;
  }

  public void returnAllAccounts() {
    for (Account account :
      accounts) {
      if (account == null) {
        continue;
      }
      System.out.println("Codigo da conta: " + account.getNumero());
      System.out.println("CPF do titular: " + account.getCpf());
      System.out.println("Saldo da conta: " + account.getSaldo());
      System.out.println("==========================================");
    }
    System.out.println();
  }

  public void returnEspecificAccount(int numero) {
    System.out.println("Codigo da conta: " + accounts[indexAccount(numero)].getNumero());
    System.out.println("CPF do titular: " + accounts[indexAccount(numero)].getCpf());
    System.out.println("Saldo da conta: " + accounts[indexAccount(numero)].getSaldo());
    System.out.println();
  }

  public String nomeBanco() {
    return nome;
  }

  public int lastIdCustomer() {
    return accounts[indexAccount(codigo - 1)].getNumero();
  }
}
