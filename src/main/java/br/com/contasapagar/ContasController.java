package br.com.contasapagar;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa notação diz que essa classe é uma Controller, ou seja está dizendo que essa é uma aplicação REST
@RequestMapping("/contas")
public class ContasController {

    @Autowired
    ContaRepository repository;

    @GetMapping
    public List<Conta> listarContas(){

        return repository.findAll();
    }

    @PostMapping
    public Conta cadastrarConta(@RequestBody Conta conta){

        return repository.save(conta);
    }

    @PutMapping
    public Conta atualizarConta(@RequestBody Conta conta){

        return repository.save(conta);
    }

    @DeleteMapping("/{id}")
    public void excluirConta(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }


}
