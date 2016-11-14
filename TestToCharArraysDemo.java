package demo5;

public class TestToCharArraysDemo {
	public static void main(String[] args) {
		String str = "123456789";
		char c[] = str.toCharArray();
		boolean flag = true;
		for( int i = 0 ; i < c.length ; i++ ){
			if(c[i]<'0' || c[i]>'9'){
				flag = false;
				break;
			}			
		}
		if(flag){
			System.out.println("是数字");
		}else{
			System.out.println(" 不是数字");
		}
	}
}
