package org.yzh.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableCaching
@EnableScheduling
@EnableSwagger2
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        //Hikari Le pool de connexion fournitJDBC ConnectionVérification de la validité de la connexion, la valeur par défaut est500毫秒
        System.setProperty("com.zaxxer.hikari.aliveBypassWindowMs", "2000");
        SpringApplication.run(Application.class, args);
        log.info("***Spring Démarrer avec succès ***");
    }
}