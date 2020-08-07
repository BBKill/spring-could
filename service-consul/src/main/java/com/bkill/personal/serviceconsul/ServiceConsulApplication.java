package com.bkill.personal.serviceconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceConsulApplication {

    @RequestMapping("/health")
    public String home(){
        return "success";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsulApplication.class, args);
    }

}
