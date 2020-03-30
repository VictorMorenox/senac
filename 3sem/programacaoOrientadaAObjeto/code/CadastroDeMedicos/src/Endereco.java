public class Endereco {

    private String rua;
    private String cep;
    private String cidade;

    public Endereco(String rua, String cep, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }

    public void retornaEndereco() {
        System.out.println("Rua: "  + rua);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
    }
}
