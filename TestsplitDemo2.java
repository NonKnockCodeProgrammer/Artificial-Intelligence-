package demo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestsplitDemo2 {
	public static void main(String[] args) {
		String str = "ssy199505@gmail.com";
		String pat = "[a-zA-Z_][a-zA-Z_0-9\\.]*@[a-zA-Z_0-9\\.]+\\.(com|cn|net)";
		
		Pattern p = Pattern.compile(pat);
		//boolean m = p.matcher(str).matches();
		if(p.matcher(str).matches()){
			System.out.println("���Ϲ���");
		}else{
			System.out.println("�����Ϲ���");
		}
	}
}
