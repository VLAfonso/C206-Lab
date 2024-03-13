public class Empresa {
    //atributos da empresa
    String nome;
    Produto[] prods = new Produto[10];

    public Empresa(String nome) {
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Nome da empresa: "+this.nome);
        for(int i=0; i< prods.length; i++){
            if(prods[i] != null)
                prods[i].mostraInfo();
        }
    }

    void adicionaProd(Produto produto){
        for(int i=0; i< prods.length; i++){
            if(prods[i] == null) {
                prods[i] = produto;
                break;
            }
        }
    }
}
