package com.elect.backich;

import com.elect.backich.jwt.CustomAuthenticationFilter;
import com.elect.backich.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@AllArgsConstructor
@Configuration
@EnableWebSecurity
public class springSecurityCORsCfg extends WebSecurityConfigurerAdapter {

        private UserServiceImpl userService;
        private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and()
//                .csrf().disable()
//                .sessionManagement().sessionCreationPolicy(STATELESS).and()
//                .addFilter(new CustomAuthenticationFilter(authenticationManagerBean()))
////                .addFilterAfter(new JwtTokenVerifier(),JwtUsernameAndPasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                .antMatchers("/api/**").permitAll()
//                .anyRequest()
//                .authenticated();
////                .and().formLogin();

        http.csrf().disable();
                http.sessionManagement().sessionCreationPolicy(STATELESS);
//                http.authorizeRequests().antMatchers()
                http.authorizeRequests().anyRequest().permitAll();
                http.addFilter(new CustomAuthenticationFilter(authenticationManagerBean()));
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }
    @Bean
    DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(bCryptPasswordEncoder);
        provider.setUserDetailsService(userService);
        return provider;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
       return super.authenticationManagerBean();
    }
}
