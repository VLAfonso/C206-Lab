public class Aluno implements Comparable<Aluno>{
    //Atributos do aluno
    private String nome;
    private int matricula;
    private String curso;
    private float media;

    //Ordenar alunos por ordem crescente de média
    @Override
    public int compareTo(Aluno o) {
        return Float.compare(this.media, o.media);
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws InfoInvalidaException {
        //Verificar se a matrícula possui um valor válido
        if(matricula>0){
            this.matricula = matricula;
        }
        else{
            throw new InfoInvalidaException("Matrícula inválida!");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) throws InfoInvalidaException {
        //Verificar se é um curso válido
        if(curso.equals("Computação")||curso.equals("Software")||curso.equals("Telecomunicações")){
            this.curso = curso;
        }
        else{
            throw new InfoInvalidaException("Curso inválido!");
        }
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
