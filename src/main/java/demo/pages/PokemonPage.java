package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PokemonPage {
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
    public String getTitle(){
        WebElement titleArticle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title = 'Telusuri']")));
        String title = titleArticle.getText();
        return title;
    }
}
