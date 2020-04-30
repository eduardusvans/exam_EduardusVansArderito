package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Refresh {
    ToDoHomePage toDoHomePage = new ToDoHomePage();


    @And("User tap refresh")
    public void userTapRefresh() {
        boolean result = toDoHomePage.refresh();
        Assert.assertTrue(result);
    }

    @Then("User to do list is refreshed")
    public void userToDoListIsRefreshed() {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
    }
}
