package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.postagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/postagens")
@CrossOrigin("*")
public class postagemController {

	
		@Autowired
		private postagemRepository repositoty;
		
		@GetMapping
		public ResponseEntity<List<Postagem>> GatAll(){
			return ResponseEntity.ok(repositoty.findAll());
			
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Object> GetByItd (@PathVariable long id){
			Object resp = null;
			return repositoty.findById(id)
					.map(res -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
			
			}
			
		
		
		@GetMapping("/titulo/{titulo}")
		public ResponseEntity List <postagem> GetByTitulo(@PathVariable String postagem){
			return ResponseEntity.ok(repositoty.findAllByTituloContainingIgnoreCase(titulo));
		}
		
		@PostMapping
		public ResponseEntity<postagem> post (@RequestBody  postagem postagem){
			return ResponseEntity.status (HttpStatus.CREATED).body(repositoty.save(postagem));
		}
		@PostMapping
		public ResponseEntity<postagem> post (@RequestBody postagem postagem){
		 return  ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		}
		
		@PutMapping
		public ResponseEntity<postagem> put (@RequestBody postagem postagem){
		 return  ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		} 
			@DeleteMapping("/{id}")
			public void delete(@PathVariable long id) {
			repositoty.deleteById(id);
			}
	}
			



