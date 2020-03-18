public class Account {
  private final double SALDO_INICIAL = 0;

  private int numero;
  private double saldo;
  private String cpf;

  public Account(String cpf, int numero) {
    saldo = SALDO_INICIAL;
    this.cpf = cpf;
    this.numero = numero;
  }

  public boolean subtract(double value) {
    if (value <= saldo) {
      saldo -= value;
      return true;
    } else {
      return false;
    }
  }

  public void sum(double value) {
    saldo += value;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getCpf() {
    return cpf;
  }
}