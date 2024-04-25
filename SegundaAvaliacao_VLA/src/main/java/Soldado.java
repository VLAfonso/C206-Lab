public abstract class Soldado {
    //Atributos do soldado
    public static int qtdSoldado;
    private String nome;
    private long cpf;
    ItemEspecial itemEspecial = null;

    //Construtores do soldado - com e sem item especial
    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado++;
    }
    public Soldado(String nome, long cpf, ItemEspecial itemEspecial) {
        this.nome = nome;
        this.cpf = cpf;
        this.itemEspecial = itemEspecial;
        qtdSoldado++;
    }

    //Mostrar informações do soldado
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        if(itemEspecial!=null){
            System.out.println("Item especial: "+this.itemEspecial.tipo);
        }
    }

    //Usar item especial, caso tenha o item
    public void usandoItem(){
        if(itemEspecial!=null){
            System.out.println(this.nome+" utilizando item especial.");
        }
        else{
            System.out.println(this.nome+" não tem item especial para utilizar.");
        }
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }
}
