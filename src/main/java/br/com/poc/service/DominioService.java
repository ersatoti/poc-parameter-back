package br.com.poc.service;

import br.com.poc.model.Dominio;

import java.util.Collection;

public interface DominioService {

    Dominio save(Dominio dominio);

    Collection<Dominio> list();

    Collection<Dominio> listarPorChave(String chave);
}
