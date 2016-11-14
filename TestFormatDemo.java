package demo3;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestFormatDemo {
	public static void main(String[] args) {
		Locale zhloc = new Locale("zh","CN");
		Locale frloc = new Locale("fr","FR");
		Locale enloc = new Locale("en", "US");
		
		ResourceBundle rbzh = ResourceBundle.getBundle("message", zhloc);
		ResourceBundle rbfr = ResourceBundle.getBundle("message", frloc);
		ResourceBundle rben = ResourceBundle.getBundle("message", enloc);
		
		String str1 = rbzh.getString("info1");
		String str2 = rbfr.getString("info");
		String str3 = rben.getString("info");
		
		
		System.out.println("中文: "+MessageFormat.format(str1,"李兴华"));
		System.out.println("法语: "+MessageFormat.format(str2, "LiXingHua"));
		System.out.println("英语: "+MessageFormat.format(str3, "LiXingHua"));
	}
}
