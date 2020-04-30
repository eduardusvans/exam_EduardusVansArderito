package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckStatisticToDo {
    ToDoHomePage toDoHomePage = new ToDoHomePage();
    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
    }
    @When("User tap button navigate up")
    public void userTapButtonNavigateUp() {
        boolean result = toDoHomePage.userNavigate();
        Assert.assertTrue(result);
    }

    @And("User tap statistics")
    public void userTapStatistics() {
        boolean result = toDoHomePage.statistic();
        Assert.assertTrue(result);
    }

    @Then("User statistic is being shown")
    public void userStatisticIsBeingShown() {
        boolean result = toDoHomePage.statistic();
        Assert.assertTrue(result);
    }
}
