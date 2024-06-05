public class Produto implements Comparable<Produto>{
    //Atributos do produto
    private String nome;
    private double preco;
    private String tipo;

    @Override
    public int compareTo(Produto o) {
        return Double.compare(o.preco, this.preco);
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws InfoInvalidaException {
        if(preco > 0){
            this.preco = preco;
        }
        else{
            throw new InfoInvalidaException("Preço inválido!");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws InfoInvalidaException {
        if(tipo.equals("Comida")||tipo.equals("Higiene")||tipo.equals("Decoração")){
            this.tipo = tipo;
        }
        else {
            throw new InfoInvalidaException("Tipo inválido!");
        }
    }
}
