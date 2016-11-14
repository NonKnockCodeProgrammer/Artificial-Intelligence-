package demo3;

public class TestInterDemo1 {
	public static void main(String[] args) {
		Object arg1[]={"fdjk","mdmg",565,5959,132};
		Object arg2[]={6661,"fdk",49466,"ge","gej"};
		fun(arg1);
		fun(arg2);
	}
	public static void fun(Object...args){
		for( int i = 0 ; i < args.length ; i++ ){
			System.out.print (" "+args[i]);
		}
		
	}
} 
