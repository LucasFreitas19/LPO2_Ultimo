package com.fundatec.aula11.dominio;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "info_comercial")
public class Info_Comercial {

    @Id
    private Long id;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "funcao")
    private String funcao;

    @OneToOne(mappedBy = "info_comercial")
    @JsonManagedReference
    private Pessoa pessoa;

    public Info_Comercial() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Info_Comercial(Long id, String empresa, String funcao, Pessoa pessoa) {
        this.id = id;
        this.empresa = empresa;
        this.funcao = funcao;
        this.pessoa = pessoa;
    }
}
