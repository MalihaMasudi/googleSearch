package Google;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefClass {
    WebDriver driver;


    @Given("I am on the Google homepage")
    public void i_am_on_the_google_homepage() {
       WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
}
    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String string) {
        WebElement searchbox = driver.findElement(By.name("q"));

        searchbox.sendKeys("cucumber");
        searchbox.sendKeys(Keys.RETURN);
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
    }
}



