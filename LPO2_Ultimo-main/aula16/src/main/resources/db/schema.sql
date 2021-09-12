CREATE TABLE pessoa (
    id bigserial NOT NULL,
    nome varchar(255),
    CONSTRAINT pessoa_pkey PRIMARY KEY(id)
    CONSTRAINT hobby_fkey FOREIGN KEY(id_hobby)
        REFERENCES hobby(id)

);

CREATE TABLE info_comercial
    id bigserial NOT NULL,
    empresa varchar(100),
    funcao varchar(100),
    id_pessoa bigserial,
    CONSTRAINT info_comercial_pessoa_pkey PRIMARY KEY(id)



CREATE TABLE endereco (
    id bigserial NOT NULL,
    logradouro varchar(255),
    id_pessoa bigserial,
    CONSTRAINT endereco_pkey PRIMARY KEY(id),
    CONSTRAINT pessoa_fkey FOREIGN KEY(id_pessoa)
    REFERENCES pessoa(id)
);

CREATE TABLE hobby(
    id bigserial NOT NULL,
    nome varchar(30),
    funcao varchar(100),
    CONSTRAINT hobby_pkey PRIMARY KEY(id)
    CONSTRAINT pessoa_fkey FOREIGN KEY(id_pessoa)
    REFERENCES pessoa(id)
)

CREATE TABLE contatos (
    id bigserial NOT NULL,
    nome varchar(30),
    numero varchar(14),
    id_pessoa bigserial,
    CONSTRAINT contatos_pkey PRIMARY KEY(id),
    CONSTRAINT pessoa_fkey FOREIGN KEY(id_pessoa)
    REFERENCES pessoa(id)
);
