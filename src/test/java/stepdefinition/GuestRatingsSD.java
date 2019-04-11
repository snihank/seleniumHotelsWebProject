package stepdefinition;

import framework.GuestRatings;



import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;

public class GuestRatingsSD {
	
	private GuestRatings guestRatings = new GuestRatings();

	@And("^User scrolls down to Great deals in popular destinations$") 
	public void greatDeals() {
		guestRatings.scrollDownToGreatDeals();
	}
	
	@And("^User selects any deals from the given options$") 
	public void iSelectLasVegasDeal() {
		guestRatings.clickOnLasVegasDeal();
	}
	
	@And("^User selects (.+) check-in date in the pop-up window$")
	public void iSelectCheckInDate(String givenDate) throws InterruptedException {
		guestRatings.selectCheckInDate(givenDate);
	}
	
	@And("^User selects (.+) check-out in the pop-up window$")
	public void iSelectCheckOutDate(String givenOutDate) throws InterruptedException {
		guestRatings.selectCheckOutDate(givenOutDate);
	}
	
	@And("^User selects number of rooms to one$") 
	public void iSelectNumberOfRooms() {
		guestRatings.selectNumberOfRooms();
		
	}
	
	@And("^User selects number of adults to two$")
	public void iSelectNumberofAdults() {
		guestRatings.selectNumberOfAdults();
		
	}
	
	@And("^User selects number of children to one$")
	public void iSelectNumberofChildren() throws InterruptedException {
		guestRatings.selectNumberOfChildren();
	}
	
	@And("^User selects age of children to one$")
	public void iSelectAgeofChildren() {
		guestRatings.selectAgeOfChildren();
	}
	
	@And("^User clicks on continue button$")
	public void iClickOnContinueButton() {
		guestRatings.clickOnContinueButton();
	}
	
	@And("^User clicks on guest rating from the sort by options on the hotels list page$")
	public void iClickOnGuestRatingOptions() {
		guestRatings.clickOnGuestRatingOptions();
	}
	
	@And("^User scrolls down and selects Free Beakfast from amenities$")
	public void iSelectFromAmenities() {
		guestRatings.scrollDownToSelectAmenities();
	}
	
	@And("^User selects Business from Themes$")
	public void iSelectFromThemes() {
		guestRatings.selectThemes();
	}
	
	@Then("^Verify that the first hotel option contains guest ratings score$")
	public void iVerifyGuestRatings() throws InterruptedException {
		guestRatings.verifyGuestRatings();
		
	}
	@And("^User clicks on First Hotel name$")
	public void iClickFirstHotelName() {
		guestRatings.clickFirstHotelName();
	}
	@And("^Verify the first hotel option contains selected amenities and themes$")
	public void iVerifyGuestAmenitiesAndThemes(){
		guestRatings.amenitiesAndThemes();
		
	}
	
	

}
