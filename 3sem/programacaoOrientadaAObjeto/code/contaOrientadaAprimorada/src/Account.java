public class Account {
  private final double SALDO_INICIAL = 0;
  
  protected int numero;
  protected double saldo;
  protected String cpf;
  
  public Account(int numero) {
    saldo = SALDO_INICIAL;
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
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}