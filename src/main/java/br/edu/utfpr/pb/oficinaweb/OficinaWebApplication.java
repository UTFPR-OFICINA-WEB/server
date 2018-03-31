package br.edu.utfpr.pb.oficinaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OficinaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OficinaWebApplication.class, args);
    }
}
