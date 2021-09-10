package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.code.binary.Base64;
import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService<BCryptPasswordEncoder> {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder enconder = new BCryptPasswordEncoder();
	
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEcoder);
		
		return  repository.save(usuario);
		
	public Optional<UserLogin> Logar(Optional<UserLogin> user)
		BCryptPasswordEncoder enconder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		if(usuario.isPresent()) {
		if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
			String auth = user.get().getUsuario() + ":" + user.get().getSenha();
			byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader = "Basic " + new String(encodedAuth);
			
			user.get().setToken(autothHeader);
			user.get().setNome(usuario.get().getNome());
			
			return user;
		
		}
		}
	
			return null;
	}
}