public class Main {
    public static void main(String[] args) {
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste();

        int contador = Teste.contador;
        System.out.println(contador);

        Teste t4 = new Teste();
        Teste t5 = new Teste();


        Funcionario f1 = new Funcionario("Jorge");
        Funcionario f2 = new Funcionario("Lylian");
        Funcionario f3 = new Funcionario("Lanna");

        System.out.println("Nome do funcionário: "+f1.nome+", id: "+f1.id);
        System.out.println("Nome do funcionário: "+f2.nome+", id: "+f2.id);
        System.out.println("Nome do funcionário: "+f3.nome+", id: "+f3.id);

        System.out.println(Funcionario.getCont());
    }
}
