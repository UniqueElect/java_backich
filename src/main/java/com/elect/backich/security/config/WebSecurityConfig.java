//package com.elect.backich.security.config;
//
//
//import com.elect.backich.service.impl.UserServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private UserServiceImpl userService;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and()
//                .csrf().disable()
////                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
////                .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager()))
////                .addFilterAfter(new JwtTokenVerifier(),JwtUsernameAndPasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                .antMatchers("/api/v*/registration/**").permitAll()
//                .anyRequest()
//                .authenticated();
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(daoAuthenticationProvider());
//    }
//    @Bean
//    DaoAuthenticationProvider daoAuthenticationProvider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(bCryptPasswordEncoder);
//        provider.setUserDetailsService(userService);
//        return provider;
//    }
//}
