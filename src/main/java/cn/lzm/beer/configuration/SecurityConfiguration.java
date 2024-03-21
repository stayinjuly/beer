package cn.lzm.beer.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity(debug = true)
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
                .formLogin(formLogin -> formLogin.loginPage("/login").permitAll());
        return http.build();
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests((authorizeRequests) ->
//                        authorizeRequests.requestMatchers("/**").hasRole("USER"))
//                .requestCache((requestCache) ->
//                        requestCache.disable()
//                );
//        return http.build();
//    }
}
