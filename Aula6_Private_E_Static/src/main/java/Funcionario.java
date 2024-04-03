public class Funcionario {
    String nome;
    int id;
    private static int cont;

    public Funcionario(String nome) {
        this.nome = nome;
        cont++;
        this.id = cont;
    }

    public static int getCont() {
        return cont;
    }
}
