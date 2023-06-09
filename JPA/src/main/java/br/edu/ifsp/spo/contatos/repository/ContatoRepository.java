package br.edu.ifsp.spo.contatos.repository;

import br.edu.ifsp.spo.contatos.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
@Repository
public interface ContatoRepository  extends JpaRepository<Contato,Long>, JpaSpecificationExecutor<Contato> {
}
