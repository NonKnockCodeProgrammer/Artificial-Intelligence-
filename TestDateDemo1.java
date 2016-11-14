package demo3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class TestDateDemo1 {
	public static void main(String[] args) {
		DateFormat dft1 = null;
		DateFormat dft2 = null;
		dft1 = DateFormat.getDateTimeInstance(DateFormat.
				YEAR_FIELD,DateFormat.ERA_FIELD,
				new Locale("zh","CN"));
		dft2 = DateFormat.getDateInstance(DateFormat.
				YEAR_FIELD,new Locale("zh","CN"));
		
		System.out.println(dft1.format(new Date()));
		System.out.println(dft2.format(new Date()));
		System.out.println(" ");
	}
}
