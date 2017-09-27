package com.myproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by dumin on HZ koga.
 */

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@PropertySource("classpath:rounder.properties")
@RestController
public class Rounder {

    private static final Logger logger = LoggerFactory.getLogger(Rounder.class);

    @RequestMapping(value = "/", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
//    @ResponseBody
    public String multipleAndGet() {
        return "Hallow";
    }

    @RequestMapping(value = "/round/{applicationName}", method = {RequestMethod.PUT})
    public String serviceInstancesByApplicationName(
            @RequestParam String applicationName) {
        return applicationName;
    }

    @RequestMapping(value = "/project2", method = {RequestMethod.POST})
    public Body voteProject(@NotNull @RequestBody Body body) {
        return body;
    }


    public static void main(String... args) throws Exception {
        SpringApplication.run(Rounder.class, args);
    }

}
