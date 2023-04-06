package util;

import pages.MyInfoPage;
import pages.HomePage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static MyInfoPage mip;

	public static void initializer() {
		
		hp = new HomePage();
		mip = new MyInfoPage();
	}
	
	
	
}
