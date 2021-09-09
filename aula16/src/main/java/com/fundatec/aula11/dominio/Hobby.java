package com.fundatec.aula11.dominio;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hobby")
public class Hobby {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "funcao")
    private String funcao;

    @ManyToMany
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private List<Pessoa> pessoas;

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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Hobby(Long id, String nome, String funcao, List<Pessoa> pessoas) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.pessoas = pessoas;
    }

    public Hobby() {
    }
}
