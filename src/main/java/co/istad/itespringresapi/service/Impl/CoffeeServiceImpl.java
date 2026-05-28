package co.istad.itespringresapi.service.Impl;

import co.istad.itespringresapi.domain.Coffee;
import co.istad.itespringresapi.dto.CoffeeResponse;
import co.istad.itespringresapi.dto.CoffeeResponseWithCode;

import co.istad.itespringresapi.repository.CoffeeRepository;
import co.istad.itespringresapi.service.CoffeeService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeServiceImpl(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public List<CoffeeResponse> getCoffee() {
        List<Coffee> coffees= coffeeRepository.BeanCoffee();
        return coffees.stream()

                .map(coffee -> new CoffeeResponse(coffee.getName(), coffee.getDescription(),coffee.getPrice()))
                .toList();
    }

    @Override
    public List<CoffeeResponseWithCode> getByCode(Integer code) {
        List<Coffee> coffeeList = coffeeRepository.BeanCoffee();

        return coffeeList.stream()
                .filter(coffee -> coffee.getCode().equals(code))
                .map(coffee -> new CoffeeResponseWithCode(coffee.getCode(), coffee.getName(), coffee.getDescription(), coffee.getPrice()))
                .toList();
    }
}
