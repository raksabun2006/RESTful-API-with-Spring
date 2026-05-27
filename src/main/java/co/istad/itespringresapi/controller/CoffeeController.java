package co.istad.itespringresapi.controller;

import co.istad.itespringresapi.dto.CoffeeResponse;
import co.istad.itespringresapi.repository.CoffeeRepository;
import co.istad.itespringresapi.service.CoffeeService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/coffees")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeRepository coffeeRepository, CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
    @GetMapping
    public List<CoffeeResponse> getAll() {
       return coffeeService.getCoffee();
    }
}
