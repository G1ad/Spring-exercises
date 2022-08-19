package co.develhope.springdevelhope.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .tags
                        (new Tag("name-controller","The name controller"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Swagger",
                "Spring Swagger description",
                "1.0.0",
                "API TOS",
                new Contact("Raman Dmukhouski", "https://platform.develhope.co", "romadmukhouski@gmail.com"),
                "MIT",
                "https://it.wikipedia.org/wiki/Licenza_MIT",
                Collections.emptyList());
    }
}
