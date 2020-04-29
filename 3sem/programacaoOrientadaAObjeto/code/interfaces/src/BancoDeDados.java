import java.util.ArrayList;
import java.util.List;

/**
 * @author anton
 */
public class BancoDeDados {
  
  public List<Pessoa> pessoas = new ArrayList<>();
  
  public void addPessoa(Pessoa pessoa) {
    pessoas.add(pessoa);
  }
  
  public void remove(Pessoa pessoa) {
    pessoas.remove(pessoa);
  }
}
