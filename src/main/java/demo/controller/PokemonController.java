package demo.controller;

import demo.PokemonRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PokemonController {
    public static Response getPokemon(PokemonRequest pokemonRequest){
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept","*/*")
                .get("/v2/pokemon");
        return response;
    }
}
