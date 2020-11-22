package br.com.poc.controller;

import br.com.poc.model.Dominio;
import br.com.poc.service.DominioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Api(value = "poc")
@AllArgsConstructor
@RestController
@RequestMapping({"/dominio"})
public class DominioController{

    private final DominioService dominioService;

    @ApiOperation(value = "save")
    @PostMapping
    @ResponseBody
    public Dominio  save(@RequestBody Dominio dominio) {
        return this.dominioService.save(dominio);
    }

    @ApiOperation(value = "list")
    @GetMapping
    @ResponseBody
    public Collection<Dominio>  list() {
        return  this.dominioService.list();
    }

    @ApiOperation(value = "findByChave")
    @GetMapping({"/{chave}"})
    @ResponseBody
    public Collection<Dominio>  findAllDominio(@PathVariable String chave) {
        return  this.dominioService.listarPorChave(chave);
    }

}
