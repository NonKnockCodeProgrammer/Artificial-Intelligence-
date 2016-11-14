package demo3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSystemDemo2 {
	public static void main(String[] args) {
		String strDate = "2016-11-7 21:46:35:99";//定义时间日期字符串 
		String pat1 = "yyyy-MM-dd HH:mm:ss:sss";
		String pat2 = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d =null;
		DateFormat f = null;
		f.getTimeInstance();
		
		try {
			d=sdf1.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sdf1.format(d));
		System.out.println(f.getTimeInstance().format(d));
		
	}
}
