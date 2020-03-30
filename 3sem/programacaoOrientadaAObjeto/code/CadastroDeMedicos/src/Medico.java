public class Medico extends Pessoa {

    String crm;
    String especialidade;

    public Medico(String nome, String cpf,Endereco endereco, String crm, String especialidade) {
        super(nome, cpf, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void retornaPessoa() {
        super.retornaPessoa();
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
}
