package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "00000";

        Cliente cliente = new Cliente();

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }

    }
}
