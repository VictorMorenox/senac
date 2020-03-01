import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static ArrayList<Conta> listaDeContas = new ArrayList<Conta>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean passou;
    double valor;
    int contaEscolhida;
    int opcao = 0;
    do {
      System.out.println("=============================================");
      System.out.println("O que voce deseja fazer?");
      System.out.println("1. Criar uma nova conta");
      System.out.println("2. Sacar dinheiro");
      System.out.println("3. Depositar dinheiro");
      System.out.println("4. Transferir dinheiro");
      System.out.println("5. Listar todas as contas");
      System.out.println("6. Sair");
      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          Conta conta = new Conta();
          System.out.println("Qual o nome do dono da conta?");
          conta.setNome(sc.nextLine());
          System.out.println("Qual o cpf do dono da conta?");
          conta.setCpf(sc.nextLine());
          conta.setId(ultimoNumeroConta());
          System.out.println("Qual o saldo da conta?");
          conta.setSaldo(sc.nextDouble());
          listaDeContas.add(conta);
          System.out.println("Conta criada com sucesso!");
          System.out.println("Informacoes da conta:");
          System.out.println("Nome: " + conta.getNome() + ", CPF: " + conta.getCpf() +
            ", Numero: " + conta.getId() + ", Saldo atual: " + conta.getSaldo());
          break;
        case 2:
          valor = 0;
          System.out.println("Deseja sacar de qual conta?");
          listarContas();
          opcao = sc.nextInt();
          System.out.println("Qual valor deseja sacar?");
          valor = sc.nextDouble();
          passou = false;

          for (Conta obj :
            listaDeContas) {
            if (opcao == obj.getId()) {
              obj.sacar(valor);
              passou = true;
            }
          }
          if (!passou) {
            System.out.println("Conta invalida!");
          }
          break;
        case 3:
          System.out.println("Deseja depositar de qual conta?");
          listarContas();
          opcao = sc.nextInt();
          System.out.println("Qual valor deseja depositar?");
          valor = sc.nextDouble();
          passou = false;

          for (Conta obj :
            listaDeContas) {
            if (opcao == obj.getId()) {
              obj.depositar(valor);
              passou = true;
            }
          }
          if (!passou) {
            System.out.println("Conta invalida!");
          }
          break;
        case 4:
          System.out.println("Deseja transferir de qual conta?");
          listarContas();
          opcao = sc.nextInt();
          System.out.println("Deseja transferir para qual conta?");
          contaEscolhida = sc.nextInt();
          System.out.println("Deseja transferir qual valor?");
          valor = sc.nextDouble();
          passou = false;

          // Cria o objeto para depositar da conta!
          for (Conta obj2 :
            listaDeContas) {
            if (opcao == obj2.getId()) {
              if (obj2.diminuir(valor)) {
                for (Conta obj3 :
                  listaDeContas) {
                  if (contaEscolhida == obj3.getId()) {
                    obj3.acrescentar(valor);
                    passou = true;
                  }
                }
              } else {
                System.out.println("Valor insuficiente para transferencia.");
              }
              passou = true;
            }
          }
          if (!passou) {
            System.out.println("Conta invalida!");
          }
          break;
        case 5:
          for (Conta obj :
            listaDeContas) {
            System.out.println("=========================================");
            System.out.println("Nome da conta: " + obj.getNome());
            System.out.println("Cpf da conta: " + obj.getCpf());
            System.out.println("ID da conta: " + obj.getId());
            System.out.println("Saldo da conta: " + obj.getSaldo());
          }
          break;
        case 6:
          System.out.println("Desligando sistema...");
          break;
        default:
          System.out.println("Favor digite apenas os numeros listados");
      }
    } while (opcao != 6);
  }

  public static int ultimoNumeroConta() {
    boolean passou = false;
    int ultimoId = 0;
    int id = 0;
    for (Conta conta :
      listaDeContas) {
      passou = true;
      id = conta.getId();
      if (id > ultimoId) {
        ultimoId = id + 1;
      } else {
        ultimoId = 1;
      }
    }
    if (!passou) {
      ultimoId = 1;
    }
    return ultimoId;
  }

  public static void listarContas() {
    int i = 1;
    for (Conta conta :
      listaDeContas) {
      System.out.println("Conta -> " + i);
      System.out.println("\tNome: " + conta.getNome() + " | CPF: " + conta.getCpf() + " | ID: " +
        "" + conta.getId() + " | Saldo: " + conta.getSaldo());
      i++;
    }
  }
}
