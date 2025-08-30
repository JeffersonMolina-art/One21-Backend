//package gt.edu.umg.business.partners.service.security.keycloak;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.web.filter.OncePerRequestFilter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class RedisAuthFilter extends OncePerRequestFilter {
//
////    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        String authHeader = request.getHeader("Authorization");
//        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            response.getWriter().write("Missing or invalid Authorization header");
//            return;
//        }
//        String token = authHeader.substring(7);
//        String userData = redisTemplate.opsForValue().get(token);
//        if (userData == null) {
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            response.getWriter().write("Invalid or expired user key");
//            return;
//        }
//        // Puedes guardar userData en un atributo de request si lo necesitas
//        request.setAttribute("userData", userData);
//        filterChain.doFilter(request, response);
//    }
//}
