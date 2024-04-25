public class Oficial extends Soldado implements Defesa{
    //Atributo do oficial
    private String patente;

    //Construtores do oficial - com e sem item especial
    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }
    public Oficial(String nome, long cpf, ItemEspecial itemEspecial, String patente) {
        super(nome, cpf, itemEspecial);
        this.patente = patente;
    }

    //Mostrar informações do oficial
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: "+this.patente);
    }

    //Defender caso tenha item especial
    @Override
    public void defender() {
        if(itemEspecial!=null){
            System.out.println(this.getNome()+" conseguiu se defender.");
        }
        else {
            System.out.println(this.getNome()+" não se defendeu.");
        }
    }

    //Getters e Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
