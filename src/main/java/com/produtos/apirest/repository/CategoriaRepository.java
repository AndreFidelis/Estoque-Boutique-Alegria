package com.produtos.apirest.repository;

import com.produtos.apirest.model.Categoria;
import com.produtos.apirest.model.Estoque;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
