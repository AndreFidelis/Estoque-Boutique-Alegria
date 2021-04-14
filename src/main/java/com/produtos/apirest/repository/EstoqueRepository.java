package com.produtos.apirest.repository;

import com.produtos.apirest.model.Estoque;
import org.springframework.data.repository.CrudRepository;

public interface EstoqueRepository extends CrudRepository<Estoque, Integer> {
}
