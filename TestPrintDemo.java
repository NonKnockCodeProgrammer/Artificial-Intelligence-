import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;


public class TestPrintDemo {
	public static void main(String[] args) throws IOException {
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("G:\\"+"text1.txt"))) ;
		ps.println(00000+"\n");
		ps.print("kkkkkkkkkk");
		ps.close();
	//ps = new PrintStream(new FileInputStream(new File("G:\\"+"text1.txt")))£»
	}
}
