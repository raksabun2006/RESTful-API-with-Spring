package co.istad.itespringresapi.service;

import co.istad.itespringresapi.domain.Coffee;
import co.istad.itespringresapi.dto.CoffeeResponse;

import java.util.List;

public interface CoffeeService {
    List<CoffeeResponse> getCoffee();
}
