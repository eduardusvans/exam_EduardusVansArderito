package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckToDo {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User check the task checkbox")
    public void userCheckTheTaskCheckbox() {
        boolean result = toDoHomePage.check();
        Assert.assertTrue(result);
    }

    @Then("User task is checked")
    public void userTaskIsChecked() {
        boolean result = toDoHomePage.check();
        Assert.assertTrue(result);
    }
}
