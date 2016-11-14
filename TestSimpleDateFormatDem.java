package OutputStreamDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormatDem {
	public static void main(String[] args) throws Throwable {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		
		Date d = sdf1.parse("2008-5-12 15-12-33");
		System.out.println(sdf2.format(d));
	}
}
