package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {
    public static void main(String[] args) {

        // Selenium Firefox options
        FirefoxOptions options = new FirefoxOptions();

        // Point to the real Firefox binary inside Snap
        options.setBinary("/snap/firefox/current/usr/lib/firefox/firefox");

        // GUI mode: do NOT use headless
        // options.addArguments("-headless"); // <-- commented out to see browser

        // Initialize driver
        WebDriver driver = new FirefoxDriver(options);

        // Open SauceDemo and print page title
        driver.get("https://www.saucedemo.com/");
        System.out.println("Page title: " + driver.getTitle());

        // Maximize window
        driver.manage().window().maximize();

        // Pause to see the browser for 15 seconds
        try {
            Thread.sleep(15000); // 15 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Quit driver
        driver.quit();
    }
}
