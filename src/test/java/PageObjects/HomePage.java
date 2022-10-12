package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "fromCity")
    public WebElement fromCity;
    @FindBy(id ="toCity")
    public WebElement toCity;
    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    public WebElement city;
    @FindBy(xpath = "//label[@for=\"departure\"]")
    private WebElement departureDate;
    @FindBy(id = "travellers")
    public WebElement classType;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
    public WebElement search;
    public void departureDate(String date){
        departureDate.click();
        driver.findElement(By.xpath("//div[@aria-label=\""+date+"\"]")).click();
    }
}
