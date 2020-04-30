package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterToDoActiveOnly {
    ToDoHomePage toDoHomePage = new ToDoHomePage();


    @And("User tap active selector")
    public void userTapActiveSelector() {
        boolean result = toDoHomePage.active();
        Assert.assertTrue(result);
    }

    @Then("User go to to do active only page")
    public void userGoToToDoActiveOnlyPage() {
        boolean result = toDoHomePage.activeToDo();
        Assert.assertTrue(result);
    }
}
