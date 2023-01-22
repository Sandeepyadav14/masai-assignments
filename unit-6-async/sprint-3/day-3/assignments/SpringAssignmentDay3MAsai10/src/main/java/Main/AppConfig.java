package Main;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
@ComponentScan(basePackages = "Main")
public class AppConfig {
    @Bean
    public List<String>  getCities(){

        List<String> cities = new ArrayList<String>();

        cities.add("delhi");
        cities.add("chennai");
        cities.add("mumbai");
        cities.add("kolkata");

        return cities;

    }
}
