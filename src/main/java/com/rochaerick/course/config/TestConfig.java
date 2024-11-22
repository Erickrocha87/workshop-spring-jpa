package com.rochaerick.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rochaerick.course.entities.User;
import com.rochaerick.course.repositories.UserRepository;

@Configuration
@Profile("test") //configuração para rodar no perfil de teste
public class TestConfig implements CommandLineRunner {

    @Autowired //injeção de dependência
    private UserRepository userRepository;
//metodo run é um metodo da interface CommandLineRunner, é para rodar quando o programa iniciar
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
//classe feita para testar o seeding do DB