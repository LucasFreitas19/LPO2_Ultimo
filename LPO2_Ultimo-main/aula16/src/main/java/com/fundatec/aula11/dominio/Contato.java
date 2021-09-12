package com.fundatec.aula11.dominio;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero")
    private String numero;

    @ManyToOne()
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    @JsonBackReference
    private Pessoa pessoa;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Contato() {
    }

    public Contato(Long id, String nome, String numero, Pessoa pessoa) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.pessoa = pessoa;
    }
}
