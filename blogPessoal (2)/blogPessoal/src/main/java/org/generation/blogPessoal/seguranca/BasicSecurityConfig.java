package org.generation.blogPessoal.seguranca;

import org.apache.catalina.startup.PasswdUserDatabase;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import sun.security.util.Password;


@EnableWebMvc
public class BasicSecurityConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private UserDetailsService 
	
	@Override
	protected void configure(Authentication auth) {
		auth.userDetailsService(userDateilsService);
	}
	
		@Bean
		public PasswordEncoder passwordEncode();
}
@Override
protected void configure(HttpSecurity http) throws Exception{
http.authorizeRequests()
.antMatchers("/usuario/logar").permitAll()
.antMatchers("/usuario/cadastrar").permitAll()
.anyRequest().authenticated()
.and().httpBasic()
.and().sessionManegement().sessionCreationPolicy(SessionCreationPolicy. STATELESS)
.and().cors()
.and().csrf().disable();
}
	
}



