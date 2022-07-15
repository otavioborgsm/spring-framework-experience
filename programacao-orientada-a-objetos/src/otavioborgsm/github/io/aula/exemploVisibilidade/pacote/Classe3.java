package otavioborgsm.github.io.aula.exemploVisibilidade.pacote;

public class Classe3 {
    Classe1 classe1;

    void metodo(){
        String atributo2 = classe1.atributo2;
        String atributo3 = classe1.atributo3;

        classe1.metodo2();
        classe1.metodo3();
    }
}
