package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepositiry extends JpaRepository<Tema, Long> {

	public List<Tema> finAllByDescricaoContainingIgnoreCase(String descricao);
	
}
