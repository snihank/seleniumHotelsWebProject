package framework;

///Scenario: Verify FAQs about hotel.com rewards

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import stepdefinition.SharedSD;

public class FaqRewards extends BasePage {

	// Locating "Collect 10 nights get 1 free" link
	private By offerLink = By.className("collect-text");

	// Locating "How do I collect nights" in "Got a question?" section
	private By QuestionsCollectNights = By.linkText("How do I collect nights?");

	// Locating "Collect Hotels.com Rewards nights
	private By AnswersCollectNights = By.xpath(".//*[@id='article-detail-12009']/h4[1]");

	// User clicks on the collect 10 nights and get 1 night free tile
	public void clickOnOfferLink() {
		clickOn(offerLink);
	}

	// User scrolls down on the next page to got a question section
	public void scrollDown() {
		JavascriptExecutor jsx = (JavascriptExecutor) SharedSD.getDriver();
		jsx.executeScript("window.scrollBy(0,950)");
	}

	// User clicks on How do I collect nights question
	public void questionsOnCollectNights() {
		clickOn(QuestionsCollectNights);
		windowHandler(1);
	}

	/*
	 * User should be able to see the answer of the question under Collect
	 * Hotels.com® Rewards nights section and verify the first paragraph of the
	 * answer.
	 */
	public String verifyAnswerOfQuestion() {
		return getTextFromElement(AnswersCollectNights);

	}

}
