package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage {
    public void openHomePage(){
        WebDriverInstance.driver.get("https://www.google.com");
    }
    public void inputSearch(String keyword){
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.name("q"));
        inputSearch.sendKeys(keyword + " wikipedia indonesia", Keys.ENTER);
    }
//    public void openWikiPage(){
//        WebElement inputSearch = WebDriverInstance.driver.findElement(By.xpath("//div[@id= 'rso']"));
//        inputSearch.click();
//    }
}
