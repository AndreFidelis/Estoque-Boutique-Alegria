package com.produtos.apirest.repository;

import com.produtos.apirest.model.Estoque;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Estoque, Integer> {
}
