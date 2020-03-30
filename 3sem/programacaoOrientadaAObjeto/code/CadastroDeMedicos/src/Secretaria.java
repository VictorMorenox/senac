public class Secretaria extends Pessoa {

    private String departamento;
    private String ramal;

    public Secretaria(String nome, String cpf, Endereco endereco, String departamento, String ramal) {
        super(nome, cpf, endereco);
        this.departamento = departamento;
        this.ramal = ramal;
    }
}
