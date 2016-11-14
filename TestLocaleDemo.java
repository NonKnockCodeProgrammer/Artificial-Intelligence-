package demo3;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocaleDemo {
	public static void main(String[] args) {
		Locale zhloc = new Locale("zh","CN");
		Locale frloc = new Locale("fr","FR");
		Locale enloc = new Locale("en","US");
		
		ResourceBundle zhrb = ResourceBundle.getBundle("message", zhloc);
		ResourceBundle frrb = ResourceBundle.getBundle("message", frloc);
		ResourceBundle enrb = ResourceBundle.getBundle("message", enloc);
		
		
		
		System.out.println("中文: "+zhrb.getString("info"));
		System.out.println("法文: "+frrb.getString("info"));
		System.out.println("英语: "+enrb.getString("info"));
		
	}
}
