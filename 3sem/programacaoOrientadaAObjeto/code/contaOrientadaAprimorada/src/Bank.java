import java.util.ArrayList;

public class Bank {
  private static int numTotalContas = 4;
  private static int logCount = 1;

  private String nome;
  private int codigo;
  private Customer[] customers;
  private Account[] accounts;
  private ArrayList<Logger> log = new ArrayList<Logger>();
  private Logger logRegister;

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
      logRegister = new Logger(returnLastLogId(), "create", "success", "O cliente de CPF " + customer.getCpf() +
        " foi criado vinculado a conta de numero " + account.getNumero());
      log.add(logRegister);
      return true;
    } catch (Exception ex) {
      System.out.println(ex);
      logRegister = new Logger(returnLastLogId(), "create", "error", ex.toString());
      log.add(logRegister);
      return false;
    }
  }

  public int indexAccount(int numero) {
    return numero - 1;
  }

  public boolean withdraw(int accountNumber, double value) {
    if (accounts[indexAccount(accountNumber)].subtract(value)) {
      logRegister = new Logger(returnLastLogId(), "withdraw", "success", "Foi sacado um valor de " + value + " da" +
        "conta " + accountNumber);
      log.add(logRegister);
      return true;
    }
    logRegister = new Logger(returnLastLogId(), "withdraw", "error", "Saldo insuficiente");
    log.add(logRegister);
    return false;
  }

  public boolean deposit(int accountNumber, double value) {
    accounts[indexAccount(accountNumber)].sum(value);
    logRegister = new Logger(returnLastLogId(), "deposit", "success", "Foi depositado um valor de " + value
      + " na conta de numero " + accountNumber);
    log.add(logRegister);
    return true;
  }

  public boolean transfer(int mainAccount, int secondAccount, double value) {
    if (accounts[indexAccount(mainAccount)].subtract(value)) {
      accounts[indexAccount(secondAccount)].sum(value);
      logRegister = new Logger(returnLastLogId(), "transfer", "success", "Foi transferido um valor de " + value
        + " da conta de numero " + mainAccount + " para a conta de numero " + secondAccount);
      log.add(logRegister);
      return true;
    }
    logRegister = new Logger(returnLastLogId(), "transfer", "error", "Saldo insuficiente.");
    log.add(logRegister);
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

  public void returnLog() {
    for (Logger log :
      log) {
      System.out.println("ID log: " + log.getId());
      System.out.println("type: " + log.getType());
      System.out.println("status: " + log.getStatus());
      System.out.println("description: " + log.getDescription());
      System.out.println("------------------------------------------------------------------------------");
      logCount++;
    }
    System.out.println();
    System.out.println();
  }

  public int returnLastLogId() {
    if (log == null) {
      return 1;
    }
    return logCount++;
  }
}
