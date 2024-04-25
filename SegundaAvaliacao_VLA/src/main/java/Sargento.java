public class Sargento extends Soldado implements Defesa{
    //Atributos do sargento
    private String especializacao;
    private int experienciaCombate;

    //Construtores do sargento - com e sem item especial
    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }
    public Sargento(String nome, long cpf, ItemEspecial itemEspecial, String especializacao, int experienciaCombate) {
        super(nome, cpf, itemEspecial);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate + 300; //por ter item especial
    }

    //Mostrar informações do sargento
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialização: "+this.especializacao);
        System.out.println("Experiência de combate: "+this.experienciaCombate);
    }

    //Defender caso experiência de combate seja maior que 650
    @Override
    public void defender() {
        if(experienciaCombate>650){
            System.out.println(this.getNome()+" conseguiu se defender.");
        }
        else {
            System.out.println(this.getNome()+" não se defendeu.");
        }
    }

    //Getters e Setters
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getExperienciaCombate() {
        return experienciaCombate;
    }

    public void setExperienciaCombate(int experienciaCombate) {
        this.experienciaCombate = experienciaCombate;
    }
}
