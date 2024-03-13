public class Produto {
    //atributos do produto
    String nome;
    int nota;
    int quantidade;
    Fabricante fabricante;

    //construtor do produto
    public Produto(String nome, int nota, int quantidade, String nomeFab, int cnpj) {
        this.nome = nome;
        this.nota = nota;
        this.quantidade = quantidade;
        this.fabricante = new Fabricante(nomeFab, cnpj);
    }

    void mostraInfo(){
        System.out.println("Nome do produto: "+this.nome);
        System.out.println("Nota do produto: "+this.nota);
        System.out.println("Quantidade do produto: "+this.quantidade);
        System.out.println("Nome do meu fabricante: "+this.fabricante.nome);
        System.out.println("CNPJ do meu fabricante: "+this.fabricante.cnpj);
    }
}
