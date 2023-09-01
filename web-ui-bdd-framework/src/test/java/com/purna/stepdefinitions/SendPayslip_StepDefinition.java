package com.purna.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.HRHomePage;
import com.purna.pages.ListPayslipPage;
import com.purna.pages.LoginPage;
import com.purna.pages.PayslipPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendPayslip_StepDefinition extends Utilities {
	
	private WebDriver driver;
	private TestContext testContext;
	LoginPage onLoginPage;
	HRHomePage onHRHomePage;
	PayslipPage onPayslipPage;
	ListPayslipPage onListPayslipPage;
	

	public SendPayslip_StepDefinition(TestContext context) {


		testContext = context;
		driver = testContext.getDriver();
		onLoginPage = new LoginPage(driver);
		onHRHomePage = new HRHomePage(driver);
		onPayslipPage = new PayslipPage(driver);
		onListPayslipPage = new ListPayslipPage(driver);
	}
	
	@When("user clicks on Download button")
	public void user_clicks_on_download_button() throws InterruptedException {
	
		onListPayslipPage.link_payslipDwnld.click();
		Thread.sleep(5000);
	}
	
	@Then("user should be able to download payslip")
	public void user_should_be_able_to_download_payslip() {

	    // Open the downloaded PDF file and verify its contents
	   // String filePath = "/home/username/file_name.pdf";
		//String filePath = "/Users/ADMIN/Downloads/013da3056497e3200ca91d34fb2984c1.pdf";
		//	System.out.println(filePath);
	    //C:\Users\ADMIN\Downloads\013da3056497e3200ca91d34fb2984c1
	  //  URL url = new URL("file:///" + filePath);
	   // PDDocument document = PDDocument.load(url);
	   // PDFTextStripper pdfStripper = new PDFTextStripper();
	   // String text = pdfStripper.getText(document);
	    //System.out.println(text);
	    // Verify the transaction data in the text string using regular expressions or other techniques
	    
	   // document.close();
	}

}
