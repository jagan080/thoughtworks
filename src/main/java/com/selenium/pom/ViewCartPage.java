package com.selenium.pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewCartPage {

	WebDriver driver;

	public ViewCartPage(WebDriver driver){ 
        this.driver=driver; 
}


//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _14O7kc _7UHT_c']") WebElement placeOrder;



public void clickPlaceOrder(){
	
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	 wait.until(ExpectedConditions.elementToBeClickable(placeOrder)).click();

}




}
