package com.kkday.svc.example;

import com.kkday.sdk.annotation.EnableKKdaySdk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableKKdaySdk
public class Application {

    public static void XYZ(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
