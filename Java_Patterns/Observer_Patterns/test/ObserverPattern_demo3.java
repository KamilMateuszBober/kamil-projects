package test;

import observer.pattern.demo3.*;

public class ObserverPattern_demo3 {

	public static void main(String[] args) {
		
		System.out.println("Observer Pattern Demo3");
		
		Subject_News S_news = new Subject_News();
		Subject_PremiumService S_prem = new Subject_PremiumService();
		Subject_SomthingToDo_ForYou_Mod S_som = new Subject_SomthingToDo_ForYou_Mod();
		
		User_unregister U_unreg = new User_unregister();
		User_register U_reg1 = new User_register();
		User_register U_reg2 = new User_register();
		User_register U_reg3 = new User_register();
		User_premium U_prem1 = new User_premium();
		User_premium U_prem2 = new User_premium();
		User_Moderator U_mod = new User_Moderator();
		
		
		
		S_news.register(U_reg1);
		S_news.register(U_reg3);
		S_news.register(U_prem1);
		S_news.register(U_prem2);
		
		S_prem.register(U_prem1);
		S_prem.register(U_prem2);
		S_som.register(U_mod);
		
		
		S_news.setMyValue(" New shop center open");
		S_prem.setMyValue(" New offert for premium users");
		S_news.setMyValue("Bla bla bla");
		S_som.setMyValue(" @%~%&^@~ Spam");
		
		
		
		
	}

}
