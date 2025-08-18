package gt.edu.umg.business.partners.service.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * CustomAccessDeniedHandler
 *
 * This class implements Spring Security's AccessDeniedHandler interface to provide a custom response
 * for access-denied scenarios (HTTP 403 Forbidden). It is triggered when an authenticated user tries
 * to access a resource they are not authorized to view.
 *
 * Key Features:
 * - Intercepts 403 Forbidden errors.
 * - Sends a structured JSON response instead of the default HTML error page.
 * - Helps API clients understand that the request was authenticated but the user lacks necessary permissions.
 *
 * Example JSON Response:
 * {
 *   "error": "Forbidden",
 *   "message": "You do not have permission to access this resource."
 * }
 *
 * Usage:
 * - This handler is registered as a Spring @Component.
 * - It is injected into the SecurityConfig class to handle 403 responses via the `accessDeniedHandler` method.
 */
@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    /**
     * Called when an authenticated user attempts to access a protected resource they are not authorized to access.
     *
     * @param request                the incoming HTTP request
     * @param response               the outgoing HTTP response
     * @param accessDeniedException the exception thrown when access is denied
     * @throws IOException           if an input or output error occurs while writing the response
     */
    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.getWriter().write("{\"error\": \"Forbidden\", \"message\": \"You do not have permission to access this resource.\"}");
    }
}