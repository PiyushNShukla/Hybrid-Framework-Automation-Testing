package com.ibm.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginKeywords {

    WebDriver driver;

    public LoginKeywords(WebDriver driver) {
        this.driver = driver;
    }
    
    public void LoginWithInvalidCredentials(String data) {

        String[] creds = data.split(",");
        String username = creds[0];
        String password = creds[1];

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    public void LoginWithValidCredentials(String data) {

        String[] creds = data.split(",");
        String username = creds[0];
        String password = creds[1];

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }
}
