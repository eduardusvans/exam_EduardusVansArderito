package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UncheckToDo {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User uncheck the task checkbox")
    public void userUncheckTheTaskCheckbox() {
        boolean result = toDoHomePage.check();
        Assert.assertTrue(result);
    }

    @Then("User task is unchecked")
    public void userTaskIsUnchecked() {
        boolean result = toDoHomePage.check();
        Assert.assertFalse(result);
    }
}
