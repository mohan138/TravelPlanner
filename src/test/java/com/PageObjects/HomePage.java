package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.makemytrip.com/

public class HomePage{
    private final  WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='fromCity']")
    public WebElement fromCity;

    @FindBy(id = "toCity")
    public WebElement toCity;

    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    public WebElement city;

    @FindBy(xpath = "//label[@for=\"departure\"]")
    public WebElement departureDate;

    @FindBy(xpath = "//label[@for=\"travellers\"]")
    public WebElement classType;

    @FindBy(xpath = "//a[contains(@class, \"font24\")]")
    public WebElement search;
}