package otavioborgsm.github.io.aula.exemploVisibilidade.segundoPacote;

import otavioborgsm.github.io.aula.exemploVisibilidade.pacote.Classe1;

public class Classe4 {
    Classe1 classe1;
    
    void metodo(){

        String atributo3 = classe1.atributo3;

        classe1.metodo3();
    }
}
