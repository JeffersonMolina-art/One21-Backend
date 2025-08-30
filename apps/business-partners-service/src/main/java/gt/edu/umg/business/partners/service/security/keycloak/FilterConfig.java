//package gt.edu.umg.business.partners.service.security.keycloak;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean<RedisAuthFilter> redisAuthFilter(RedisAuthFilter filter) {
//        FilterRegistrationBean<RedisAuthFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(filter);
//        registrationBean.addUrlPatterns("/*"); // Protege todos los endpoints
//        return registrationBean;
//    }
//
//    @Bean
//    public RedisAuthFilter redisAuthFilterBean() {
//        return new RedisAuthFilter();
//    }
//}
