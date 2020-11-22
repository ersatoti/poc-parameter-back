package br.com.poc.service.impl;

import br.com.poc.model.Dominio;
import br.com.poc.repository.DominioRepository;
import br.com.poc.service.DominioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@Service
public class DominioServiceImpl implements DominioService {

    private final DominioRepository dominioRepository;

    @Override
    public Dominio save(Dominio dominio) {
        return dominioRepository.save(dominio);
    }

    @Override
    public Collection<Dominio> list() {
        return (Collection<Dominio>) dominioRepository.findAll();
    }

    @Override
    public Collection<Dominio> listarPorChave(String chave) {
        return dominioRepository.findByChave(chave);
    }
}
