package de.markant.mnet.example.examplenativeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class ExampleNativeServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleNativeServiceApplication.class, args);
        Thread.currentThread().join(); // To be able to measure memory consumption
    }
}
