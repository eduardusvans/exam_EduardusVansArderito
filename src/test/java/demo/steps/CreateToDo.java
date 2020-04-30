package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateToDo {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @When("User tap button fab_add_task")
    public void userTapButtonFab_add_task() {
        boolean result = toDoHomePage.userTapButtonAdd();
        Assert.assertTrue(result);
    }

    @Then("User is on new to do page")
    public void userIsOnNewToDoPage() {
        boolean result = toDoHomePage.isOnPageNewToDo();
        Assert.assertTrue(result);
    }

    @And("User input title and content")
    public void userInputTitleAndContent() {
        boolean result = toDoHomePage.titleandcontent();
        Assert.assertTrue(result);
    }

    @Then("User tap button fab_edit_task_done")
    public void userTapButtonFab_edit_task_done() {
        boolean result = toDoHomePage.buttondone();
        Assert.assertTrue(result);
    }
}
