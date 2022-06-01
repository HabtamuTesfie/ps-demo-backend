package com.pesdemo.psdemo.config;


import com.pesdemo.psdemo.models.ConfigurationTest;
import com.pesdemo.psdemo.models.ConfigurationTestImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean(name ="demoService")
    public ConfigurationTest ConfigClass()
    {
        return new ConfigurationTestImp();
    }
}
