package org.example;


import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static org.example.XlsReader.*;

public class StepImplementation extends BaseTest {

    @Step("<second> Saniye Bekle")
    public void waitElement(int second) throws InterruptedException {
        Thread.sleep(second*1000);
    }


    @Step("Id li <element> elemente tikla")
    public void clickElementById(String element){
        driver.findElement(By.id(element)).click();
    }

    @Step("Xpath li <element> elemente tikla")
    public void clickElementByXpath(String element){
        driver.findElement(By.xpath(element)).click();
    }

    @Step("Id li <element> elementi bul ve <key> degeri yaz")
    public void sendKeyById(String element, String key){
        driver.findElement(By.id(element)).sendKeys(key);
    }


    @Step("Flight From Degeri Yazilmaktadir")
    public void sendKeyFlightFrom() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")).sendKeys(flightFrom());
    }

    @Step("Flight To Degeri Yazilmaktadir")
    public void sendKeyFlightTo() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")).sendKeys(flightTo());
    }
    @Step("Name Degeri Yazilmaktadir")
    public void sendKeyName() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")).sendKeys(name());
    }
    @Step("LastName Degeri Yazilmaktadir")
    public void sendKeyLastName() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")).sendKeys(lastName());
    }
    @Step("Email Degeri Yazilmaktadir")
    public void sendKeyEmail() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")).sendKeys(email());
    }
    @Step("Flyer Number Degeri Yazilmaktadir")
    public void sendKeyFlyerNumber() throws Exception {
        driver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddFlyerNumber")).sendKeys(flyerNumber());
    }


}
