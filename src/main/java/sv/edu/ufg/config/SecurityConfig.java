package sv.edu.ufg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		
	  auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
		.usersByUsernameQuery(
			"select usuario username, clave password, activo enabled from vw_user where usuario = ?")
		.authoritiesByUsernameQuery(
			"select usuario username,  descripcion rol from vw_rol_user where usuario = ?");
	}	
	
	
	 @Override
	  public void configure(WebSecurity web) throws Exception {
	    web
	      .ignoring()
	         .antMatchers("/resources/**");
	  }
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	 
		
	  http.authorizeRequests()
		.antMatchers("/app/**").access("hasRole('ADMIN')")
		.and()
			.formLogin().loginPage("/login").failureUrl("/login?error")
				.usernameParameter("username").passwordParameter("password")
		.and()
			.logout().logoutSuccessUrl("/login?logout")
		.and()
			.exceptionHandling().accessDeniedPage("/403")
		.and()
			.csrf().disable();
	}
	
	@Bean 
	public PasswordEncoder passwordEncoder(){
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		return encoder;
	}
	
}
