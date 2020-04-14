public class EspecialAccount extends Account {
  
  public EspecialAccount(int numero) {
    super(numero);
  }
  
  
  @Override
  public boolean subtract(double value) {
    if (Math.abs(value - saldo) <= 1000) {
      saldo -= value;
      return true;
    }
    return false;
  }
  
  @Override
  public void sum(double value) {
    super.sum(value);
  }
}
