import java.util.Scanner;

public class BancoDeDados {
    static Scanner sc = new Scanner(System.in);

    static private final int MAX_PESSOAS = 1000;
    static private Pessoa[] listaDePessoas = new Pessoa[MAX_PESSOAS];
    static private int ultimaPessoa = 0;

    public static void main(String[] args) {
        String nomeTemp, cpfTemp, ruaTemp, cepTemp, cidadeTemp, crmTemp, especialidadeTemp;

        int opcao;

        while (true) {
            System.out.println("Bem vindo ao gerenciamento de pessoas, o que deseja fazer?");
            System.out.println("1. Cadastrar uma pessoa comum;");
            System.out.println("2. Cadastrar um medico;");
            System.out.println("3. Cadastrar um paciente;");
            System.out.println("4. Listar dados de uma pessoa específica;");
            System.out.println("5. Listar dados de todas as pessoas;");
            System.out.println("Digite qualquer outra opcao para sair.");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Otimo, vamos cadastrar uma PESSOA. Para comecar, precisamos saber algumas " +
                            "informacoes sobre ela.");
                    nomeTemp = pergunte("Qual o Nome?");
                    cpfTemp = pergunte("Qual o CPF?");
                    ruaTemp = pergunte("Qual a rua?");
                    cepTemp = pergunte("Qual o CEP?");
                    cidadeTemp = pergunte("Qual a cidade?");
                    Pessoa pessoa = new Pessoa(nomeTemp, cpfTemp, new Endereco(ruaTemp, cepTemp, cidadeTemp));
                    adicionaPessoa(pessoa);
                    break;
                case 2:
                    System.out.println("Otimo, vamos cadastrar um MEDICO. Para comecar, precisamos saber algumas " +
                            "informacoes sobre ele.");
                    nomeTemp = pergunte("Qual o Nome?");
                    cpfTemp = pergunte("Qual o CPF?");
                    ruaTemp = pergunte("Qual a rua?");
                    cepTemp = pergunte("Qual o CEP?");
                    cidadeTemp = pergunte("Qual a cidade?");
                    crmTemp = pergunte("Qual a CRM?");
                    especialidadeTemp = pergunte("Qual a especialidade?");
                    Pessoa medico = new Medico(nomeTemp, cpfTemp, new Endereco(ruaTemp, cepTemp, cidadeTemp), crmTemp, especialidadeTemp);
                    adicionaPessoa(medico);
                    break;
                case 3:
                    System.out.println("Otimo, vamos cadastrar um PACIENTE. Para comecar, precisamos saber algumas " +
                            "informacoes sobre ele.");
                    nomeTemp = pergunte("Qual o Nome?");
                    cpfTemp = pergunte("Qual o CPF?");
                    ruaTemp = pergunte("Qual a rua?");
                    cepTemp = pergunte("Qual o CEP?");
                    cidadeTemp = pergunte("Qual a cidade?");
                    Pessoa paciente = new Paciente(nomeTemp, cpfTemp, new Endereco(ruaTemp, cepTemp, cidadeTemp));
                    adicionaPessoa(paciente);
                    break;
                case 4:
                    cpfTemp = pergunte("Qual o CPF da pessoa?");
                    retornaPessoaEspecifica(cpfTemp);
                    break;
                case 5:
                    retornaTodasPessoas();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    static private String pergunte(String pergunta) {
        System.out.println(pergunta);
        return sc.nextLine();
    }

    static private void adicionaPessoa(Pessoa pessoa) {
        listaDePessoas[ultimaPessoa] = pessoa;
        ultimaPessoa++;
    }

    static private void retornaPessoaEspecifica(String cpf) {
        for (Pessoa temP :
                listaDePessoas) {
            if (temP != null) {
                if (temP.getCpf().equalsIgnoreCase(cpf)) {
                    System.out.println("=========================");
                    temP.retornaPessoa();
                    System.out.println(retornaTipo(temP));
                    System.out.println("=========================");
                    return;
                }
            } else {
                System.out.println("Cliente nao encontrado.");
                return;
            }
        }
    }

    static private void retornaTodasPessoas() {
        for (Pessoa temP :
                listaDePessoas) {
            if (temP != null) {
                System.out.println("=========================");
                temP.retornaPessoa();
                System.out.println(retornaTipo(temP));
                System.out.println("=========================");
            } else {
                return;
            }
        }
    }

    static private String retornaTipo(Pessoa temp) { // arrumar
        if (temp instanceof Pessoa) {
            return "Tipo: Pessoa";
        }
        if (temp instanceof Medico) {
            return "Tipo: Medico";
        }
        if (temp instanceof Paciente) {
            return "Tipo: Paciente";
        }
        return "Nao encontrado";
    }
}
