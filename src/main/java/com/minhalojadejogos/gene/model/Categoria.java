package com.minhalojadejogos.gene.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.minhalojadejogos.gene.util.Plataforma;

@Entity
@Table (name = "categoria")
public class Categoria {

	/**
	 * @author Luiz Melin
	 * @see Plataforma para ver mais sobre os enum
	 * @since 09:50
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * String para tipo de jogo. ex: Ação, aventura, etc...
	 */
	@NotBlank
	@Size(max = 50)
	private String tipo;
  	
	/**
	 * Enum de "PC, PS5 E XBOXSERIESX"
	 */
	@Enumerated(EnumType.STRING)
	private Plataforma plataforma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
}
