import java.io.*;


public class TestInputDemo {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream(new File("G:\\"+"text3.txt")));
		InputStream input = System.in;
		byte b[] = new byte[1024];
		int len = input.read(b);
		
		System.out.println("输入的内容为 "+new String(b,0,len));
		input.close();
		
		
	}
}
