public class UsaListaEncadeada {
  
  public static void main(String[] args) {
    Metodos.criaContato("Gerson", "123");
    Metodos.criaContato("Sandra", "321");
    Metodos.criaContato("Anna", "231");
    Metodos.criaContato("José", "943");
    Metodos.criaContato("Ronda", "993");
    Metodos.criaContato("Mel", "902");
    System.out.println("Tamanho da lista:" + Metodos.tamanho());
    
    try {
      Agenda pesq = Metodos.pesquisar("Ana");
      System.out.println("Nome: " + pesq.getNome());
      System.out.println("Cel: " + pesq.getCel());
    } catch (NullPointerException e) {
      System.out.println("Contato não encontrado!!");
    }
    
    Metodos.remover("Gerson");
    Metodos.exibeLista();
    
    
  }
}
