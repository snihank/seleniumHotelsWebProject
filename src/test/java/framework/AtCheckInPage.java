package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import stepdefinition.SharedSD;

public class AtCheckInPage extends BasePage {

	// Locating name of destination in search bar
	private By nameOfDestination = By.id("qf-1q-destination");

	// Locating Check-in Date box
	private By checkInDate = By.id("qf-1q-localised-check-in");

	// Locating Check-out Date box
	private By checkOutDate = By.id("qf-1q-localised-check-out");

	// Locating edit or add rooms button
	private By editRoomsButton = By.xpath("//button[@type='button']");

	// Locating "Show Deals" button on the search box
	private By showDealsButton = By.xpath("((//button[@class='cta cta-strong'])[1])");

	// Locating information details under selected "name of destination in show
	// deals page
	private By userDetails = By.xpath("//div[@class='dates-occupancy']");

	// User enters "New York" in Destination text field
	public void enterAnyDestinationName(String destination) throws InterruptedException {
		sendText(nameOfDestination, destination);
		Thread.sleep(5000);
	}

	// User selects first destination from the suggestions
	public void selectDestinationFromSuggestions() {
		List<WebElement> destination = SharedSD.getDriver()
				.findElements(By.xpath("//div[@class='autosuggest-category-result']"));
		for (WebElement e : destination) {

			if (e.getText().contains("New York, New York, United States of America")) {
				e.click();
				break;
			}
		}
	}

	// User selects "08/04/2017" Check-In date
	public void clickCheckInDate(String checkInSpecificDate) throws InterruptedException {
		clickOn(checkInDate);
		sendText(checkInDate, checkInSpecificDate);
		Thread.sleep(500);
	}

	// User selects "08/10/2017" Check-Out date
	public void clickCheckOutDate(String checkOutSpecificDate) {
		clickOn(checkOutDate);
		clearText(checkOutDate);
		sendText(checkOutDate, checkOutSpecificDate);
		clickOn(checkOutDate);
	}

	// User clicks on edit or add rooms button
	public void clickEditRoomsButton() {
		clickOn(editRoomsButton);
	}

	// User selects more than 1 room
	public void roomSelection() {
		Select rooms = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-rooms")));
		rooms.selectByVisibleText("1");
	}

	// User select the number of adults in each room
	public void adultSelection() {
		Select adult = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-adults")));
		adult.selectByVisibleText("2");
	}

	// User select the number of children in each room
	public void childrenSelection() {
		Select children = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-children")));
		children.selectByVisibleText("1");
	}

	// User select the age of children at check-in
	public void childAgeSelection() {
		Select childAge = new Select(
				SharedSD.getDriver().findElement(By.xpath(".//*[@id='qf-1q-room-0-child-0-age']")));
		childAge.selectByVisibleText("2");
	}

	// User clicks on show deals
	public void clickShowDeals() {
		clickOn(showDealsButton);
	}

	/*
	 * User should be able to see deals of rooms for the given amount of adults
	 * and children below the name of the specified destination under the header
	 * of the page.
	 */
	public String verifyUserDetails() {
		return getTextFromElement(userDetails);
	}

}
