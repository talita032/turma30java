package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Map;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")
public class temaController {
@Autowired 
private TemaRepositiry repository;

@GetMapping
public ResponseEntity<Tema> getall(){
	return ResponseEntity.ok(repository.findAll())
			
	@GetMapping("/{id}") ResponseEntity<Tema> getById ( @PathVariable long id){
		return repository.findById(id)Map(resp - > ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
					}
			@GetMapping("/nome/{nome}")
			public ResponseEntity<List>Tema>> getByName(@PathVariable String nome)
			return ResponseEntity.ok(repository.finAllByDescricaoContainingIgnoreCase(nome)); {
				
			
			@PostMapping
			public ResponseEntity<Tema> post (@RequestBody Tema tema);
			return ResponseEntity.status(HTTpStatus.CREATED)
					.body(repository.save(tema));
	}
		
			@PutMapping
			public ResponseEntity<Tema> put (@RequestBody Tema tema);
			return ResponseEntity.ok(repository.save(tema));				
			
}
@DeleteMapping("/{id}")
public void delete(@PathVariable long id) {
	repository.deleteById(id);
}
}

