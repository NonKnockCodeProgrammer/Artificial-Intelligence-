package OutputStreamDemo;

import java.util.Calendar;

public class TestCalendarDemo {
	public static void main(String[] args) {
		Calendar c1 = null;
		c1 = Calendar.getInstance();
		System.out.println(c1.get(c1.YEAR)+"年"+c1.get(c1.MONTH)+"月"+(c1.get(c1.DAY_OF_MONTH)+1)+"天"+
		c1.get(c1.HOUR)+"时"+c1.get(c1.MINUTE)+"分"+c1.get(c1.SECOND )+"秒");
		c1.add(c1.DAY_OF_YEAR, 230);
		
		System.out.println(c1.get(c1.YEAR)+"年"+c1.get(c1.MONTH)+"月"+(c1.get(c1.DAY_OF_MONTH)+1)+"天"+
				c1.get(c1.HOUR)+"时"+c1.get(c1.MINUTE)+"分"+c1.get(c1.SECOND )+"秒");
	}
}
