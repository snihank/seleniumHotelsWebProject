package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import stepdefinition.SharedSD;

public class ShowDealsPage extends BasePage {
	// Locating name of destination in search bar
	private By destination = By.id("qf-1q-destination");

	// Locating Check-in Date box
	private By userCheckInDate = By.id("qf-1q-localised-check-in");

	// Locating Check-out Date box
	private By userCheckOutDate = By.id("qf-1q-localised-check-out");

	// Locating "Show Deals" button on the search box
	private By showDealsButton = By.xpath("((//button[@class='cta cta-strong'])[1])");

	// Locating Change search button on show deals page
	private By changeSearchButton1 = By.xpath("//button[@aria-controls='change-search-form']");

	// Locating Check-in Date box under Change Search drop down link
	private By changeCheckInDate = By.id("q-localised-check-in");

	// Locating Check-out Date box under Change Search drop down link
	private By changeCheckOutDate = By.id("q-localised-check-out");

	// Locating Search Button
	private By searchButton = By.xpath("((//button[@type='submit'])[1])");

	// Locating the changes in the details of the user
	private By newDetailsDisplayed = By.xpath("//div[@class='dates-occupancy']");

	// User types "Boston" into destination text field
	public void enterDestination(String destinationName) throws InterruptedException {
		sendText(destination, destinationName);
		Thread.sleep(5000);
	}

	// User selects destination from the drop down suggestions
	public void destinationSelection() {
		List<WebElement> listOfDestinations = SharedSD.getDriver()
				.findElements(By.xpath("//div[@class='table-element']"));

		for (WebElement e : listOfDestinations) {
			if (e.getText().contains("Boston, Massachusetts, United States of America"));
			e.click();
			break;

		}
	}

	// User clicks on "08/02/2017" check-in date
	public void userSelectCheckInDate(String givenDate) throws InterruptedException {
		clickOn(userCheckInDate);
		sendText(userCheckInDate, givenDate);
		Thread.sleep(1000);
	}

	// User clicks on "08/10/2017" check-out date
	public void userSelectCheckOutDate(String givenOutDate) {
		clickOn(userCheckOutDate);
		clearText(userCheckOutDate);
		sendText(userCheckOutDate, givenOutDate);
		clickOn(userCheckOutDate);
	}

	// User selects one in the number of rooms drop down
	public void selectNumOfRooms() {
		Select numOfRooms = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-rooms")));
		numOfRooms.selectByVisibleText("1");
	}

	// User selects two in the number of adults drop down
	public void selectNumOfAdults() {
		Select numOfAdults = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-adults")));
		numOfAdults.selectByVisibleText("2");
	}

	// User selects one in the number of children drop down
	public void selectNumOfChildren() {
		Select numOfChildren = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-children")));
		numOfChildren.selectByVisibleText("1");
	}

	// User selects three in age of children drop down
	public void selectAgeOfChildren() throws InterruptedException {
		Select ageOfChildren = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-child-0-age")));
		ageOfChildren.selectByVisibleText("3");
		Thread.sleep(5000);
	}

	// User clicks on show deals button
	public void clickOnShowDealsButton() {
		clickOn(showDealsButton);
	}

	// User clicks on change search button on the show deals page
	public void clickOnChangeSearch() {
		clickOn(changeSearchButton1);
	}

	// User selects new "08/04/2017" check-in date
	public void newCheckInDate(String newDate1) throws InterruptedException {
		clickOn(changeCheckInDate);
		clearText(changeCheckInDate);

		sendText(changeCheckInDate, newDate1);
		Thread.sleep(1000);
	}

	// User selects new "08/07/2017" check-out date
	public void newCheckOutDate(String newDate2) {
		clickOn(changeCheckOutDate);
		clearText(changeCheckOutDate);
		sendText(changeCheckOutDate, newDate2);
		clickOn(changeCheckOutDate);
	}

	// User changes selection in number of rooms to two
	public void changeNumOfRooms() throws InterruptedException {
		Select newNumOfRooms = new Select(SharedSD.getDriver().findElement(By.xpath("//select[@id='q-rooms']")));
		newNumOfRooms.selectByVisibleText("2");
		Thread.sleep(2000);
	}

	// User changes selection in number of adults to two in the first room
	public void changeNumOfAdults() {
		Select newNumOfAdults = new Select(
				SharedSD.getDriver().findElement(By.xpath("//select[@id='q-room-0-adults']")));
		newNumOfAdults.selectByVisibleText("2");
	}

	// User changes selection in number of children to one in the first room
	public void changeNumOfChildren() {
		Select newNumOfChildren = new Select(SharedSD.getDriver().findElement(By.cssSelector("#q-room-0-children")));
		newNumOfChildren.selectByVisibleText("1");
	}

	// User changes selection in age of first children to two
	public void changeAgeOfChildOne() throws InterruptedException {
		Select newAgeOfChild1 = new Select(
				SharedSD.getDriver().findElement(By.xpath("(//select[@id='q-room-0-child-0-age'][1])")));
		newAgeOfChild1.selectByVisibleText("2");
		Thread.sleep(3000);
	}

	// User changes number of adults in the second room to one
	public void adultsInRoomTwo() {
		Select secondRoom = new Select(SharedSD.getDriver().findElement(By.id("q-room-1-adults")));
		secondRoom.selectByVisibleText("1");
	}

	// User adds one child in room two
	public void numOfChildInRoomTwo() throws InterruptedException {
		Select secondRoom = new Select(SharedSD.getDriver().findElement(By.id("q-room-1-children")));
		secondRoom.selectByVisibleText("1");
		Thread.sleep(3000);
	}

	// User adds age of child in the second room as one
	public void changeAgeOfChild2() {
		Select newAgeOfChild2 = new Select(SharedSD.getDriver().findElement(By.id("q-room-1-child-0-age")));
		newAgeOfChild2.selectByVisibleText("1");
	}

	// User clicks on search button
	public void clickOnSearchButton() {
		clickOn(searchButton);
	}

	// The changes in details are displayed
	public String verifyNewDetails() {
		return getTextFromElement(newDetailsDisplayed);
	}

}
