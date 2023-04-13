package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.BasePage;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void searchValue(String value){
        driver.findElement(By.cssSelector("#APjFqb, input[title='Szukaj']")).sendKeys(value);
        driver.findElement(By.cssSelector(".gNO89b")).submit();
    }

    public ResultsPage searchValue1(String value){
        driver.findElement(By.cssSelector("#APjFqb, input[title='Szukaj']")).sendKeys(value+ "\n");
        return PageFactory.initElements(driver, ResultsPage.class);
    }
}

