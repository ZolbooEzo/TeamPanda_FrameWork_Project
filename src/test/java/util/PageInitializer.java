package util;

import pages.DirectoryPage;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static DirectoryPage dp;

	public static void initializer() {
		dp = new DirectoryPage();
		hp = new HomePage();
	}
	
	
	
}
