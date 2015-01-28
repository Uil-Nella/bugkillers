//package org.bugkillers.back.swagger;
//
//
//import org.bugkillers.back.user.controller.UserController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
//import com.mangofactory.swagger.models.dto.ApiInfo;
//import com.mangofactory.swagger.plugin.EnableSwagger;
//import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
//
//@Configuration
//@EnableWebMvc
//@EnableSwagger
//@ComponentScan(basePackageClasses={UserController.class},basePackages ={"org.bugkillers.back.user.controller","com.ak.swaggerspringmvc.shared.controller", "com.ak.spring3.music"})
//public class CustomJavaPluginConfig extends WebMvcConfigurerAdapter {
//
//   private SpringSwaggerConfig springSwaggerConfig;
//
//   @Autowired
//   public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
//      this.springSwaggerConfig = springSwaggerConfig;
//   }
//
//   @Bean //Don't forget the @Bean annotation
//   public SwaggerSpringMvcPlugin customImplementation(){
//      return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
//            .apiInfo(apiInfo())
//            .includePatterns("\\*");
//   }
//
//    private ApiInfo apiInfo() {
//      ApiInfo apiInfo = new ApiInfo(
//              "bugkillers back API",
//              "bugkillers 后台API文档",
//              "http://127.0.0.1:9081/user/regist.do",
//              "bugkillers@163.com",
//              "My License",
//              "My Apps API License URL"
//        );
//      return apiInfo;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//      configurer.enable();
//    }
//   
//    
//}