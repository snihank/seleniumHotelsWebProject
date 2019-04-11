package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.ShowDealsPage;



public class ShowDealsPageSD {
	
	ShowDealsPage showDealsPage = new ShowDealsPage();
	
	
  @When("^User types \"([^\"]*)\" into destination text field$") 
	public void userTypeDestination(String destinationName) throws InterruptedException  {
	  showDealsPage.enterDestination(destinationName);
  	}
  
	@And("^User selects destination from the drop down suggestions$")
	public void userClicksOnFirstOption()  {
		showDealsPage.destinationSelection();
	}
	
	@And("^User clicks on (.+) check-in date$")
	public void userSelectsCheckInDate(String givenDate) throws InterruptedException {
		showDealsPage.userSelectCheckInDate(givenDate);
	}
	
	@And("^User clicks on (.+) check-out date$")
	public void userSelectsCheckOutDate(String givenOutDate) {
		showDealsPage.userSelectCheckOutDate(givenOutDate);
	}
	
	@And("^User selects one in the number of rooms drop down$")
	public void UserSelectsNumOfRooms() {
		showDealsPage.selectNumOfRooms();
	}
	
	@And("^User selects two in the number of adults drop down$")  
	public void userSelectsNumOfAdults() {
		showDealsPage.selectNumOfAdults();
	}
	
	@And("^User selects one in the number of children drop down$")
	public void userSelectNumOfChildren() {
		showDealsPage.selectNumOfChildren();
	}
	@And("^User selects three in age of children drop down$")
	public void userSelectsAgeOfChildren() throws InterruptedException {
		showDealsPage.selectAgeOfChildren();
	}
	
	@And("^User clicks on show deals button$") 
	public void userClicksOnShowDealsButton() {
		showDealsPage.clickOnShowDealsButton();
	}
	
	@And("^User clicks on change search button on the show deals page$")
	public void userClicksOnChangeSearchButton() {
		showDealsPage.clickOnChangeSearch();
	}
	
	@And("^User selects new (.+) check-in date$")
	public void selectNewCheckInDate(String newDate1) throws InterruptedException {
		showDealsPage.newCheckInDate(newDate1);
	}
	
	@And("^User selects new (.+) check-out date$")
	public void selectNewCheckOutDate(String newDate2) {
		showDealsPage.newCheckOutDate(newDate2);
	}
	
	@And("^User changes selection in number of rooms to two$")
	public void userChangeNumOfRooms() throws InterruptedException {
		showDealsPage.changeNumOfRooms();
	}
	
	@And("^User changes selection in number of adults to two in the first room$")
	public void userChangesNumOfAdults() {
		showDealsPage.changeNumOfAdults();
	}
	
	@And("^User changes selection in number of children to one in the first room$")
	public void userChangesNumOfChildren() {
		showDealsPage.changeNumOfChildren();
	}
	@And("^User changes selection in age of first children to two$")
	public void userChangesAgeOfChild1() throws InterruptedException {
		showDealsPage.changeAgeOfChildOne();
	}
	@And("^User changes number of adults in the second room to one$")
	public void numOfAdultsInSecondRoom() {
		showDealsPage.adultsInRoomTwo();
	}
	@And("^User adds one child in room two$")
	public void childInRoomTwo() throws InterruptedException {
		showDealsPage.numOfChildInRoomTwo();
	}
	
	@And("^User adds age of child in the second room as one$")
	public void ageOfChildInSecondRoom() {
		showDealsPage.changeAgeOfChild2();
	}
	
	
	@And("^User clicks on search button$")
	public void userClicksOnSearchButton() {
		showDealsPage.clickOnSearchButton();
	}
	
	@Then("^The changes in details are displayed$")
    public void verifyChangeDetails() {
		String newDetails = "Sun 27 - Tue 29 August 2017, 2 nights, 2 rooms, 3 adults, 2 children";
		Assert.assertEquals(showDealsPage.verifyNewDetails(), newDetails);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
