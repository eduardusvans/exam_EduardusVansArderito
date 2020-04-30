package demo.steps;

import demo.pages.PokemonPage;
import demo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebPokemonStepsDefinition {
    private HomePage homePage = new HomePage();
    private PokemonPage pokemonPage = new PokemonPage();
    @Given("User open google homepage")
    public void userOpenGoogleHomepage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on google homepage")
    public void userInputSearchOnGoogleHomepage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String keyword) throws InterruptedException{
        Assert.assertEquals(keyword + " wikipedia indonesia", pokemonPage.getTitle());
    }
}
