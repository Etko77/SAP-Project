package com.example.demo.Employee;

import com.example.demo.PasswordHash.PasswordEncoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {

        return args -> {
            Employee martin = new Employee(
                    "Martin",
                    "Yovchev",
                    "azSumGei",
                    PasswordEncoder.encodePassword("Gei"),
                    "mayovchev@per-store.com",
                    55000.50,
                    "0897654321",
                    "developer"
            );

            repository.save(martin);
        };
    }
}
