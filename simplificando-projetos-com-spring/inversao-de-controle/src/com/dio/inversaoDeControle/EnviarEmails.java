package com.dio.inversaoDeControle;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha) {

    }

    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("STM", "contato@email.com", "password");
    }

    public void retornar(String mensagem){
        System.out.println("E-mail enviado!");
    }
}
