import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Aluno[] listaDeAlunos = new Aluno[2];

    for (int i = 0; i < listaDeAlunos.length; i++) {
      listaDeAlunos[i] = new Aluno();
      System.out.println("Aluno número: " + (i + 1));
      System.out.println("Qual o nome do aluno?");
      listaDeAlunos[i].setName(sc.nextLine());
      System.out.println("Qual a altura do aluno em centimetro?");
      listaDeAlunos[i].setAltura(sc.nextInt());
      System.out.println("Qual o ano de nascimento do aluno?");
      listaDeAlunos[i].setBirthdateYear(sc.nextInt());
      sc.nextLine();
      System.out.println("Qual o sexo do aluno? (Masculino ou Feminino)");
      listaDeAlunos[i].setGenero(sc.nextLine());
      System.out.println("Qual o peso do aluno?");
      listaDeAlunos[i].setPeso(sc.nextInt());
      sc.nextLine();
      System.out.println();
    }
    System.out.println("\n\nRelatório dos alunos!");
    for (Aluno aluno :
        listaDeAlunos) {
      System.out.println("Nome do aluno: " + aluno.getName());
      System.out.println("Altura do aluno: " + aluno.getAltura());
      System.out.println("Ano de nascimento do aluno: " + aluno.getBirthdateYear() + ". Aluno tem " + aluno.calculaIdade() + " anos.");
      System.out.println("Sexo do aluno: " + aluno.getGenero());
      System.out.println("Peso do aluno: " + aluno.getPeso());
      System.out.println("O peso ideal do aluno é: " + aluno.verificaPesoIdeal());
      System.out.println();
    }
  }
}
