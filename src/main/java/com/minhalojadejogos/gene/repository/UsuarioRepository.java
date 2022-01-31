package com.minhalojadejogos.gene.repository;

	import java.util.Optional;

	import com.minhalojadejogos.gene.model.Usuario;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
		
		public Optional<Usuario> findByUsuario(String usuario);

}
