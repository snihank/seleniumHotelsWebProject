package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.FaqRewards;



public class FaqRewardsSD {
	
	FaqRewards faqRewards = new FaqRewards();
	
	
	
    @When("^User clicks on the collect 10 nights and get 1 night free tile$")
    public void iClickOnOfferLink() {
    	faqRewards.clickOnOfferLink();
    }
    
	
	@And("^User scrolls down on the next page to got a question section$")
	public void iScrollDown() {
		faqRewards.scrollDown();
	}
	
	@And("^User clicks on How do I collect nights question$")
	public void iClickOnHowDoICollectNights() {
		faqRewards.questionsOnCollectNights();
	}
	
	@Then("^User should be able to see the answer of the question under Collect Hotels.com® Rewards nights section and verify the first paragraph of the answer.$")
	public void iVerifyFirstParaOfAnswers() {
		Assert.assertEquals(faqRewards.verifyAnswerOfQuestion(), "How it works");
	}


}
