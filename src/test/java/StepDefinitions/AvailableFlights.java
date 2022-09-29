package StepDefinitions;

import PageObjects.HomePage;
import Utilities.SetupTeardown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvailableFlights extends SetupTeardown {
    WebDriver driver = getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("User enters the from city")
    public void user_enters_the_from_city() {
        homePage.fromCity.sendKeys("Chennai");
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElement(homePage.city, "Chennai"));
        homePage.city.click();
    }
    @Given("User enters to city")
    public void user_enters_to_city() {
        homePage.toCity.sendKeys("Delhi");
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElement(homePage.city, "Delhi"));
        homePage.city.click();
    }
    @Given("Selects the date of journey")
    public void selects_the_date_of_journey() {
        homePage.departureDate("Sun Oct 09 2022");
    }
    @Given("Selects the class he wants to travel in")
    public void selects_the_class_he_wants_to_travel_in(String classType) {

    }
    @Then("click search")
    public void click_search() {
        System.out.println(5);
    }
}
