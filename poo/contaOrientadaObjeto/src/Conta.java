public class Conta {

  private String nome;
  private String cpf;
  private int numero;
  private double saldo;
  private int id;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }


  // @ Metodos de funcionalidades

  public void acrescentar(double valor) {
    saldo += valor;
  }

  public boolean diminuir(double valor) {
    if (valor > saldo) {
      return false;
    }
    saldo -= valor;
    return true;
  }

  public void depositar(double valor) {
    acrescentar(valor);
  }

  public void sacar(double valor) {
    if (diminuir(valor)) {
      System.out.println("Voce sacou " + valor);
    } else {
      System.out.println("Impossivel sacar este valor, voce pode sacar ate " + saldo);
    }
  }
}
