package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AirportShuttle;

public class AirportShuttleSD {
	
	AirportShuttle airportShuttle = new AirportShuttle();
	
	@When("^User enters \"([^\"]*)\" in Destination, hotel, landmark, or address text field$") 
	public void iEnterDestinationName(String destination) throws InterruptedException{
		airportShuttle.enterDestinationName(destination);
		}
	
	@And("^User confirms check-in date$")
	public void iSelectCheckInDate() throws InterruptedException{
		airportShuttle.confirmCheckInDate();
		}
	
	@And("^User confirms check-out date$") 
	public void iSelectCheckOutDate(){
		airportShuttle.confirmCheckOutDate();
	}
	
	@And("^User selects the number of rooms, adults, children$")
	public void selectRoomsAultsChildren(){
		airportShuttle.selectNumberOfRoomsAdultsChildren();
	}
	
	@And("^User clicks on Show Deals$")
	public void iClickOnShowDealsLink(){
		airportShuttle.clickOnShowDealsLink();
	}
	
	@And("^User scrolls down to select any airports from Landmark drop down$")
	public void selectAirportFromLandmark() throws InterruptedException {
		airportShuttle.selectAirportFromLandmark();
	}
	
	@And("^User clicks on Airport transfers under amenities drop down$")
	public void selectAirportTransfersInAmenities(){
		airportShuttle.clickOnAirportTransfersFromAmenities();
	}
	@And ("^User scrolls up$")
	public void scrollUpToTop() {
		airportShuttle.userScrollsUp();
	}
	
	@And("^User clicks on hotel name on top of the list$")
	public void clickOnFirstHotelName(){
		airportShuttle.clickOnFirstHotelName();
	}
	
	@Then("^User can find free airport shuttle in the main amenities section$")
	public void iVerifyAirportTransfers() {
		airportShuttle.verifyAirportTransfers();
	}

}
