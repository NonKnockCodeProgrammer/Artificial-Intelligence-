import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo0{
	public static void main(String[] args) {
		String str = "2016-11-10 12:40:59:360";
		String pat = "yyyy MM dd HH-mm-ss:SSS";
		SimpleDateFormat sdf  = new SimpleDateFormat(str);
		SimpleDateFormat sdf1  = new SimpleDateFormat(pat);
		
	
		
		System.out.println(sdf1.format(new Date()));
	}
}