package OutputStreamDemo;

import java.util.Calendar;

public class TestCalendarDemo {
	public static void main(String[] args) {
		Calendar c1 = null;
		c1 = Calendar.getInstance();
		System.out.println(c1.get(c1.YEAR)+"��"+c1.get(c1.MONTH)+"��"+(c1.get(c1.DAY_OF_MONTH)+1)+"��"+
		c1.get(c1.HOUR)+"ʱ"+c1.get(c1.MINUTE)+"��"+c1.get(c1.SECOND )+"��");
		c1.add(c1.DAY_OF_YEAR, 230);
		
		System.out.println(c1.get(c1.YEAR)+"��"+c1.get(c1.MONTH)+"��"+(c1.get(c1.DAY_OF_MONTH)+1)+"��"+
				c1.get(c1.HOUR)+"ʱ"+c1.get(c1.MINUTE)+"��"+c1.get(c1.SECOND )+"��");
	}
}
