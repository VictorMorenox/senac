public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        endereco = end;
    }

    public String getCpf() {
        return cpf;
    }

    public void retornaPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        endereco.retornaEndereco();
    }
}
