package com.springboot.hello.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring Doc Example API Document",
                description = "API Document",
                version = "v0.1",
                termsOfService = "http://www.tg360tech.com/terms",
                license = @License(
                        name = "Apache License Version 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                ),
                contact = @Contact(
                        name = "dev",
                        email = "dev@tg360tech.com"
                )
        ),
        tags = {
                @Tag(name = "01.Common", description = "공통 기능"),
                @Tag(name = "02.User", description = "사용자 기능"),
                @Tag(name = "03.Undefined", description = "미정의 기능"),
        }
)

@Configuration
public class SwaggerConfiguration {

}
