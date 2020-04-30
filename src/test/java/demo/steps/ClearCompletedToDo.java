package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClearCompletedToDo {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User tap button options")
    public void userTapButtonOptions() {
        boolean result = toDoHomePage.btnoptions();
        Assert.assertTrue(result);
    }

    @And("User tap clear completed")
    public void userTapClearCompleted() {
        boolean result = toDoHomePage.clearcompleted();
        Assert.assertTrue(result);
    }

    @Then("User completed task is cleared")
    public void userCompletedTaskIsCleared() {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
    }
}
