package demo3;

public class systemDemo {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for( int i = 0 ; i < 1010000 ; i++ ){
			System.out.println(i);
		}
		long endTime = System.currentTimeMillis();
		long num=endTime-startTime;
		System.out.println(num);
		System.out.println((num/1000)+"Ãë");
	}
}	
