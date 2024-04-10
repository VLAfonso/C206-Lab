public abstract class Funcionario {
    private String nome;
    private int idade;
    private float salario;

    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    void mostraInfo(){
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("salario: "+this.salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Abstrato obriga a criar esse método nas classes filhas
    public abstract void executaAcao();
}
