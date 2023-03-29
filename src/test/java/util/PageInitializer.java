package util;

import pages.HomePage;
import pages.LoginPage;
import pages.OrdersPage;

public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static OrdersPage op;
	public static LoginPage lp;

	public static void initializer() {
		
		hp = new HomePage();
		op = new OrdersPage();
		lp = new LoginPage();
	}
	
	
	
}
