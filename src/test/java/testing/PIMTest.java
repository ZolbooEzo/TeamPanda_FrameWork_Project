package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PIMTest extends CommonMethods {
	
	@Test
	public void Addemployee() throws InterruptedException {
		
		pp.PIMButton.click();
		pp.addEmployee.click();
		pp.firstName.sendKeys(Config.getUserData("fname"));
		pp.middleName.sendKeys(Config.getUserData("mname"));
		pp.lastName.sendKeys(Config.getUserData("lname"));
		pp.saveButton.click();
					
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMpage"));
	
		
		Thread.sleep(3000);
		
		
	}
		
		
		@Test
		public void Assignlocation() throws InterruptedException {
			
			pp.PIMButton.click();
			pp.employeeList.click();
			pp.editButton.click();
			pp.contactdetails.click();
			pp.country.click();
			
			WebElement selectElement; 
			selectElement= driver.findElement(By.id("Algeria"));			
			
			pp.saveButton.click();
			
				
			Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMemployeelist"));
		
			
			Thread.sleep(3000);
		}
		
			
			
			
			
			
			
			
			@Test
			public void Deleteemployee () throws InterruptedException {
				
				pp.PIMButton.click();
				pp.employeeList.click();
				pp.deleteButton.click();				
				pp.yesDeleteButton.click();
						
				pp.leave.click();
				pp.employeeNameBox1.sendKeys(Config.getUserData("fname"));				
				pp.searchButton.click();
				
				pp.time.click();
				pp.employeeNameBox2.sendKeys(Config.getUserData("fname"));
				pp.viewButton.click();
				
				pp.recuitmentButton.click();
				pp.keyword.sendKeys(Config.getUserData("fname"));
				pp.searchButton.click();
				
					
				Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("PIMemployeelist"));
			
				
				Thread.sleep(3000);
				
	}

}



