package util;

import pages.DashBoardPages;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static DashBoardPages dbp;

	public static void initializer() {
		
		hp = new HomePage();
		dbp = new DashBoardPages();
	}
	
	
	
}
