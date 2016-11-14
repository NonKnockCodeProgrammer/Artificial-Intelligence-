package OutputStreamDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class TestByteArrays_In_OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		String str = "HELLOWORLD";
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		bis = new ByteArrayInputStream(str.getBytes());
		bos = new ByteArrayOutputStream();
		
		int temp = 0;
		while((temp=bis.read()) != -1){
			char  c = (char) temp;
			bos.write(Character.toLowerCase(c));
		}
		String newStr = bos.toString();
		bis.close();
		bos.close();
		System.out.println(newStr);
	}
}






//String str = "lllllllll";
//ByteArrayInputStream bis = null;
//ByteArrayOutputStream bos = null;
//bis = new ByteArrayInputStream(str.getBytes());	
//bos = new ByteArrayOutputStream();
//
//int temp = 0;
//
//while((temp=bis.read())!=1){
//	char c = (char) temp;
//	bos.write(Character.toLowerCase(c));
//}
//
//bis.close();
//bos.close();
//
//String str2=bos.toString();
//System.out.println(str2);