package com.fundatec.aula11.dominio;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "pessoa")
    @JsonManagedReference
    private Info_Comercial info_comercial;

    @OneToMany(mappedBy = "pessoa")
    @JsonManagedReference
    private List<Endereco> enderecos;

    public Info_Comercial getInfo_comercial() {
        return info_comercial;
    }

    public void setInfo_comercial(Info_Comercial info_comercial) {
        this.info_comercial = info_comercial;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    @OneToMany(mappedBy = "pessoa")
    @JsonManagedReference
    private List<Contato> contatos;

    @ManyToMany
    @JoinColumn(name = "id_hobby", referencedColumnName = "id")
    @JsonBackReference
    private List<Hobby> hobby;

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa() {
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
