package tp.kits3.open4um.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import tp.kits3.open4um.service.MyUserDetailsService;


/**
 * 
 * @author Nguyen Vinh Thien
 *
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		MyUserDetailsService myUserDetailsService = new MyUserDetailsService();
		auth.userDetailsService(myUserDetailsService).passwordEncoder(encoder());
	}
	
	@Bean(BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        // Get AuthenticationManager bean
        return super.authenticationManagerBean();
    }
//	@Bean
//	public JwtAuthenticationFilter jwtAuthenticationFilter() {
//		return new JwtAuthenticationFilter();
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//JwtAuthenticationFilter jwt = new JwtAuthenticationFilter();

		http.authorizeRequests().antMatchers("/admin/**").authenticated();

		// Cấu hình remember me, thời gian là 1296000 giây
		//http.rememberMe().key("uniqueAndSecret").tokenValiditySeconds(1296000);
		http.authorizeRequests()
				.antMatchers("/login").permitAll()
				.antMatchers("/admin/**").hasRole("admin")
				.and()
				.exceptionHandling()
                .accessDeniedPage("/403")
                .and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/api/author")
				.failureUrl("/login?error=true").permitAll().and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.permitAll();
		http.csrf().disable();

		// Thêm một lớp Filter kiểm tra jwt
		//http.addFilterBefore(jwt, UsernamePasswordAuthenticationFilter.class);
	}
}
