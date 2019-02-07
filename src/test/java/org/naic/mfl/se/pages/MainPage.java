package org.naic.mfl.se.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class MainPage {

    WebDriver driver;
    //WebDriverWait wait;


    public MainPage(WebDriver driver){
        this.driver = driver;
        //wait = new WebDriverWait(driver, 10, 50);
        driver.get("http://automationpractice.com/index.php");
    }

    public void setEmail(String email){
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    public void clickSubmit(){
        driver.findElement(By.id("SubmitCreate")).click();
    }

    public void setName(String name) {
        driver.findElement(By.id("customer_firstname")).sendKeys(name);
    }
}
