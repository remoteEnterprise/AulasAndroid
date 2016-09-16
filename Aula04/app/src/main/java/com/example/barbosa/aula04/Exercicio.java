package com.example.barbosa.aula04;

import android.media.Image;

/**
 * Created by barbosa on 06/09/16.
 */
public class Exercicio {
    private String nome;
    private Image imagem;
    private String descricao;

    public Exercicio(String nome, Image imagem, String descricao) {
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
