import java.io.File;

	
public class TestisDirectoryDemo {
	public static void main(String[] args) {
		File f = new File("C:"+File.separator+"Intel");
		if (f.isDirectory()) {
			System.out.println(f.getPath()+"是 目录");
		}else{
			System.out.println(f.getPath()+"  不是目录");
		}
	}
}
