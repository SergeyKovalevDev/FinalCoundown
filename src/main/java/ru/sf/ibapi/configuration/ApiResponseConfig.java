package ru.sf.ibapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sf.ibapi.apiresponses.ApiResponseBuilderImpl;

@Configuration
public class ApiResponseConfig {

    @Bean
    public ApiResponseBuilderImpl getBuilder() {
        return new ApiResponseBuilderImpl();
    }
}
