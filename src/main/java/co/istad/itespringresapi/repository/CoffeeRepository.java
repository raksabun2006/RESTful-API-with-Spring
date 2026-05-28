package co.istad.itespringresapi.repository;

import co.istad.itespringresapi.domain.Coffee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

    @Bean
    public List<Coffee> BeanCoffee(){
        Coffee coffee = new Coffee(1,"GreenTea","Score 40%",2.59);
        Coffee coffee1 = new Coffee(2,"Iced Latte","Score 5%",3.89);
        Coffee coffee2 = new Coffee(3,"America Coffee","Score 10%",2.65);
        return Arrays.asList(coffee, coffee1, coffee2);
    }
}
