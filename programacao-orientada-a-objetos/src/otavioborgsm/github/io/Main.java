package otavioborgsm.github.io;

import otavioborgsm.github.io.aula.exemploHeranca.Faxineiro;
import otavioborgsm.github.io.aula.exemploHeranca.Funcionario;
import otavioborgsm.github.io.aula.exemploHeranca.Gerente;
import otavioborgsm.github.io.aula.exemploHeranca.Vendedor;
import otavioborgsm.github.io.aula.exemploOrientacaoObjetos.Carro;

public class Main {
    public static void main(String[] args) {

        // Exercício Orientação a Objetos

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW X1");
        carro1.setCapacidadeTanque(60.00);

        System.out.println(carro1.toString());
        System.out.println(carro1.totalValorTanque(5.89));

        Carro carro2 = new Carro("Cinza", "GM Corsa", 40.00);
        System.out.println(carro2.toString());
        System.out.println(carro2.totalValorTanque(5.89));

        // Exercício Herança

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
