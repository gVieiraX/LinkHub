package com.tinylinkapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class LinkHub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cargo;
    private String urlPortfolio; // Corrigido para urlPortfolio
    private String email;


    public LinkHub() {
    }

    public LinkHub(String nome, String sobrenome, String cargo, String url_portfolio, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.urlPortfolio = url_portfolio;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUrlPortfolio() {
        return urlPortfolio;
    }

    public void setUrlPortfolio(String urlPortfolio) {
        this.urlPortfolio = urlPortfolio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
