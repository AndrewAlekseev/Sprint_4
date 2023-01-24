package com.example.scooters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePageScooter {



    private final WebDriver driver;
    private int index;

    // Локатор для кнопки "Принять кукки"
    private final By acceptCookie = By.className("App_CookieButton__3cvqF");
    //  локатор для dropdown
    private final By locator = By.id("accordion__panel-" + index);
    //  локатор для панели
    private final By panel = By.id("accordion__heading-" + index);
    // метод отображения аккордиона после к клика
    public Boolean isPanelVisible() {
        return driver.findElement(locator).isDisplayed();
    }
    public void clickAcceptCookie(){
        driver.findElement(acceptCookie).click();
    }

    // метод клика на стрелку
    public void clickPanel() {
        driver.findElement(locator).click();
    }

    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }


}
