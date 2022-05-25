package com.example.demo.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student kaiYi = new Student(
                        "KaiYi",
                        "kaiyi@gmail.com",
                        LocalDate.of(1999, Month.JANUARY, 5)
                );
            Student syed = new Student(
                    "Syed",
                    "Syed@gmail.com",
                    LocalDate.of(2000, Month.MAY, 20)
            );

            repository.saveAll(
                    List.of(kaiYi, syed)
            );
        };
    }
}
