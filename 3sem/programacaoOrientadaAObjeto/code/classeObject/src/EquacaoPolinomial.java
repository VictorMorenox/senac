import java.util.ArrayList;
import java.util.List;

/**
 * Representar uma equação do tipo y = a x^n + b x^(n-1) + ...
 *
 * @author anton
 */

public class EquacaoPolinomial implements Cloneable {
  
  private List<Double> coeficientes;
  
  public EquacaoPolinomial(double a, Double... coeficientes) {
    this.coeficientes = new ArrayList<>();
    this.coeficientes.add(a);
//this.coeficientes.addAll(Arrays.asList(coeficientes));
    for (double coef : coeficientes) {
      this.coeficientes.add(coef);
    }
  }
  
  public void setCoefficient(int ordem, double valor) {
    coeficientes.remove(ordem);
    coeficientes.add(ordem, valor);
  }
  
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof EquacaoPolinomial)) {
      return false;
    }
    
    EquacaoPolinomial e = (EquacaoPolinomial) o;
    return this.coeficientes.equals(e.coeficientes);
    }
  
  @Override
  public String toString() {
    return "EquacaoPolinomial{" +
        "coeficientes=" + coeficientes +
        '}';
  }
  
  
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
