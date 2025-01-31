package com.xuanzhe.swaggertest.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket docket(){
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
  }

  private ApiInfo apiInfo(){
    Contact contact = new Contact("xiaxuanzhe","https://github.com","xiaxingba@gmail.com");
    return new ApiInfo("Api Documentation",
        "Api Documentation",
        "1.0",
        "urn:tos",
        contact,
        "Apache 2.0",
        "http://www.apache.org/licenses/LICENSE-2.0",
        new ArrayList());
  }
}
