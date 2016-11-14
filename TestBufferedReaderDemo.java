import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TestBufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.println("«Î ‰»Îƒ⁄»›");
		str = buf.readLine();
		System.setOut(new PrintStream(new FileOutputStream(new File("G:\\"
				+ "text5.txt"))));
		System.out.println(str);

	}
}
