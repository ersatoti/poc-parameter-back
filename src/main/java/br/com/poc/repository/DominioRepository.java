package br.com.poc.repository;

import br.com.poc.model.Dominio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DominioRepository  extends CrudRepository<Dominio, Long> {

    Collection<Dominio> findByChave(String chave);
}
