package demo3;

import java.text.DateFormat;
import java.util.Date;

public class TestDateDemo {
	public static void main(String[] args) {
		DateFormat df1 = null;
		DateFormat df2 = null;
		df1=DateFormat.getDateInstance();
		df2=DateFormat.getDateTimeInstance();
		
		
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
		
	}
}
