package util;

import pages.HomePage;
import pages.myInfo;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static myInfo mi;

	public static void initializer() {
		
		hp = new HomePage();
		mi = new myInfo();
	}
	
	
	
}
