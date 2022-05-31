package org.rs.parent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryTemp {
    public static ApplicationContext context;


    @Bean("ITempConverter")
    public ITempCoverterIml iTempConverter() {
        return new ITempCoverterIml();
    }
    public static void init(){
        context= new AnnotationConfigApplicationContext(FactoryTemp.class);
    }
    public static ITempConverter getInstance(){
        return context.getBean("ITempConverter",ITempCoverterIml.class);
    }
}
