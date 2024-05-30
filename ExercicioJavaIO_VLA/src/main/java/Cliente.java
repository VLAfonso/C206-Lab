public class Cliente implements Comparable<Cliente>{
    //Atributos do cliente
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;

    //Construtor do cliente
    public Cliente(String nome, String cpf, String endereco, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Cliente o) {
        //Ordenar em ordem alfabética
        return nome.compareTo(o.nome);
    }
}
