package jrdev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public String testeName(){
        return "meu nome é Junior!";
    }
}
