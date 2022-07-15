package otavioborgsm.github.io;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW X1");
        carro1.setCapacidadeTanque(60.00);

        System.out.println(carro1.toString());
        System.out.println(carro1.totalValorTanque(5.89));

        Carro carro2 = new Carro("Cinza", "GM Corsa", 40.00);
        System.out.println(carro2.toString());
        System.out.println(carro2.totalValorTanque(5.89));
    }
}
