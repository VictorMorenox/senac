public class EspecialAccount extends Account {
  
  int limit = 1000;
  
  public EspecialAccount(int numero) {
    super(numero);
  }
  
  
  @Override
  public boolean subtract(double value) {
    if (Math.abs(value - saldo) <= limit) {
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
