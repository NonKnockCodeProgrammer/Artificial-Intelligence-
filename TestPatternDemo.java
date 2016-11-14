package demo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternDemo {
	public static void main(String[] args) {
		String str = "123A4567B	890";
		String pat = "\\d+";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		
		if(p.compile(pat).matcher(str).matches()){
			System.out.println("是由数字组成");
		}else{
			System.out.println("不是有数字组成");
		}
	}
}
