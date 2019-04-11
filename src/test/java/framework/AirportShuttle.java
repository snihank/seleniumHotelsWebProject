package framework;

/*Scenario: Verify user can find hotels 
 * with free airport shuttle near selected airports
 */

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import stepdefinition.SharedSD;

public class AirportShuttle extends BasePage {
	
//	Locating name of destination in destination search bar
	private By nameOfDestination = By.id("qf-1q-destination");
		
//	Locating Check-in Date box
	private By addCheckInDate = By.id("qf-1q-localised-check-in");
	
//	Locating next month button in date drop down
//	private By nextButton = By.xpath("//button[@class='widget-datepicker-next cta cta-control']");
	
	
	private By selectSecond = By.xpath("//td[@data-date='2017-7-25']");
//	Locating Check-out Date box
	
	private By addCheckOutDate = By.id("qf-1q-localised-check-out");
	private By selectOut = By.xpath("//td[@data-date='2017-7-30']");
	
//	Locating "Show Deals" button on the search box
	private By showDealsButton = By.xpath("(//button[@class='cta cta-strong'][1])");
		
//	Locating Landmarks drop down
	private By landMarks = By.xpath(".//*[@id='filter-landmarks']/h3");
	
//	Locating "JFK" check box under Landmark drop down
	private By jfkAirport = By.xpath(".//*[@id='f-lid-1662393']");
	
//	Locating Amenities drop down
	private By amenities = By.xpath(".//*[@id='filter-facilities']/h3");
	
//	Locating "Airport transfers" check box under Amenities drop down
	private By airportTransfers = By.xpath("//input[@id='f-facilities-513']");
	
//	Locating Hotel name from the search results
	private By nameOfHotel = By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[1]/h3/a");
	
	
	
//	User enters "New York" in Destination, hotel, landmark, or address text field
	public void enterDestinationName(String destination) throws InterruptedException {
		sendText(nameOfDestination, destination);

		Thread.sleep(5000);
		
		List <WebElement> listOfPlaces = SharedSD.getDriver().findElements(By.xpath("//div[@class='autosuggest-category-result']"));		
	
		for (WebElement e: listOfPlaces) {
			if (e.getText().contains("New York, New York, United States of America"));
			e.click();
			break;
				
		}
		}
	
//	String selectStartDate
//	User confirms "08/02/2017" check-in date
	public void confirmCheckInDate() throws InterruptedException {
//		 clickOn(addCheckInDate);
		
//		List<WebElement> day = SharedSD.getDriver().findElements(By.xpath("//td[@data-date]"));
//    	List <WebElement> monthAndYear = SharedSD.getDriver().findElements(By.xpath("//div[@class='widget-datepicker-label']"));
    	
    	clickOn(addCheckInDate);
//    	clickOn(nextButton);
    	
    	
//    	for(WebElement month: monthAndYear) {
//    		if(month.equals("September 2017"));
//    		month.click();
//    		break;
//    	}
//    	Thread.sleep(3000);
//    	
//    	for(WebElement date:day){
//    		if(date.equals("09/15/17"));
//    		date.click();
//    		break;
//    	}
//		 List <WebElement> dates = SharedSD.getDriver().findElements(By.xpath("//div[@class='widget-datepicker']"));
//		 int node = dates.size();
//		 for (int i=0; i < node; i++) {
//			 String date = dates.get(i).getText();
//			 if (date.equals("2")){
//				 dates.get(i).click();
//				 break;
//			 }
//		 }
		 Thread.sleep(3000);
		 clickOn(selectSecond);
		 Thread.sleep(3000);

//		        sendText(addCheckInDate, selectStartDate);
//		        Thread.sleep(1000);
		
	}
	
//	User confirms "08/05/2017" check-out date
	public void confirmCheckOutDate() {
		clickOn (addCheckOutDate);
		clearText (addCheckOutDate);
		clickOn (selectOut);
		
		
//		sendText(addCheckOutDate, selectEndDate);
		
	}
	
//	User selects the number of rooms, adults, children
	public void selectNumberOfRoomsAdultsChildren() {
		Select rooms = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-rooms")));
		rooms.selectByVisibleText("2");
		
		Select adultsInRoom1 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-adults")));
		adultsInRoom1.selectByVisibleText("2");
		
		Select adultsInRoom2 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-1-adults")));
		adultsInRoom2.selectByVisibleText("2");
		
		Select childrenInRoom1 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-children")));
		childrenInRoom1.selectByVisibleText("1");
		
		Select ageOfChildrenInRoom1 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-0-child-0-age")));
		ageOfChildrenInRoom1.selectByVisibleText("2");
		
		Select childrenInRoom2 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-1-children")));
		childrenInRoom2.selectByVisibleText("1");
		
		Select ageOfChildrenInRoom2 = new Select(SharedSD.getDriver().findElement(By.id("qf-1q-room-1-child-0-age")));
		ageOfChildrenInRoom2.selectByVisibleText("1");
		}
	
//	User clicks on Show Deals
	public void clickOnShowDealsLink() {
		clickOn (showDealsButton);
	}
	
//	User scrolls down to select any airports from Landmark drop down
	public void selectAirportFromLandmark() throws InterruptedException {
		clickOn (landMarks);
		clickOn (jfkAirport);
		Thread.sleep(3000);
//		JavascriptExecutor newjsix = (JavascriptExecutor)SharedSD.getDriver();
//        newjsix.executeScript("window.scrollBy(0,500)");
	}
	
//	User clicks on Airport transfers under amenities drop down
	public void clickOnAirportTransfersFromAmenities() {
		Dimension d = new Dimension(1400,1000);
        SharedSD.getDriver().manage().window().setSize(d);
		JavascriptExecutor newjsix = (JavascriptExecutor)SharedSD.getDriver();
        newjsix.executeScript("window.scrollBy(0,650)");
		clickOn (amenities);
		clickOn (airportTransfers);
	}
	
	public void userScrollsUp() {
		JavascriptExecutor newjsix = (JavascriptExecutor)SharedSD.getDriver();
        newjsix.executeScript("window.scrollBy(0,-500)");
	}
	
//	User clicks on hotel name on top of the list
	public void clickOnFirstHotelName() {
		
		String listOfElements = (SharedSD.getDriver().findElement(By.xpath("//div[@class='hotel-wrap']"))).getText();
		
		Pattern findWords = Pattern.compile("JFK|miles|from|John F Kennedy|International|Airport");
		Matcher m = findWords.matcher(listOfElements);
		
		if (m.find()) {
			System.out.println("Airport found");
			
		}
		
		clickOn (nameOfHotel);
		
		
		windowHandler(1);
	}
	
//	User can find free airport shuttle in the main amenities section
	public void verifyAirportTransfers () {
		JavascriptExecutor newjsix = (JavascriptExecutor)SharedSD.getDriver();
        newjsix.executeScript("window.scrollBy(0,750)");
		
		String listOfAmenities = (SharedSD.getDriver().findElement(By.xpath(".//*[@id='overview-columns']"))).getText();
		
		Pattern p = Pattern.compile("Free Breakfast|");
		Matcher m = p.matcher(listOfAmenities);
		
		if (m.find()){
			System.out.println("Found Free Breakfast and Business in Main Amenities");
		}else {
			System.out.println("Landmarks and Amenities not found");
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
