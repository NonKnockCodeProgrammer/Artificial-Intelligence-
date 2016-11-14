package demo3;

import java.util.ResourceBundle;

public class TestResourceBundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("message_fr_FR");
		System.out.println("ÄÚÈÝ: "+rb.getString("info"));
	}
}
