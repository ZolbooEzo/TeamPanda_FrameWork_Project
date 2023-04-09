package util;


import pages.HomePage;
import pages.PIMpage;



public class PageInitializer extends BaseClass{

	public static HomePage hp;
	public static PIMpage pp;
	
	

	public static void initializer() {
		
		hp = new HomePage();	
		pp = new PIMpage();
		
	
	}
	
	
	
}
