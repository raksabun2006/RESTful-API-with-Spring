package co.istad.itespringresapi.dto;

public record CoffeeResponse(
        String name,
        String description,
        Double price
) {
}
