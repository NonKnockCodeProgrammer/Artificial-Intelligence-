import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class TestPrintDemo1 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("G:\\"+"text1.txt")));
		
		String  name  = "llll";
		int age = 20;
		char sex = 'c';
		float f = 92.02f;
		ps.printf("����: %s;����: %d;�Ա�: %c;�ɼ�: %f",name,age,sex,f);
		ps.close();
		
	}
}
