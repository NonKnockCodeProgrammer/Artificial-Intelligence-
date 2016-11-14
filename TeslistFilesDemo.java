import java.io.File;


public class TeslistFilesDemo {
	public static void main(String[] args) {
		File file = new File("C:"+File.separator);
		print(file);
	}
	public static void print(File file){
		if(file !=null){
		if(file.isDirectory()){
			File[] f = file.listFiles();
			if(f!=null){
				for( int i = 0 ; i < f.length ; i++ ){
					print(f[i]);
				}
			}
		}else{
			System.out.println(file);
		}
		}
	}
}
