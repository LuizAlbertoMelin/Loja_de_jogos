package com.minhalojadejogos.gene.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhalojadejogos.gene.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
