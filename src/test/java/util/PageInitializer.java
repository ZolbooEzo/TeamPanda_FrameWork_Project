package util;

import pages.MyInfoPage;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static MyInfoPage dp;

	public static void initializer() {
		
		hp = new HomePage();
		dp = new MyInfoPage();
	}
	
	
	
}
