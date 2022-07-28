package com.dio.injecaodedependencia;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());
        condutor.automovel();
    }

    private Veiculo veiculo;

    public Condutor(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void automovel(){
        veiculo.acao();
    }
}
