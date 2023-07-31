package com.efb;

import com.efb.thirdparty.ThirdPartyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.efb")
@PropertySource("classpath:application.properties")
//It will scan all classes under the name of "com.efb" package
//and when it finds related spring annotation(component), will create bean and add to container.
public class AppConfiguration {


    @Bean
    public ThirdPartyComponent thirdPartyComponent(){
        return new ThirdPartyComponent();
    }

}
