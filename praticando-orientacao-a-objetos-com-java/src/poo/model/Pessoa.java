package poo.model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    private TipoPessoa tipoPessoa;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF) {
            setDocumento(documento, TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, TipoPessoa.JURIDICA);
        }else{
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }
    }

    public void setDocumento(String documento, TipoPessoa tipo){
        this.documento = documento;
        this.tipoPessoa = tipo;
    }
}
