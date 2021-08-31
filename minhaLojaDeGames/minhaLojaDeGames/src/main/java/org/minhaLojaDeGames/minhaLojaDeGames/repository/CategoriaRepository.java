package org.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;

import org.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

	public List <Categoria>  findAllByDescricaoContainingIgnoreCase(String descricao);
}
