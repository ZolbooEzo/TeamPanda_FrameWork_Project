package util;

import pages.DashBoardPages;
import pages.HomePage;
import pages.PIMpage;
import testing.PIMTest;


public class PageInitializer extends BaseClass{

	public static HomePage hp;
	
	public static PIMTest pt;
	
	public static PIMpage pp;

	public static void initializer() {
		
		hp = new HomePage();
	
		pt = new PIMTest();
		pp = new PIMpage();
		
	
	}
	
	
	
}
