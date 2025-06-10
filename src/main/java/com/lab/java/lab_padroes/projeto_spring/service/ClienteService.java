package com.lab.java.lab_padroes.projeto_spring.service;

import com.lab.java.lab_padroes.projeto_spring.model.Cliente;

/**
 * Interface que define o padrão STRATEGY no domínio de cliente. Com
 * isso, pode se ter multiplas implementações dessa mesma interface.
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
