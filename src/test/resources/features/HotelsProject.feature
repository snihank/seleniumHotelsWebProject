@regression
Feature: Hotels.com feature

Background:
    
Given I open the default browser and I am on hotel deals page
#Given I open the default browser and I am on Groups and Meetings page 
    
@regression-1     
Scenario: Verify guest ratings and amenities in GuestRatings

And User scrolls down to Great deals in popular destinations 
And User selects any deals from the given options
And User selects "08/25/17" check-in date in the pop-up window 
And User selects "08/30/17" check-out in the pop-up window
And User selects number of rooms to one
And User selects number of adults to two
And User selects number of children to one
And User selects age of children to one
And User clicks on continue button
And User clicks on guest rating from the sort by options on the hotels list page
And User scrolls down and selects Free Beakfast from amenities
And User selects Business from Themes
Then Verify that the first hotel option contains guest ratings score
And User clicks on First Hotel name
And Verify the first hotel option contains selected amenities and themes


@regression-2
Scenario: Verify user can change search on show deals page in ShowDealsPage

When User types "Boston" into destination text field 
And User selects destination from the drop down suggestions
And User clicks on "08/25/2017" check-in date
And User clicks on "08/30/2017" check-out date
And User selects one in the number of rooms drop down
And User selects two in the number of adults drop down
And User selects one in the number of children drop down
And User selects three in age of children drop down
And User clicks on show deals button
And User clicks on change search button on the show deals page
And User selects new "08/27/2017" check-in date 
And User selects new "08/29/2017" check-out date 
And User changes selection in number of rooms to two
And User changes selection in number of adults to two in the first room
And User changes selection in number of children to one in the first room
And User changes selection in age of first children to two
And User changes number of adults in the second room to one
And User adds one child in room two
And User adds age of child in the second room as one
And User clicks on search button
Then The changes in details are displayed

@regression-3
Scenario: Verify user can select number of rooms, adults and children age at check in before showing deals in CheckInPage

When User enters "New York" in Destination text field
And User selects first destination from the suggestions
And User selects "08/25/2017" Check-In date
And User selects "08/30/2017" Check-Out date
And User clicks on edit or add rooms button
And User selects more than 1 room
And User select the number of adults in each room
And User select the number of children in each room
And User select the age of children at check-in
And User clicks on show deals
Then User should be able to see deals of rooms for the given amount of adults and children below the name of the specified destination under the header of the page.

@regression-4
Scenario: Verify FAQs about hotel.com rewards

When User clicks on the collect 10 nights and get 1 night free tile
And User scrolls down on the next page to got a question section
And User clicks on How do I collect nights question
Then User should be able to see the answer of the question under Collect Hotels.com® Rewards nights section and verify the first paragraph of the answer.

@regression-5
Scenario: Verify user can find hotels with free airport shuttle near selected airports

When User enters "New York" in Destination, hotel, landmark, or address text field 
And User confirms check-in date
And User confirms check-out date
And User selects the number of rooms, adults, children
And User clicks on Show Deals
And User scrolls down to select any airports from Landmark drop down
And User clicks on Airport transfers under amenities drop down
And User scrolls up
And User clicks on hotel name on top of the list
Then User can find free airport shuttle in the main amenities section

#@regression-6
#Scenario:  Verify that user starts filling form input box and reaches log out page 
#
#  
# When I enter 'Sydney' into Destination text input field 
# And I click on Check-in Date input box
# Then I verify that I cannot click on earlier dates than current date 
# And I select check-in input
# And I select check-out input 
# And I choose Golf from the Group Type dropdown
# And I enter '9' in rooms per night input textfield 
# And I click on ideal star rating and select 1-3 star 
# And I set the ideal monthly budget
# And I enter ‘Shakib Nihan Karim’ into full name text input field 
# And I enter ‘shakibnihan786@gmail.com' into Email textfield 
# And I click on continue button
# Then I verify that the box shows success message 
# When I click on who would you like to see offers box
# And I select let me select the hotels to quote option
# Then I verify that room types dropdown displayed each room will be different by default 
# When I enter ‘3472792504’ into number text input field 
# And I click on continue 
# Then I verify that a pop-up message appears containing my password hotels88311 and a link Next Pick the hotels you want to quote 
# And I click on the link 
# Then I verify the new page displays my details containing link Sign Out and Return home
#



    
