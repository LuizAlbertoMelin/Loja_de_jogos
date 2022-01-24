package com.minhalojadejogos.gene.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadejogos.gene.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
}
