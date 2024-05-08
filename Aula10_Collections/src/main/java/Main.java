import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta c1 = new Conta(200, "Romulo");

        lista.add(c1);
        lista.add(20);
        lista.add(true);
        lista.add("Nome");

        lista.remove("Nome");

        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //ArrayList homogêneo
        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(120);
        inteiros.add(30);
        inteiros.add(1);
        inteiros.add(12);
        inteiros.add(20);

        for(int i=0; i< inteiros.size(); i++){
            System.out.println(inteiros.get(i));
        }

        Collections.sort(inteiros);
        Collections.reverse(inteiros);

        for(int i=0; i< inteiros.size(); i++){
            System.out.println(inteiros.get(i));
        }

        //ArrayList de contas
        ArrayList<Conta> contas = new ArrayList<>();

        //c1 criado no inicio do código
        Conta c2 = new Conta(100, "Gabriel");
        Conta c3 = new Conta(300, "Eduardo");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for(int i=0; i< contas.size(); i++){
            System.out.println(contas.get(i).getDono());
            System.out.println(contas.get(i).getSaldo());
        }

        Collections.sort(contas);

        for(int i=0; i< contas.size(); i++){
            System.out.println(contas.get(i).getDono());
            System.out.println(contas.get(i).getSaldo());
        }
    }
}
