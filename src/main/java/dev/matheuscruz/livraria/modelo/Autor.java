package dev.matheuscruz.livraria.modelo;

import java.util.UUID;

public class Autor {

    private String id;
    private String nome;
    private String sobrenome;

    public static Autor criarAutor(String nome, String sobrenome) {
        return new Autor(nome, sobrenome);
    }

    Autor() {
    }

    Autor(String nome, String sobrenome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
