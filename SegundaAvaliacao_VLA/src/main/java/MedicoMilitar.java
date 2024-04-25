public class MedicoMilitar extends Soldado implements Curar{
    //Atributos do médico militar
    private int anosExperiencia;
    private int capacidadeEmergencia;

    //Construtores do médico militar - com e sem item especial
    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }
    public MedicoMilitar(String nome, long cpf, ItemEspecial itemEspecial, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf, itemEspecial);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia + 100; //por ter item especial
    }

    //Mostrar informações do médico militar
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de Experiência: "+this.anosExperiencia);
        System.out.println("Capacidade de Emergência: "+this.capacidadeEmergencia);
    }

    //Curar caso a capacidade de emergência for maior que 920
    @Override
    public void curar() {
        if(capacidadeEmergencia>920){
            System.out.println(this.getNome()+" conseguiu curar.");
        }
        else{
            System.out.println(this.getNome()+" não tem capacidade de curar.");
        }
    }

    //Getters e setters
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getCapacidadeEmergencia() {
        return capacidadeEmergencia;
    }

    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }
}
