package stepDef;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.HomeLoanPage;

public class homeLoanStep extends Setup {

   HomeLoanPage loan = new HomeLoanPage(driver);

    @Given("I am at East West Bank Homepage")
    public void iAmAtEastWestBankHomepage() {
     String exp = "Personal and Commercial Banking, Home Loans, Wealth Strategies | East West Bank";
     String act = driver.getTitle();
     System.out.println(act);
     System.out.println("Title is matching with Exp");
     Assert.assertEquals(act, exp);
    }

    @When("I click on HomeLoan Button")
    public void iClickOnHomeLoanButton() {
        loan.clickHomeLoanLink();
    }

    @Then("I should land on home-mortgage-loan page")
    public void iShouldLandOnHomeMortgageLoanPage() {

     System.out.println("I land on home-mortgage-loan page");
    }

    @Then("I should be able to click on Apply Online on equity-line-of-credit box")
    public void iShouldBeAbleToClickOnApplyOnlineOnEquityLineOfCreditBox() {
     loan.clickApplyOnlineLink();
    }

    @Then("I should land on Mortgage page")
    public void iShouldLandOnMortgagePage() {
     System.out.println("I land on Mortgage page");
    }

    @Then("I should be able to click on Equity-line-of-credit button")
    public void iShouldBeAbleToClickOnEquityLineOfCreditButton() {
     loan.clickEquityLineOfCredit();
    }

    @Then("I should be able to enter Zipcode")
    public void iShouldBeAbleToEnterZipcode() {
     loan.enterZipCode();
     loan.clickSubmitButton();
    }

    @Then("I am at sign-up page")
    public void iAmAtSignUpPage() {
     System.out.println("SignUp Page");
    }
}
