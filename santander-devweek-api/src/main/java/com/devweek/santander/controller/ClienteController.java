package com.devweek.santander.controller;

import com.devweek.santander.model.Cliente;
import com.devweek.santander.repository.ClienteRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@Tag(name = "Clientes", description = "API para gerenciamento de clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    @Operation(summary = "Lista todos os clientes")
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Adiciona um novo cliente")
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}