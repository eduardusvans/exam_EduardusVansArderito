package demo;

import demo.controller.PokemonController;
import demo.PokemonRequest;
import demo.PokemonResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class Pokemon {
    PokemonController pokemonController = new PokemonController();
    @Test
    public void getPikachu(){
        PokemonRequest pokemonRequest = new PokemonRequest();
        pokemonRequest.setId("25");
        pokemonRequest.setName("pikachu");
        Response response = PokemonController.getPokemon(pokemonRequest);
        response.getBody().prettyPrint();
        Assert.assertEquals("success", response.path("status"));
        Assert.assertEquals("25", response.path("data[0].id"));
        Assert.assertEquals("pikachu", response.path("data[1].name"));
    }
    @Test
    public void getCharizard(){
        PokemonRequest pokemonRequest = new PokemonRequest();
        pokemonRequest.setId("6");
        pokemonRequest.setName("charizard");
        Response response = PokemonController.getPokemon(pokemonRequest);
        response.getBody().prettyPrint();
        Assert.assertEquals("success", response.path("status"));
        Assert.assertEquals("6", response.path("data[0].id"));
        Assert.assertEquals("charizard", response.path("data[1].name"));
    }
    @Test
    public void getBulbasaur(){
        PokemonRequest pokemonRequest = new PokemonRequest();
        pokemonRequest.setId("1");
        pokemonRequest.setName("bulbasaur");
        Response response = PokemonController.getPokemon(pokemonRequest);
        response.getBody().prettyPrint();
        Assert.assertEquals("success", response.path("status"));
        Assert.assertEquals("1", response.path("data[0].id"));
        Assert.assertEquals("bulbasaur", response.path("data[1].name"));
    }
    @Test
    public void getMewtwo(){
        PokemonRequest pokemonRequest = new PokemonRequest();
        pokemonRequest.setId("150");
        pokemonRequest.setName("mewtwo");
        Response response = PokemonController.getPokemon(pokemonRequest);
        response.getBody().prettyPrint();
        Assert.assertEquals("success", response.path("status"));
        Assert.assertEquals("150", response.path("data[0].id"));
        Assert.assertEquals("mewtwo", response.path("data[1].name"));
    }
}
