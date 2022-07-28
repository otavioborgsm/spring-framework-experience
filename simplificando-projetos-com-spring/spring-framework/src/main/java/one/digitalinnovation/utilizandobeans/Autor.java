package one.digitalinnovation.utilizandobeans;

public class Autor implements AutorLivro{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void exibirAutor(){
        System.out.println(this.toString());

    }
}
