package testing;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class PIMTest extends CommonMethods {

	@Test(enabled = true, groups = {"all", "pim1"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void Addemployee() throws InterruptedException {
		doLogin();
		click(pp.PIMButton);
		click(pp.addEmployee);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("PIMaddemployee"));
		sendText(pp.firstName, Config.getUserData("fname"));
		sendText(pp.middleName, Config.getUserData("mname"));
		sendText(pp.lastName, Config.getUserData("lname"));
		click(pp.saveButton);
	}

	@Test(enabled = true, groups = {"all", "pim2"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void Assignlocation() throws InterruptedException {

		doLogin();
		click(pp.PIMButton);
		click(pp.employeeList);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("PIMpages"));
		click(pp.editButton);
		click(pp.contactdetails);
		click(pp.country);
		click(pp.albanianOption);
		click(pp.saveButtonEdit);
	}

	@Test(enabled = true, groups = {"all", "pim3"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void Deleteemployee() throws InterruptedException {

		doLogin();
		click(pp.PIMButton);
		click(pp.employeeList);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("PIMpages"));
		click(pp.deleteButton);
		click(pp.yesDeleteButton);
		click(pp.PIMButton);
		click(pp.employeeList);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("PIMpages"));
		click(pp.EmNameBox);
		sendText(pp.EmNameBox2, Config.getUserData("fname"));
		click(pp.searchButton);
		displayedAssertion(pp.notfoundpage);
	}

}
