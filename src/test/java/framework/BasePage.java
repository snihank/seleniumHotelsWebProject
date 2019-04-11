package framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import stepdefinition.SharedSD;


public class BasePage {

//	Click on any link/button/image
	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}
	
//	Clear text from any text input field
	 public void clearText(By locator) {
		 try{
			 SharedSD.getDriver().findElement(locator).clear(); 
		 } catch (NoSuchElementException e) {
				Assert.fail("Element is not found with this locator: " + locator.toString());
				e.printStackTrace();
			}
	 }
	
	
// Send text into any text input field
	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}


//	Get text from any web element
	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}
	
	
//	Switch to next window
	public void windowHandler(int index) {
		try {
			List<String> listOfWindows = new ArrayList<String>(SharedSD.getDriver().getWindowHandles());
			SharedSD.getDriver().switchTo().window(listOfWindows.get(index));
		} catch (Exception e) {
			Assert.fail("Window untraced");
			e.printStackTrace();
		}
		}
	
	
	
	public void selectFromDropDown() {
		
	}
	
	
//	Scroll up or down in current web page
	public void scrollUpOrDown(String string) {
		JavascriptExecutor jsx = (JavascriptExecutor)SharedSD.getDriver();
        jsx.executeScript(string.toString());
	}

	
	
	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	
	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	
	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}
}
