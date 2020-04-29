/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 * @author anton
 */
public class Medico extends Pessoa implements Funcionario {
  
  private int crm;
  private String especialidade;
  private Paciente[] pacientes;
  
  // Construtor padrão
  public Medico() {
  }
  
  public Medico(String cpf) {
    super(cpf);
  }
  
  @Override
  public String atribuicoes() {
    return "Atendimento na especialidade de " + especialidade;
  }
  
  @Override
  public String getIdentificacao() {
    return "CRM: " + crm;
  }
  
  @Override
  public void cadastrar() {
    super.cadastrar();
    
    Scanner s = new Scanner(System.in);
    System.out.println("Qual é o CRM?");
    crm = s.nextInt();
    s.nextLine();
    
    System.out.println("Qual é a especialidade?");
    especialidade = s.nextLine();
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("CRM: " + crm);
    System.out.println("Especialidade: " + especialidade);
  }
  
  
  @Override
  public double getRemuneracao() {
    return 10000;
  }
  
  @Override
  public java.lang.String expediente() {
    return "Das 9h00 as 17h00";
  }
}
