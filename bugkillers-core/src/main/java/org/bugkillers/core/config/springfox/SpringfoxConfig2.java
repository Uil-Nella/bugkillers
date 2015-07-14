package org.bugkillers.core.config.springfox;

import com.google.common.base.Predicate;
import org.bugkillers.core.controller.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by liuxinyu on 15/7/14.
 */
@EnableWebMvc
@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        TestController.class
})
public class SpringfoxConfig2 {

    /**
     * Project Name
     */
    public static String PROJECT_NAME = "bugkillers";


    @Bean
    public Docket swaggerSpringMvcPlugin() {
//        return new Docket(DocumentationType.SWAGGER_2);
        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("bugkillers")
                .select()
                        //Ignores controllers annotated with @CustomIgnore
//                .apis(not(withClassAnnotation(CustomIgnore.class)) //Selection by RequestHandler
                        .paths(paths()) // and by paths
                        .build()
                        .apiInfo(apiInfo())
//                        .securitySchemes(securitySchemes())
//                        .securityContext(securityContext())
                ;
    }

    //Here is an example where we select any api that matches one of these paths
    private Predicate<String> paths() {
        return or(
                regex(".*"));
//                regex("/some.*"),
//                regex("/contacts.*"),
//                regex("/pet.*"),
//                regex("/springsRestController.*"),
//                regex("/*.*"));
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "第一版",
                PROJECT_NAME + " API",
                PROJECT_NAME + " 后台API文档",
                "http://127.0.0.1:9081/api",
                "hd.rd.cos@meituan.com",
                "MTA License",
                "MTA API License URL"
        );
        return apiInfo;
    }
}
