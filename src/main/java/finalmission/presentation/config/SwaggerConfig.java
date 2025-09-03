package finalmission.presentation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(apiInfo())
            .addServersItem(new Server().url("/"));
    }

    private Info apiInfo() {
        return new Info()
            .title("lv3 final mission API")
            .description("lv3 final mission API 명세서");
    }
}
