package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        //store the url in String datatype
        String baseUrl = "https://www.saucedemo.com/";

        //set the property from edgebrowser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //creating object of webdriver interface
        WebDriver driver = new EdgeDriver();

        //launch URl
        driver.get(baseUrl);

        //maximize the window
        driver.manage().window().maximize();

        //give the implicity time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of the page
        System.out.println("Title : " + driver.getTitle());

        //print the current URL
        System.out.println("current url : " + driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //enter the email to email field
        WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("standard_user");

        //enter the pssword to password ield
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("secret_sauce");

        //close driver
        // driver.close();

    }
}