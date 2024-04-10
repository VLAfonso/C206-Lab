public class Main {
    public static void main(String[] args) {
        Funcionario[] funcs = new Funcionario[5];

        Engenheiro e = new Engenheiro("Gabriel", 22, 700, "Computação");
        e.mostraInfo();
        e.executaAcao();

        Arquiteto a = new Arquiteto("Virginia", 20, 500, "Casa");

        Professor p = new Professor("Eduardo", 20, 500, "POO");

        funcs[0] = e;
        funcs[1] = a;
        funcs[2] = p;

        for(int i=0; i< funcs.length; i++){
            if(funcs[i]!=null){
                if(funcs[i] instanceof Engenheiro){
                    Engenheiro ex = (Engenheiro) funcs[i];
                    ex.executaAcao();
                    ex.mostraInfo();
                    ex.Gerencia();
                }
                if(funcs[i] instanceof Arquiteto){
                    Arquiteto ax = (Arquiteto) funcs[i];
                    ax.executaAcao();
                    ax.mostraInfo();
                    ax.Gerencia();
                }
                if(funcs[i] instanceof Professor){
                    Professor px = (Professor) funcs[i];
                    px.executaAcao();
                    px.mostraInfo();
                    px.corrigirProva();
                }
            }
        }
    }
}
