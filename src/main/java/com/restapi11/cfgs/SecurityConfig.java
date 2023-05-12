package com.restapi11.cfgs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.restapi11.service.ServiceCustomDetail;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private ServiceCustomDetail serviceCustomDetail;
	
	
	protected void configure(HttpSecurity http) throws Exception {
		http
		     .csrf().disable()
		     .authorizeRequests()
		     .antMatchers("/public/**").hasRole("NORMAL")
		     .antMatchers("/admin/**").permitAll()
		     .anyRequest().authenticated()
		     .and().
		     formLogin();
		
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(serviceCustomDetail).passwordEncoder(this.passwordEncoder());
	}
	
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder(10);
    }
}
