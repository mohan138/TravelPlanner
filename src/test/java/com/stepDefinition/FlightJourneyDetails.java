package com.stepDefinition;

import com.PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightJourneyDetails {
    WebDriver driver;
    HomePage homePage;
    @Given("The user opens MakeMyTrip website.")
    public void the_user_opens_make_my_trip_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.makemytrip.com");
        homePage = new HomePage(driver);
    }
    @When("User enters starting city")
    public void user_enters_starting_city() {
        homePage.fromCity.sendKeys("Chennai");
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElement(homePage.city, "Chennai"));
        homePage.city.click();
    }
    @When("enters destination city")
    public void enters_destination_city() {
        homePage.toCity.sendKeys("Delhi");
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElement(homePage.city, "Delhi"));
        homePage.city.click();
    }
    @When("enters departure date")
    public void enters_departure_date() {
        homePage.departureDate.click();
        driver.findElement(By.xpath("//*[@aria-label ='Mon Oct 03 2022']")).click();
    }
    @When("selects the travel class and clicks search")
    public void selects_the_travel_class_and_clicks_search() {
        homePage.search.click();
    }
    
    @Then("close the browser")
    public void close(){
        //driver.quit();
    }


//    aria-label = Mon Oct 03 2022;


}
