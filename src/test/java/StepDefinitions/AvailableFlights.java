package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Hooks.SetupTeardown.driver;

public class AvailableFlights {
    HomePage homePage = new HomePage(driver);
    @Given("User is in the homepage of MakeMyTrip.com")
    public void user_is_in_the_homepage_of_make_my_trip_com() {
        driver.get("https://www.makemytrip.com");
    }
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
    public void selects_the_class_he_wants_to_travel_in() {
        System.out.println("class selected");
    }
    @Then("click search")
    public void click_search() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click", homePage.search);
    }
}
