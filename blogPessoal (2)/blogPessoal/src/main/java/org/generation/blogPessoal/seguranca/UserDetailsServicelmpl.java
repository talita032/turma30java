package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicelmpl implements userDetailsService {

	@Autowir
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(Sting user userName)
	Optional<Usuario> user = userRepository.findByUsuario(userName);
	user.orElsethrow() -> new UsernameNotFoundException(userName + "not foud,");

	return user.map(UserDetailsImpl ::new).get();
	}
}