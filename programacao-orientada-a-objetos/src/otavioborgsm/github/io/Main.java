package otavioborgsm.github.io;

import otavioborgsm.github.io.aula.exemploHeranca.Faxineiro;
import otavioborgsm.github.io.aula.exemploHeranca.Funcionario;
import otavioborgsm.github.io.aula.exemploHeranca.Gerente;
import otavioborgsm.github.io.aula.exemploHeranca.Vendedor;
import otavioborgsm.github.io.aula.exemploOrientacaoObjetos.Carro;
import otavioborgsm.github.io.aula.exemploPolimorfismo.Mae;
import otavioborgsm.github.io.aula.exemploPolimorfismo.PrimeiraFilha;
import otavioborgsm.github.io.aula.exemploPolimorfismo.SegundaFilha;

public class Main {
    public static void main(String[] args) {

        // Exercício Orientação a Objetos

        System.out.println("----- CRIAÇÃO DE OBJETOS -----");
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

        //Vendedor vendedor_ = (Vendedor) new Funcionario();

        // Exercício Polimorfismo
        System.out.println("----- POLIMORFISMO -----");

        Mae[] classes = new Mae[]{new PrimeiraFilha(), new SegundaFilha(), new Mae()};

        for (Mae classe: classes) {
            classe.method1();
        }

        System.out.println("");

        for (Mae classe: classes) {
            classe.method2();
        }

        System.out.println("");

        SegundaFilha segundaFilha = new SegundaFilha();
        segundaFilha.method2();
    }
}
