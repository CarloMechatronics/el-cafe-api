package pe.elcafe.api;

import org.springframework.boot.SpringApplication;

public class TestElCafeApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(ElCafeApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
