package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import stepdefinition.SharedSD;

public class Groups extends BasePage{
	
	    private By groupBooking = By.id("hdr-groups");
	    private By destination = By.id("txtCity1");
	    private By checkInDate = By.cssSelector("#CheckInDate1_disp");
	    private By selectInDate = By.xpath("//td//a[(contains(text(),15))]");
	    
	    private By checkOutDate = By.id("CheckOutDate1_disp");
	    private By selectOutDate = By.xpath("//td//a[(contains(text(),20))]");
	    
	    private By closeButton = By.cssSelector(".closeDatepicker");
	    private By groupType = By.id("groupType");
	    private By rooms = By.id("rooms");
	    
	    private By star = By.xpath(".//*[@id='starRatingRow']/div/button");
	    private By starRt = By.xpath(".//*[@id='starRatingRow']/div/ul/li[2]");
	    
	    private By starOne = By.xpath(".//*[@id='starRatingRow']/div/button");
	    private By fullName = By.id("FullName");
	    private By emaidId = By.id("input-email");
	    private By  continueButton = By.xpath(".//*[@id='frmRequestSmart']/button");
	    private By seeOffer = By.name("QuoteMode");
	    private By bestNumber = By.name("Phone_disp");
	    private By continueButton1 = By.name("step2");
	    private By pickTheHotels = By.linkText("Next:Picks the hotels you want to quote");
	    private By signOutLink = By.linkText("Sign out");
	    private By signInAgainLink = By.linkText("Sign in Again");

	    
	    public void enterPlace(String place) throws InterruptedException {
	    	clickOn(destination);
	    	sendText(destination, place);
	    	Thread.sleep(3000);
	    	
	    	List <WebElement> listOfPlaces = SharedSD.getDriver().findElements(By.xpath("//div[@class='pac-item']"));		
	    	
			for (WebElement e: listOfPlaces) {
				if (e.getText().contains("New South Wales, Australia"));
				e.click();
				break;
					
			}
	    	}
	    
	    public void clickOnCheckIn() throws InterruptedException {
	    	clickOn(checkInDate);
	    	Thread.sleep(3000);
	    }
	    
	    public void earlierCheckIn() {
//	    	boolean exist = SharedSD.getDriver().findElements(By.xpath("")).size() == 0;
	    	
//	    	if(SharedSD.getDriver().findElement(By.xpath("")).isEnabled())
//	    	{
//	    	System.out.println("This date can be selected");
//	    	}
//	    	else
//	    	{
//	    	System.out.println("This date cannot be selected");
//	    	}
	    }
	    
	    public void selectCheckInDate() {
	    	clickOn(selectInDate);
	    }
	    
	    public void selectCheckOutDate() {
	    	clickOn(checkOutDate);
	    	clearText(checkOutDate);
	    	clickOn(selectOutDate);
	    }
	    
	    public void selectGroup() {
			Select numOfRooms = new Select(SharedSD.getDriver().findElement(By.id("groupType")));
			numOfRooms.selectByVisibleText("Golf");
		}
	    
	    public void roomPerNight(String roomsPerNight){
	    	clickOn(rooms);
	    	sendText(rooms, roomsPerNight);
	    }
	    
	    public void setRating() throws InterruptedException{
	    	clickOn(star);
	    	Thread.sleep(3000);
	    	clickOn(starRt);
	    	
	    	
	    }
	    
	    public void setBudget() {
	    	 WebElement slider = SharedSD.getDriver().findElement(By.xpath(".//*[@id='group-form-budget']/div/div"));
	    	    Actions move = new Actions(SharedSD.getDriver());
	    	    Action action = (Action) move.dragAndDropBy(slider, 35, 70).build();
	    	    ((Actions) action).perform();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
