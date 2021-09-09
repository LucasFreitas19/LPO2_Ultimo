package com.fundatec.aula11.repositorio;

import com.fundatec.aula11.dominio.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{
}
