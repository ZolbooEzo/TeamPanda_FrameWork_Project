package util;


import pages.DashBoardPages;
import pages.DirectoryPage;
import pages.MyInfoPage;
import pages.MyInfoPageDua;
import pages.PIMPage;
import pages.PerformancePage;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static DashBoardPages db;
	public static MyInfoPage mip;
	public static DirectoryPage dp;
	public static MyInfoPageDua mi;
	public static PIMPage pp;
	public static PerformancePage perp;

	public static void initializer() {
		hp = new HomePage();
		db = new DashBoardPages();
		mip = new MyInfoPage();
		dp = new DirectoryPage();
		mi = new MyInfoPageDua();
		pp = new PIMPage();
		perp = new PerformancePage();
	}
	
	
	
}
