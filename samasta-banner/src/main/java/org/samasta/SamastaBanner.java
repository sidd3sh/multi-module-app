package org.samasta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SamastaBanner implements CommandLineRunner {

    public static void main(String[] args) {

        new SpringApplicationBuilder(SamastaBanner.class)
//                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Spring Boot console application");
    }
}
