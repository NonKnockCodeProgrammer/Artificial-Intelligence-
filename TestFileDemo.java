import java.io.File;

	
public class TestFileDemo {
	public static void main(String[] args) {
		File f = new File("e:"+File.separator+"Administrator");
		String[] str = f.list();
		for( int i = 0 ; i < str.length ; i++ ){
			System.out.println(str[i]);
		}
	}
}
