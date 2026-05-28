package co.istad.itespringresapi.controller;

import co.istad.itespringresapi.dto.CoffeeResponse;
import co.istad.itespringresapi.dto.CoffeeResponseWithCode;
import co.istad.itespringresapi.repository.CoffeeRepository;
import co.istad.itespringresapi.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
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

    @GetMapping("/{code}")
    public List<CoffeeResponseWithCode> getCoffeeByCode(@PathVariable Integer code){
        log.info("get coffee by code {}",code);
       return coffeeService.getByCode(code);
    }

    @GetMapping("/search")
    public List<CoffeeResponse> searchCoffeeByName(
            @RequestParam String name
    ){
        log.info("Coffee name {}",name);;
        return null;

    }
}
