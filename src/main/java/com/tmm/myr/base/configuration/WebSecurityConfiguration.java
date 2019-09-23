//package com.tmm.myr.base.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
//
//import com.tmm.athena.base.service.UserDetailService;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private UserDetailService userDetailService;
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        return bCryptPasswordEncoder;
//    }
//	
//	@Bean
//    public SpringSecurityDialect springSecurityDialect(){
//        return new SpringSecurityDialect();
//    }
//	
//	@Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailService)
//        .
//        .passwordEncoder(passwordEncoder());
// 
//    }
//	
//	private AuthenticationSuccessHandler authenticationSuccessHandler;
//	
//	@Autowired
//    public WebSecurityConfiguration(AuthenticationSuccessHandler authenticationSuccessHandler) {
//        this.authenticationSuccessHandler = authenticationSuccessHandler;
//    }
//
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();		
//		http.authorizeRequests().antMatchers("/login", "/logout").permitAll();
//        http.authorizeRequests()
//    	.antMatchers(
//            "/js/**",
//            "/css/**",
//            "/images/**").permitAll()
//    	.antMatchers("/administracion/**").hasAnyRole("ADMIN","USER")
//    	.anyRequest().authenticated();
//
//    // Configuracion del login
//        http.authorizeRequests()
//    		.and().formLogin()//
//            // Submit URL of login page.
//            	.loginProcessingUrl("/j_spring_security_check") // Submit URL
//            	.loginPage("/login")//
//            	.defaultSuccessUrl("/index")//
//            	//.successHandler(authenticationSuccessHandler)
//            	.failureUrl("/login?error=true")//
//            	.usernameParameter("username")//
//            	.passwordParameter("password")
//            	.permitAll()
//            // Config for Logout Page
//            .and().logout()
//            	.invalidateHttpSession(true)
//            	.clearAuthentication(true)
//            	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//            	.logoutSuccessUrl("/login?logout")
//            	.permitAll();
// 
//    }
//}
