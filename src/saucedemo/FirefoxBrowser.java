package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //store the url in string datatype
        String baseUrl = "https://www.saucedemo.com/";

        //set the property from firefox browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new FirefoxDriver();

        //launch the URL
        driver.get(baseUrl);

        //maximize the window
        driver.manage().window().maximize();

        //give implicit time to create
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //print the title of the page
        System.out.println("Title  : " + driver.getTitle());

        //print the current uRL
        System.out.println("current URL : " + driver.getCurrentUrl());

        //print the pagesource
        System.out.println("Page source is :" + driver.getPageSource());

        //enter the email to email field
        WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("standard_user");

        //enter the pssword to password ield
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("secret_sauce");

        //close driver
        driver.close();
    }
}
