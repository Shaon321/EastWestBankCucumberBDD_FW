package pageObject;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeLoanPage extends Setup {

    public HomeLoanPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }


    @FindBy (how = How.CLASS_NAME, using = "product-icon-home-loan")
    public WebElement HomeLoanLink;

    public void clickHomeLoanLink(){
        HomeLoanLink.click();
    }

   // driver.findElement(By.linkText("Web Table")).click();
    @FindBy(how = How.LINK_TEXT, using = "Apply Online")
    public WebElement ApplyOnlineLink;

    public void clickApplyOnlineLink(){
        ApplyOnlineLink.click();
    }

    @FindBy(how = How.CLASS_NAME, using = "cta-box-text")
    public WebElement EquityCredit;

    public void clickEquityLineOfCredit(){
        EquityCredit.click();
    }

    @FindBy(how = How.ID, using = "zipField")
    public WebElement ZipCode;

    public void enterZipCode(){
        ZipCode.sendKeys("90703");
    }

    @FindBy(how = How.LINK_TEXT, using = "Submit")
    public WebElement SubmitButton;

    public void clickSubmitButton() {
        SubmitButton.click();
    }
}
