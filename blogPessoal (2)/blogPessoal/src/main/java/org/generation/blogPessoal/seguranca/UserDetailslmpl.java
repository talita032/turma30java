package org.generation.blogPessoal.seguranca;

import java.util.Collection;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.core.userdetails.UserDetails;

public class UserDetailslmpl implements UserDetails 
	
	private static final long serialVersionUID = 1L;

		private String UserName;
		private String password;
		
		public UserDetailslmpl(Usuario user) {
			this.UserName = user.getUsuario(); 
			this.password = user.getSenha();
}
		
		 public UserDetailsIml() {}
		 
	@Override
	public Collection<? extends GrantedAuthority> geAuthorities(){
		return null;
	}
	@Override
	public String getPassword() {
		return password;
	}
		@Override
		public String getUsername() { 
		return UserName;
		}
		
		@Override
		public boolean isAccountNonExpired() {
			return true;
		}
		@Override
		public boolean isAccountNonLocked() {
			return false;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			return false;
		}
		@Override
		public boolean isEnabled() {
			return false;
		}
		
}
}