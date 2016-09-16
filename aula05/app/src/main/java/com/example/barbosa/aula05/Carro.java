package com.example.barbosa.aula05;

/**
 * Created by barbosa on 09/09/16.
 */
public class Carro {
    public Carro(int idImagem, String nomeCarro) {
        this.idImagem = idImagem;
        NomeCarro = nomeCarro;
    }

    private int idImagem;
    private String NomeCarro;

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public String getNomeCarro() {
        return NomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        NomeCarro = nomeCarro;
    }



}
