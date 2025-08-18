package gt.edu.umg.business.partners.service.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * SecurityConfig
 *
 * This class configures the security settings for the application using JWT-based authentication.
 *
 * Key Features:
 * - Enables Spring Security with @EnableWebSecurity annotation.
 * - Defines a SecurityFilterChain bean that:
 *   - Requires authentication for all HTTP requests.
 *   - Uses JWT tokens for OAuth2 resource server authentication.
 *   - Handles unauthorized (401) and forbidden (403) errors with custom handlers.
 *
 * How it works:
 * - The application acts as an OAuth2 resource server and expects a valid JWT in the Authorization header.
 * - If the request lacks a valid token, the CustomAuthEntryPoint returns a 401 Unauthorized response.
 * - If the token is valid but the user lacks the required permissions, the CustomAccessDeniedHandler returns a 403 Forbidden response.
 * - Public keys used to verify the JWT signature are obtained from the issuer URI defined in application.yml:
 *
 *     spring:
 *       security:
 *         oauth2:
 *           resourceserver:
 *             jwt:
 *               issuer-uri: https://your-keycloak-domain/realms/your-realm
 *
 * Notes:
 * - This configuration is compatible with Keycloak and other OpenID Connect-compliant identity providers.
 * - It provides a clean separation between authentication and authorization failure handling.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final AuthenticationEntryPoint authEntryPoint;
    private final AccessDeniedHandler accessDeniedHandler;

    /**
     * Constructor injection of custom handlers for authentication and authorization errors.
     *
     * @param authEntryPoint         Custom entry point for handling 401 Unauthorized
     * @param accessDeniedHandler    Custom handler for handling 403 Forbidden
     */
    public SecurityConfig(CustomAuthEntryPoint authEntryPoint, CustomAccessDeniedHandler accessDeniedHandler) {
        this.authEntryPoint = authEntryPoint;
        this.accessDeniedHandler = accessDeniedHandler;
    }

    /**
     * Configures the security filter chain.
     *
     * @param http  the HttpSecurity object provided by Spring Security
     * @return the configured SecurityFilterChain
     * @throws Exception in case of configuration error
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .anyRequest().authenticated()
            )
            .exceptionHandling(exception -> exception
                .authenticationEntryPoint(authEntryPoint)
                .accessDeniedHandler(accessDeniedHandler)
            )
            .oauth2ResourceServer(oauth2 -> oauth2
                .jwt(jwt -> {}) // Default JWT validation behavior
            );

        return http.build();
    }
}