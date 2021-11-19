package microservices.book.gamification.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * Enables Cross-Origin Resource Sharing (CORS)
     * More info: http://docs.spring.io/spring/docs/current/spring-framework-reference/html/cors.html
     */
    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("PUT", "DELETE", "POST", "GET")
                .allowedHeaders("Content-Type", "X-Requested-With",
                        "accept", "Origin", "Access-Control-Request-Method",
                        "Access-Control-Request-Headers",
                        "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"
                );
    }

}