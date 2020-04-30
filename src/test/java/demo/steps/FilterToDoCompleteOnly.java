package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterToDoCompleteOnly {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User tap button filter")
    public void userTapButtonFilter() {
        boolean result = toDoHomePage.btnfilter();
        Assert.assertTrue(result);
    }

    @And("User tap complete selector")
    public void userTapCompleteSelector() {
        boolean result = toDoHomePage.completed();
        Assert.assertTrue(result);
    }

    @Then("User go to to do complete only page")
    public void userGoToToDoCompleteOnlyPage() {
        boolean result = toDoHomePage.completedToDo();
        Assert.assertTrue(result);
    }
}
