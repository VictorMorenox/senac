/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author anton
 */
public class Paciente extends Pessoa {
  
  private Medico medico;
  
  @Override
  public String atribuicoes() {
    return "Atendimento pelo(a) Dr(a). " + medico.getNome();
  }
  
  @Override
  public String getIdentificacao() {
    return "CPF: " + getCpf();
  }
  
  @Override
  public void cadastrar() {
    super.cadastrar();
    
    medico = new Medico();
    medico.cadastrar();
  }
  
  @Override
  public void info() {
    super.info();
    
    System.out.println(
        "O médico responsável pelo paciente "
            + nome + " é " + medico.getNome()
    );
  }
  
}
