public class Main {
    public static void main(String[] args) {
        //Criar 2 sargentos e item especial para o segundo sargento
        Sargento sargento1 = new Sargento("Santana", 342391, "Combate Aéreo", 570);
        ItemEspecial itemEspecial1 = new ItemEspecial("Rapidez");
        Sargento sargento2 = new Sargento("Sarlo", 672898, itemEspecial1, "Combate Marítimo", 410);

        //Criar 2 oficiais eitem especial para o segundo oficial
        Oficial oficial1 = new Oficial("Otávio", 725822, "Coronel");
        ItemEspecial itemEspecial2 = new ItemEspecial("Força");
        Oficial oficial2 = new Oficial("Olavo", 525729, itemEspecial2, "Major");

        //Criar 2 médicos militares e item especial para o segundo médico militar
        MedicoMilitar medicoMilitar1 = new MedicoMilitar("Milton", 1462873, 5, 715);
        ItemEspecial itemEspecial3 = new ItemEspecial("Cura Eficiente");
        MedicoMilitar medicoMilitar2 = new MedicoMilitar("Melo", 156789, itemEspecial3, 14, 850);

        //Criar array de soldados
        Soldado[] soldados = new Soldado[10];

        //Criar exército
        Exercito exercito = new Exercito("Exército Único", soldados);

        //Adicionar soldados ao exército
        exercito.addSoldado(sargento1);
        exercito.addSoldado(sargento2);
        exercito.addSoldado(oficial1);
        exercito.addSoldado(oficial2);
        exercito.addSoldado(medicoMilitar1);
        exercito.addSoldado(medicoMilitar2);

        //Mostrar exército e seus soldados
        exercito.mostraInfo();

        //Mostrar quantidade de soldados criados
        System.out.println("Foram criados "+Soldado.qtdSoldado+" soldados.");
    }
}
