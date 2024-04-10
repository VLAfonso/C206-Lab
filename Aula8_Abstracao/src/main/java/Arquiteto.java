public class Arquiteto extends Funcionario implements GerenciaProjeto{
    private String especialidade;

    public Arquiteto(String nome, int idade, float salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialidade do Arquiteto: "+this.especialidade);
    }

    @Override
    public void executaAcao(){
        System.out.println("Desenhando...");
    }

    @Override
    public void Gerencia() {
        System.out.println("Gerenciando projeto de arquitetura!");
    }
}
