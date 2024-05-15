public class Funcionario {
    private String nome;
    private String cargo;
    private int idade;

    public Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
