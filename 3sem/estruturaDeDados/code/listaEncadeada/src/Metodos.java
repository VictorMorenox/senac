 public class Metodos {
  
  private static Agenda inicio = null, atual, aux;
  
  /**
   * Cria um contato novo
   *
   * @param nome - String Nome do contato
   * @param cel  - String Celular do contato
   */
  public static void criaContato(String nome, String cel) {
    Agenda contato = new Agenda();
    if (inicio == null) {
      inicio = contato;
      inicio.setNome(nome);
      inicio.setCel(cel);
      inicio.setProx(null);
      aux = inicio;
    } else {
      atual = contato;
      aux.setProx(atual);
      atual.setNome(nome);
      atual.setCel(cel);
      atual.setProx(null);
      aux = atual;
    }
  }
  
  /**
   * Exibe todos os contatos da Lista Simplesmente Encadeada
   */
  public static void exibeLista() {
    Agenda exibe = inicio;
    while (exibe != null) {
      System.out.println("Nome: " + exibe.getNome() + " - " + "Cel: " + exibe.getCel());
      exibe = exibe.getProx();//retornar o próximo elemento (nó) lista
    }
  }
  
  /**
   * Contagem de elementos da lista
   *
   * @return - int quantidade de elementos
   */
  public static int tamanho() {
    Agenda contaElem = inicio;
    int cont = 0;
    while (contaElem != null) {
      cont++;
      contaElem = contaElem.getProx();
    }
    return cont;
  }
  
  /**
   * Pesquisar contatos na lista
   *
   * @param nome - String
   * @return Agenda - Objeto da minha lista
   */
  public static Agenda pesquisar(String nome) {
    Agenda pesq = inicio;
    while (pesq != null) {
      if (nome.equalsIgnoreCase(pesq.getNome())) {
        return pesq;
      }
      pesq = pesq.getProx();
    }
    return null;
  }
  
  /**
   * @param nome String
   */
  public static void remover(String nome) {
    Agenda rem = inicio;
    Agenda auxRem = inicio;
    while (rem != null) {
      if (nome.equalsIgnoreCase(rem.getNome())) {
        if (rem == inicio) {//Remover o primeiro da lista
          inicio = rem.getProx();
          rem.setProx(null);
        } else if (rem == atual) {//Remover o último da lista
          atual = auxRem;//Desloca atual para o nó anterior
          aux = auxRem;
          auxRem.setProx(null);
        } else {//Remoção de elemento qualquer
          auxRem.setProx(rem.getProx());
          rem.setProx(null);
        }
      }
      auxRem = rem;
      rem = rem.getProx();
    }
  }
}
