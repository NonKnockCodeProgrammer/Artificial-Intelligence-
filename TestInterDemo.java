package demo3;

public class TestInterDemo {
	public static void main(String[] args) {
		fun("ssss");
		fun("gjhkh");
		for( int i = 0 ; i < 101 ; i++ ){
			fun(i++);
		}
	}
	
	public static void fun(Object...args){
		for( int i = 0 ; i < args.length ; i++ ){
			System.out.println(args[i]+" ");
		}
	}
}
