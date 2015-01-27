//package org.bugkillers.back.swagger;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
//import com.mangofactory.swagger.plugin.EnableSwagger;
//import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
//import com.wordnik.swagger.model.ApiInfo;
//
//@Configuration
//@EnableSwagger
//public class SwaggerConfig {
//  private SpringSwaggerConfig springSwaggerConfig;
//  @Autowired
//  public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
//    this.springSwaggerConfig = springSwaggerConfig;
//  }
//  @Bean
//  // Don't forget the @Bean annotation
//  public SwaggerSpringMvcPlugin customImplementation() {
//    return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(
//        apiInfo()).includePatterns("/saurzcode/.*");
//  }
//  private ApiInfo apiInfo() {
//    ApiInfo apiInfo = new ApiInfo("SaurzCode API", "API for Saurzcode",
//        "Saurzcode API terms of service", "mail2saurzcode@gmail.com",
//        "Saurzcode API Licence Type", "Saurzcode API License URL");
//    return apiInfo;
//  }
//}