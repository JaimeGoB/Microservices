package com.appsdeveloperblog.photoapp.api.users.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable();
		//We are permiting all requests made on this path.
		http.authorizeRequests().antMatchers("/users/**").permitAll();
		//enable security for database
		http.headers().frameOptions().disable();
	}
}
