package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Groups;

public class GroupsSD {
	
	Groups groups = new Groups();
	
@When("^I enter (.+) into Destination text input field$")
public void iEnterPlace (String place) throws InterruptedException {
	groups.enterPlace(place);
}

@And("^I click on Check-in Date input box$") 
public void iClickOnCheckIn() throws InterruptedException {
	groups.clickOnCheckIn();
	
}

@Then("^I verify that I cannot click on earlier dates than current date$") 
public void iVerifyEarlierCheckInDates() {
	groups.earlierCheckIn();
}

@And("^I select check-in input$")
public void putCheckInDate() {
	groups.selectCheckInDate();
}

@And("^I select check-out input$")
public void putCheckOutDate() {
	groups.selectCheckOutDate();
}



@And("^I choose Golf from the Group Type dropdown$")
public void iChooseGolf() {
	groups.selectGroup();
}

@And("^I enter (.+) in rooms per night input textfield$")
public void iSelectRooms(String roomsPerNight){
	groups.roomPerNight(roomsPerNight);
}
@And("^I click on ideal star rating and select 1-3 star$")
public void iSelectStarRating() throws InterruptedException {
	groups.setRating();
}
@And("^I set the ideal monthly budget$") 
public void iSetBudget(){
	
}
@And("^I enter (.+) into full name text input field$") 
public void iEnterName(){
	
}
@Then("^I enter (.+) into Email textfield$") 
public void iEnterEmail(){
	
}
@When("^I click on continue button$") 
public void iClickContinue() {
	
}
@And("^I verify that the box shows success message$") 
public void iVerifySuccess() {
	
}
@Then("^I click on who would you like to see offers box$")
public void iClickOnOfferBox() {
	
}
@When("^I select let me select the hotels to quote option$")
public void iSelectHotelsOption() {
	
}
@And("^I verify that room types dropdown displayed each room will be different by default$")  
public void iVerifyEachRoom() {
	
}
@Then("^I enter ‘(.+)’ into number text input field$") 
public void iEnterPhoneNumber(){
	
}

@And("^I click on continue$")
public void iClickOnContinuebutton(){
	
}

@Then("^I verify that a pop-up message appears containing my password hotels88311 and a link Next Pick the hotels you want to quote$")
public void iVerifyMessage() {
	
}
@And("^I click on the link$")
public void iClickOnLink(){
	
}
@Then("^I verify the new page displays my details containing link Sign Out and Return home$")
public void iVerifyMyDetails() {
	
}

}
