package gt.edu.umg.business.partners.service.security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * CustomAuthEntryPoint
 *
 * This class provides a custom implementation of Spring Security's AuthenticationEntryPoint interface.
 * It is responsible for handling authentication errors (401 Unauthorized) when a client attempts to access
 * a secured resource without a valid token or with an expired/invalid token.
 *
 * Key Features:
 * - Intercepts authentication failures and returns a structured JSON error response.
 * - Sets the HTTP response status to 401 Unauthorized.
 * - Returns a clear error message that can be interpreted by frontend applications or API consumers.
 *
 * Example JSON Response:
 * {
 *   "error": "Unauthorized",
 *   "message": "Your session is invalid or expired. Please log in again."
 * }
 *
 * Usage:
 * - This class is registered as a Spring component using @Component annotation.
 * - It is injected into the SecurityConfig class to handle 401 errors via the `authenticationEntryPoint` method.
 */
@Component
public class CustomAuthEntryPoint implements AuthenticationEntryPoint {

    /**
     * Called when an unauthenticated user tries to access a protected resource.
     *
     * @param request         the incoming HTTP request
     * @param response        the outgoing HTTP response
     * @param authException   the exception thrown when authentication fails
     * @throws IOException    if an input or output error occurs while writing the response
     */
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write("{\"error\": \"Unauthorized\", \"message\": \"Your session is invalid or expired. Please log in again.\"}");
    }
}