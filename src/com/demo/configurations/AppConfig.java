package com.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"com.demo"})
public class AppConfig {
	
//	an empty config -- no view resolver required
	
//	properties file configuration
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholder() {
		PropertySourcesPlaceholderConfigurer prop = new PropertySourcesPlaceholderConfigurer();
		ClassPathResource[] cpRes = new ClassPathResource[] 
				{new ClassPathResource("application.properties")};
		prop.setLocations(cpRes);
		prop.setIgnoreUnresolvablePlaceholders(true);
		return prop;
	}

}
