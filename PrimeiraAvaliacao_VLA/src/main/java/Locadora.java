public class Locadora {
    //Atributos da locadora
    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar = 0;
    Carro[] carros = new Carro[30];

    //Construtor da locadora
    public Locadora(String nome, String CNPJ, String endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }

    //Mostrar informações da locadora
    void mostraInfo(){
        System.out.println("Informações da locadora:");
        System.out.println("O nome da locadora é: "+this.nome);
        System.out.println("O CNPJ da locadora é: "+this.CNPJ);
        System.out.println("O endereço da locadora é: "+this.endereco);
        System.out.println("\nOs carros da locadora são:");
        for(int i=0; i< carros.length; i++){
            if(carros[i]!=null){
                System.out.println("- Carro "+i+" -");
                carros[i].mostraInfo();
                System.out.println();
            }
        }
    }

    //Adicionar um carro à locadora
    void adicionarCarro(Carro carro){
        for(int i=0; i< carros.length; i++) {
            if (carros[i] == null) {
                carros[i] = carro;
                //Verificar se o carro está disponível para alugar
                if(!carro.alugado){
                    carrosParaAlugar += 1;
                }
                break;
            }
        }
    }

    //Calcular porcentagem dos carros disponíveis para alugar
    float contarCarrosParaAlugar(){
        int totalCarros = 0; //total de carros
        //Calcular total de carros
        for(int i=0; i< carros.length; i++) {
            if (carros[i] != null) {
                totalCarros += 1;
            }
        }
        //Calcular a porcentagem e retornar o valor
        if(totalCarros != 0){
            return ((float) this.carrosParaAlugar /totalCarros)*100;
        }
        else{
            return 0;
        }
    }

    //Mostrar quantidade de carros de cada modelo
    void qtdCarrosModelo(){
        int qtdHilux = 0, qtdFusca = 0, qtdCamaro = 0; //contador de cada modelo
        for(int i=0; i< carros.length; i++) {
            if (carros[i] != null) {
                if(carros[i].modelo.equals("HILUX")){
                    qtdHilux += 1;
                }
                else if(carros[i].modelo.equals("FUSCA")){
                    qtdFusca += 1;
                }
                else if(carros[i].modelo.equals("CAMARO")){
                    qtdCamaro += 1;
                }
            }
        }
        System.out.println("A locadora possui:");
        System.out.println(qtdHilux+" carros do modelo HILUX;");
        System.out.println(qtdFusca+" carros do modelo FUSCA;");
        System.out.println(qtdCamaro+" carros do modelo CAMARO.");
    }
}
