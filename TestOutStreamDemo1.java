
public class TestOutStreamDemo1 {
	public static void main(String[] args) {
		String  str = "lllll";
		try{
		System.out.println(Integer.parseInt(str));
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
