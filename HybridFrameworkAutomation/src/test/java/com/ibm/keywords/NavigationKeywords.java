package com.ibm.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationKeywords {

    WebDriver driver;

    public NavigationKeywords(WebDriver driver) {
        this.driver = driver;
    }

    public void GoToHome() {
        driver.findElement(By.linkText("HOME")).click();
    }

    public void GoToPractice() {
        driver.findElement(By.linkText("PRACTICE")).click();
    }
    
    public void GoToCourses() {
        driver.findElement(By.linkText("COURSES")).click();
    }
    
    public void GoToBlog() {
        driver.findElement(By.linkText("BLOG")).click();
    }
    
    public void GoToContact() {
        driver.findElement(By.linkText("CONTACT")).click();
    }

    public void GoToTestLoginPage() {
        driver.findElement(By.partialLinkText("Test Login")).click();
    }

    
}

