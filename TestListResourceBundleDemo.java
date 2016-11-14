package demo3;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestListResourceBundleDemo {
	public static void main(String[] args) {
		Locale zhloc = new Locale("zh","CN");
		
		ResourceBundle rbzh = ResourceBundle.getBundle("demo3.message_zh_CN", zhloc);
		
		String string = rbzh.getString("info");
		
		System.out.println("中文: "+MessageFormat.format(string, "李兴华"));
		
	}
}
