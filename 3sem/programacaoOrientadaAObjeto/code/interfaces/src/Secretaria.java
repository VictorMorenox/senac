/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 * @author anton
 */
public class Secretaria extends Pessoa implements Funcionario {
  
  private String departamento;
  private String ramal;
  
  @Override
  public String atribuicoes() {
    return "Atendimento no departamento de " + departamento;
  }
  
  @Override
  public String getIdentificacao() {
    return "CPF: " + getCpf();
  }
  //TODO: completar a info
  
  @Override
  public void cadastrar() {
    super.cadastrar();
    Scanner s = new Scanner(System.in);
    
    System.out.println("Qual é o ramal?");
    ramal = s.next();
    s.nextLine();
    
    System.out.println("Qual é o departamento?");
    departamento = s.nextLine();
  }
  
  
  @Override
  public double getRemuneracao() {
    return 50000;
  }
  
  @Override
  public java.lang.String expediente() {
    return "Das 9h as 18h";
  }
}
