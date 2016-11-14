import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class TestSytemSetoutDemo {
	public static void main(String[] args) {
		String str = "heloo";
		
		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			try{
				System.setOut(new PrintStream(new FileOutputStream(new File("G:\\"+"err.log"))));
			}catch(Exception e1){
				e1.printStackTrace();
			}
			System.out.println(e);
		}
	}
}
