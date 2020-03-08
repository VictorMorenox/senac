public class Bank {
  private static int numTotalContas = 4;

  private String nome;
  private int codigoDaConta = 1;
  private Customer[] customers;
  private Account[] accounts;


  public Bank(String nome) {
    this.nome = nome;
    customers = new Customer[numTotalContas];
    accounts = new Account[numTotalContas];

  }

  public boolean register() {
    try {
      Customer customer = new Customer();
      customer.register(codigoDaConta);
      customers[getIndexValue(codigoDaConta)] = customer;
      Account account = new Account(customer.getCpf(), codigoDaConta);
      accounts[getIndexValue(codigoDaConta)] = account;
      codigoDaConta++;
//      logger = new Logger(returnLastLogId(), "create", "success", "O cliente de CPF " + customer.getCpf() +
//        " foi criado vinculado a conta de numero " + account.getNumero());
//      log.add(logger);
      return true;
    } catch (Exception ex) {
      System.out.println(ex);
//      logger = new Logger(returnLastLogId(), "create", "error", ex.toString());
//      log.add(logger);
      return false;
    }
  }

  private int getIndexValue(int numero) {
    return numero - 1;
  }

  public boolean withdraw(int accountNumber, double value) {
    if (accounts[getIndexValue(accountNumber)].subtract(value)) {
//      logger = new Logger(returnLastLogId(), "withdraw", "success", "Foi sacado um valor de " + value + " da" +
//        "conta " + accountNumber);
//      log.add(logger);
      return true;
    }
//    logger = new Logger(returnLastLogId(), "withdraw", "error", "Saldo insuficiente");
//    log.add(logger);
    return false;
  }

  public boolean deposit(int accountNumber, double value) {
    accounts[getIndexValue(accountNumber)].sum(value);
//    logger = new Logger(returnLastLogId(), "deposit", "success", "Foi depositado um valor de " + value
//      + " na conta de numero " + accountNumber);
//    log.add(logger);
    return true;
  }

  public boolean transfer(int mainAccount, int secondAccount, double value) {
    if (accounts[getIndexValue(mainAccount)].subtract(value)) {
      accounts[getIndexValue(secondAccount)].sum(value);

      // EXEMPLO DO LOG
      Logger.info(this.getClass(), "Foi transferido um valor de " + value
        + " da conta de numero " + mainAccount + " para a conta de numero " + secondAccount);

      return true;
    }
//    logger = new Logger(returnLastLogId(), "transfer", "error", "Saldo insuficiente.");
//    log.add(logger);
    return false;
  }

  public void printAllAccounts() {
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

  public void printAccountInfoById(int numero) {
    System.out.println("Codigo da conta: " + accounts[getIndexValue(numero)].getNumero());
    System.out.println("CPF do titular: " + accounts[getIndexValue(numero)].getCpf());
    System.out.println("Saldo da conta: " + accounts[getIndexValue(numero)].getSaldo());
    System.out.println();
  }

  public String nome() {
    return nome;
  }

  public int lastIdCustomer() {
    return accounts[getIndexValue(codigoDaConta - 1)].getNumero();
  }
}
