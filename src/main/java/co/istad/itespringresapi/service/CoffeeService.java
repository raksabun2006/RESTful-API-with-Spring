package co.istad.itespringresapi.service;

import co.istad.itespringresapi.dto.CoffeeResponse;
import co.istad.itespringresapi.dto.CoffeeResponseWithCode;


import java.util.List;

public interface CoffeeService {
    List<CoffeeResponse> getCoffee();
    List<CoffeeResponseWithCode> getByCode(Integer code);
}
