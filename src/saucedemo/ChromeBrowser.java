package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        //store URL in String datatype
        String baseUrl = "https://www.saucedemo.com/";

        //set the property from chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //creating object of web driver interface
        WebDriver driver = new ChromeDriver();

        //launch the URL
        driver.get(baseUrl);

        //maximize the window
        driver.manage().window().maximize();

        //give the implicity time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of the page
        System.out.println("Title : " + driver.getTitle());

        //print the current URl
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //print the print source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emialField = driver.findElement(By.id("user-name"));
        emialField.sendKeys("standard_user");

//        WebElement emialField1 = driver.findElement(By.id("user-name"));
//        emialField.sendKeys("locked_out_user");
//
//        WebElement emialField2 = driver.findElement(By.id("user-name"));
//        emialField.sendKeys("problem_user");
//
//        WebElement emialField3 = driver.findElement(By.id("user-name"));
//        emialField.sendKeys("performance_glitch_user");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
        //driver.close();

    }
}