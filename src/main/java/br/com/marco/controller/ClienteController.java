package br.com.marco.controller;

import br.com.marco.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/clientes"})
public class ClienteController {

    private ClienteRepository repository;

    ClienteController(ClienteRepository clienteRepository) {
        this.repository = clienteRepository;
    }

    @GetMapping
    public List findAll() {
        return repository.findAll();
    }

}
