package framework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.Select;

import stepdefinition.SharedSD;

public class GuestRatings extends BasePage {

	// Locating Las Vegas Deal
	private By selectLasVegasDeal = By.xpath("//a[@href='https://www.hotels.com/de1504033/hotels-las-vegas-nevada/']");

	// Locating Check In Date Box
	private By checkInDate = By.xpath(".//*[@id='overlay-q-localised-check-in']");

	// Locating Check Out Date Box
	private By checkOutDate = By.xpath(".//*[@id='overlay-q-localised-check-out']");

	// Locating Continue Button on the pop up window
	private By clickonContinueButton = By.xpath(".//*[contains(@class,'cta widget-overlay-ok')]");

	// Locating Guest Rating option
	private By clickOnGuestRating = By.xpath(".//*[@id='enhanced-sort']/li[4]/a");

	// Locating Amenities
	private By clickOnAmenities = By.xpath(".//*[@id='filter-facilities']/h3");

	// Locating Free Breakfast in Amenities
	private By clickOnFreeBreakfastFromAmenities = By.xpath(".//*[@id='f-facilities-2048']");

	// Locating Themes
	private By clickOnThemes = By.xpath(".//*[@id='filter-themes-types']/h3");

	// Locating Business in Themes
	private By clickOnBusinessFromThemes = By.xpath(".//*[@id='f-thid-14']");

	// Locating the hotel that is first in the list
	private By clickOnHotelName = By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[1]/h3/a");

	// User scrolls down to Great deals in popular destinations
	public void scrollDownToGreatDeals() {

		JavascriptExecutor jsx = (JavascriptExecutor) SharedSD.getDriver();
		jsx.executeScript("window.scrollBy(0,600)");
	}

	// User selects any deals from the given options
	public void clickOnLasVegasDeal() {
		clickOn(selectLasVegasDeal);

	}

	// User selects "08/02/17" check-in date in the pop-up window
	public void selectCheckInDate(String givenDate) throws InterruptedException {

		clickOn(checkInDate);
		// clearText(checkInDate);
		sendText(checkInDate, givenDate);
		Thread.sleep(1000);
		// clickOn (checkInDate);
		// clickOn (selectDate);
		// List <WebElement> list =
		// SharedSD.getDriver().findElements(By.tagName("td"));
		// for (WebElement date : list) {
		// if(date.getText().contains("08/31/17")){
		// date.click();
		// break;
		// }
		// }
	}

	// User selects "08/10/17" check-out in the pop-up window
	public void selectCheckOutDate(String givenOutDate) throws InterruptedException {
		clickOn(checkOutDate);
		clearText(checkOutDate);
		sendText(checkOutDate, givenOutDate);
		// List <WebElement> list =
		// SharedSD.getDriver().findElements(By.tagName("td"));
		// for (WebElement date : list) {
		// if(date.getText().contains("09/05/17")){
		// date.click();
		// break;
		// }
		// }
	}

	// User selects number of rooms to one
	public void selectNumberOfRooms() {

		Select rooms = new Select(SharedSD.getDriver().findElement(By.xpath("//select[@id='overlay-q-rooms']")));
		rooms.selectByVisibleText("1");
	}

	// User selects number of adults to two
	public void selectNumberOfAdults() {
		Select adults = new Select(
				SharedSD.getDriver().findElement(By.xpath("//select[@id='overlay-q-room-0-adults']")));
		adults.selectByVisibleText("2");
	}

	// User selects number of children to one
	public void selectNumberOfChildren() throws InterruptedException {
		Select children = new Select(
				SharedSD.getDriver().findElement(By.xpath("//select[@id='overlay-q-room-0-children']")));
		children.selectByVisibleText("1");
		Thread.sleep(500);
	}

	// User selects age of children to one
	public void selectAgeOfChildren() {
		Select childrenAge = new Select(SharedSD.getDriver().findElement(By.id("overlay-q-room-0-child-0-age")));
		childrenAge.selectByVisibleText("1");
	}

	// User clicks on continue button
	public void clickOnContinueButton() {
		clickOn(clickonContinueButton);
	}

	// User clicks on guest rating from the sort by options on the hotels list
	// page
	public void clickOnGuestRatingOptions() {
		clickOn(clickOnGuestRating);
	}

	// User scrolls down and selects Free Beakfast from amenities
	public void scrollDownToSelectAmenities() {
		JavascriptExecutor jsx = (JavascriptExecutor) SharedSD.getDriver();
		jsx.executeScript("window.scrollBy(0,700)");

		clickOn(clickOnAmenities);
		clickOn(clickOnFreeBreakfastFromAmenities);
	}

	// User selects Business from Themes
	public void selectThemes() {
		clickOn(clickOnThemes);
		clickOn(clickOnBusinessFromThemes);
	}

	// Verify that the first hotel option contains guest ratings score
	public void verifyGuestRatings() throws InterruptedException {
		String score = SharedSD.getDriver().findElement(By.xpath("//div[@class='guest-reviews']")).getText();

		Pattern p = Pattern.compile("(Superb|/|5|reviews)");
		Matcher m = p.matcher(score);

		if (m.find(2)) {
			System.out.println("Found guest ratings box");
		}
		Thread.sleep(500);
	}

	// User clicks on First Hotel name
	public void clickFirstHotelName() {
		JavascriptExecutor jsix = (JavascriptExecutor) SharedSD.getDriver();
		jsix.executeScript("window.scrollBy(0,-500)");
		clickOn(clickOnHotelName);
	}

	// Verify the first hotel option contains selected amenities and themes
	public void amenitiesAndThemes() {
		windowHandler(1);
		JavascriptExecutor newjsix = (JavascriptExecutor) SharedSD.getDriver();
		newjsix.executeScript("window.scrollBy(0,700)");

		String mainAmenities = SharedSD.getDriver().findElement(By.xpath("//div[@id='overview']")).getText();

		Pattern p = Pattern.compile("(fan|knife)");
		Matcher m = p.matcher(mainAmenities);

		if (m.find()) {
			System.out.println("Found Free Breakfast and Business in Main Amenities");
		} else {
			System.out.println("Elements not found");
		}

	}

}
