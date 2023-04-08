package util;


import pages.DashBoardPages;
import pages.DirectoryPage;
import pages.MyInfoPage;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static DashBoardPages db;
	public static MyInfoPage mip;
	public static DirectoryPage dp;

	public static void initializer() {
		hp = new HomePage();
		db = new DashBoardPages();
		mip = new MyInfoPage();
		dp = new DirectoryPage();
	}
	
	
	
}
