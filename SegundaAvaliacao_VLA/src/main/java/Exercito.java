public class Exercito {
    //Atributos do exército
    private String nome;
    private Soldado[] soldados;

    //Construtor do exército
    public Exercito(String nome, Soldado[] soldados) {
        this.nome = nome;
        this.soldados = soldados;
    }

    //Mostrar informações do exército e de seus soldados
    public void mostraInfo(){
        System.out.println("Informações do exército:");
        System.out.println("Nome: "+this.nome);
        if(soldados!=null){
            System.out.println("\nInformações de seus soldados:");
            for(int i=0; i< soldados.length; i++){
                if(soldados[i]!=null){
                    //Mostrar tipo de soldado, suas informações e métodos
                    if(soldados[i] instanceof Sargento){
                        Sargento sargentoAux = (Sargento) soldados[i];
                        System.out.println("Tipo: Sargento");
                        sargentoAux.mostraInfo();
                        System.out.println("Usar item especial:");
                        sargentoAux.usandoItem();
                        System.out.println("Defender:");
                        sargentoAux.defender();
                    }
                    else if(soldados[i] instanceof Oficial){
                        Oficial oficialAux = (Oficial) soldados[i];
                        System.out.println("Tipo: Oficial");
                        oficialAux.mostraInfo();
                        System.out.println("Usar item especial:");
                        oficialAux.usandoItem();
                        System.out.println("Defender:");
                        oficialAux.defender();
                    } else if (soldados[i] instanceof MedicoMilitar) {
                        MedicoMilitar medicoMilitarAux = (MedicoMilitar) soldados[i];
                        System.out.println("Tipo: Médico Militar");
                        medicoMilitarAux.mostraInfo();
                        System.out.println("Usar item especial:");
                        medicoMilitarAux.usandoItem();
                        System.out.println("Curar:");
                        medicoMilitarAux.curar();
                    }
                    System.out.println();
                }
            }
        }
    }

    //Adicionar soldado ao exército
    public void addSoldado(Soldado s){
        for(int i=0; i< soldados.length; i++){
            if(soldados[i]==null){
                soldados[i] = s;
                break;
            }
        }
    }

    //Getteres e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Soldado[] getSoldados() {
        return soldados;
    }
}
