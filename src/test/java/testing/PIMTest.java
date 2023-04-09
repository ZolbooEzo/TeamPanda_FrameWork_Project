package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;
import util.ListernersTestNG;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


@Listeners(ListernersTestNG.class)
public class PIMtest extends CommonMethods {
	public void displayedAssertion(WebElement notfound) {
		
		
	}
	//@Test (priority= 1, enabled= true, retryAnalyzer = RetryAnalyzerTest.class)
	public void Addemployee() throws InterruptedException {
		
		sendText(hp.userNameBox,Config.getUserData("username"));
		sendText(hp.passwordBox,Config.getUserData("userpassword"));
		click(hp.loginButton);
		
	
		
		click(pp.PIMButton);
		click(pp.addEmployee);
		Thread.sleep(1000);
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("PIMaddemployee"));
		
		
		sendText(pp.firstName,Config.getUserData("fname"));
		sendText(pp.middleName,Config.getUserData("mname"));
		sendText(pp.lastName,Config.getUserData("lname"));
		
		click(pp.saveButton);
				
					
		
			
		Thread.sleep(3000);
		
		
	}
		
		
	

		
	  //@Test (priority = 2 , enabled= true, retryAnalyzer = RetryAnalyzerTest.class)
		public void Assignlocation() throws InterruptedException {
		  
			sendText(hp.userNameBox,Config.getUserData("username"));
			sendText(hp.passwordBox,Config.getUserData("userpassword"));
			click(hp.loginButton);

			click(pp.PIMButton);
			click(pp.employeeList);	
			Thread.sleep(1000);
			Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMpages"));
			
			click(pp.editButton);
			Thread.sleep(1000);
			
			click(pp.contactdetails);
			Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("contactdetails"));
			Thread.sleep(2000);
			
			
			click(pp.country);
			Thread.sleep(2000);
					
			// it did not click on Afghanistan
			//click(pp.Afghanistan);
			//WebElement selectElement; 
			//selectElement= driver.findElement(By.id("Algeria"));			
						
			Thread.sleep(2000);
			click(pp.saveButton);
			
			
			Thread.sleep(3000);
		}
		
			
						
			//@Test (priority = 3 , enabled= true, retryAnalyzer = RetryAnalyzerTest.class)
			public void Deleteemployee () throws InterruptedException {
				
				sendText(hp.userNameBox,Config.getUserData("username"));
				sendText(hp.passwordBox,Config.getUserData("userpassword"));
				click(hp.loginButton);

				click(pp.PIMButton);
				click(pp.employeeList);	
				Thread.sleep(2000);
				Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMpages"));
								
				click(pp.deleteButton);				
				click(pp.yesDeleteButton);
				Thread.sleep(2000);
				
				click(pp.PIMButton);
				click(pp.employeeList);	
				Thread.sleep(2000);
				Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMpages"));
				Thread.sleep(2000);
				
				click(pp.EmNameBox);	
				sendText(pp.EmNameBox2,Config.getUserData("fname"));
				click(pp.searchButton);	
				
				
				displayedAssertion(pp.notfoundpage);
				System.out.println("No Records Found");
						

				
				Thread.sleep(3000);
			}



			
			}