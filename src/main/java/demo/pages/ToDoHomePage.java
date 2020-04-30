package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoHomePage {
    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }
    public boolean userNavigate(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"))).isSelected();
    }

    public boolean userTapButtonAdd(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isSelected();
    }
    public boolean isOnPageNewToDo(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_edit_task_done"))).isDisplayed();
    }
    public boolean titleandcontent(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_edit_task_done"))).isDisplayed();
    }
    public boolean buttondone(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_edit_task_done"))).isSelected();
    }
    public boolean check(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean data = Boolean.valueOf(isChecked);
        return data;
    }
    public boolean statistic(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tasksLL"))).isDisplayed();
    }
    public boolean btnoptions(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("More options"))).isSelected();
    }
    public boolean clearcompleted(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android.widget.TextView[contains(@text, 'Clear completed')]"))).isEnabled();
    }
    public boolean btnfilter(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Filter"))).isDisplayed();
    }
    public boolean active(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android.widget.TextView[contains(@text, 'Active')]"))).isEnabled();
    }
    public boolean activeToDo(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android.widget.TextView[contains(@text, 'Active TO-DOs')]"))).isDisplayed();
    }
    public boolean completed(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android.widget.TextView[contains(@text, 'Completed')]"))).isEnabled();
    }
    public boolean completedToDo(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("noTasksMain"))).isDisplayed();
    }
    public boolean refresh(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//android.widget.TextView[contains(@text, 'Refresh')]"))).isEnabled();
    }
}
