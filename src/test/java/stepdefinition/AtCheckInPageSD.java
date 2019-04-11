package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AtCheckInPage;


public class AtCheckInPageSD {
	
	AtCheckInPage atCheckInPage = new AtCheckInPage();
	
	
	@When("^User enters \"([^\"]*)\" in Destination text field$") 
	public void ienterAnyDestinationName (String destination) throws InterruptedException {
		atCheckInPage.enterAnyDestinationName(destination);
	}
	@And("^User selects first destination from the suggestions$")
	public void icloseListOfSuggestions() {
		atCheckInPage.selectDestinationFromSuggestions();
	}
	
	@And("^User selects (.+) Check-In date$")
	public void iClickCheckInDate(String checkInSpecificDate) throws InterruptedException {
		atCheckInPage.clickCheckInDate(checkInSpecificDate);
	}
	
	@And("^User selects (.+) Check-Out date$")
	public void iClickCheckOutDate(String checkOutSpecificDate) {
		atCheckInPage.clickCheckOutDate(checkOutSpecificDate);
	}

	@And("^User clicks on edit or add rooms button$")
	public void iEditRooms() {
		atCheckInPage.clickEditRoomsButton();
	}
	
	@And("^User selects more than 1 room$")
	public void iSelectRooms() {
		atCheckInPage.roomSelection();
	}
	
	@And("^User select the number of adults in each room$")
	public void iSelectAdults() {
		atCheckInPage.adultSelection();
	}
	
	@And("^User select the number of children in each room$")
	public void iSelectChildren() {
		atCheckInPage.childrenSelection();
	}
	@And("^User select the age of children at check-in$")
	public void iSelectChildAge() {
		atCheckInPage.childAgeSelection();
	}
	@And("^User clicks on show deals$")
	public void iClickShowDeals() {
		atCheckInPage.clickShowDeals();
	}
	@Then("^User should be able to see deals of rooms for the given amount of adults and children below the name of the specified destination under the header of the page.$")
	public void iVerifyUserDetails() {
		String details = "Fri 25 - Wed 30 August 2017, 5 nights, 1 room, 2 adults, 1 child";
		Assert.assertEquals(atCheckInPage.verifyUserDetails(), details);
	}
	
	
}
