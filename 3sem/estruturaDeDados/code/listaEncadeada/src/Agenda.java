public class Agenda {
  private String nome;
  private String cel;
  
  private Agenda prox;
  private Agenda ant;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCel() {
    return cel;
  }
  
  public void setCel(String cel) {
    this.cel = cel;
  }
  
  public Agenda getProx() {
    return prox;
  }
  
  public void setProx(Agenda prox) {
    this.prox = prox;
  }
  
  public Agenda getAnt() {
    return ant;
  }
  
  public void setAnt(Agenda ant) {
    this.ant = ant;
  }
}
