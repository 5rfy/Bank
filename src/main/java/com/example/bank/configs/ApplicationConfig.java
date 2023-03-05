package com.example.bank.configs;

import com.example.bank.interceptors.AppInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class ApplicationConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/")
                .addResourceLocations("/resources/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AppInterceptor()).addPathPatterns("/app/**");
    }
    

    //    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/")
//                .addResourceLocations("/resources/**");
//    }
    //    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/")
//                .addResourceLocations("/resources/**");
//    }
//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//        InternalResourceViewResolver jspViewResolver = new InternalResourceViewResolver();
//        jspViewResolver.setPrefix("/WEB-INF/views/");
//        jspViewResolver.setSuffix(".jsp");
//        jspViewResolver.setViewClass(JstlView.class);
//
//        return jspViewResolver;
//    }
//
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new AppInterceptor()).addPathPatterns("/app/*");
//    }
}
