package product.star.spring.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import product.star.spring.rest.dao.ContactDao;
import product.star.spring.rest.dao.impl.InMemoryContactDao;

@Configuration
public class ContactManagerConfig {

    @Bean
    public ContactDao contactDao() {
        return new InMemoryContactDao();
    }
}
