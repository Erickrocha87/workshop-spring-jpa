package com.rochaerick.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rochaerick.course.entities.Category;
import com.rochaerick.course.entities.Order;
import com.rochaerick.course.entities.User;
import com.rochaerick.course.entities.enums.OrderStatus;
import com.rochaerick.course.repositories.CategoryRepository;
import com.rochaerick.course.repositories.OrderRepository;
import com.rochaerick.course.repositories.UserRepository;

@Configuration
@Profile("test") //configuração para rodar no perfil de teste
public class TestConfig implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired //injeção de dependência
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;
     
//metodo run é um metodo da interface CommandLineRunner, é para rodar quando o programa iniciar
    @Override
    public void run(String... args) throws Exception {
        
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

        userRepository.saveAll(Arrays.asList(u1,u2));
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.CANCELED);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.DELIVERED);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        
    }
}
//classe feita para testar o seeding do DB