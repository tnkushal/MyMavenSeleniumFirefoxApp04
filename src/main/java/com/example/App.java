package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {

    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();

        // Firefox binary path
        options.setBinary("/home/vboxuser/devops/MyMavenSeleniumFirefoxApp04/firefox/firefox");

        WebDriver driver = new FirefoxDriver(options);

        try {

            // --------------------
            // TAB 1
            // --------------------
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            System.out.println("Tab 1: SauceDemo login successful");

            // --------------------
            // TAB 2
            // --------------------
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.google.com");

            System.out.println("Tab 2: Google opened");

            // --------------------
            // TAB 3
            // --------------------
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.github.com");

            System.out.println("Tab 3: GitHub opened");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Browser will remain open
    }
}
