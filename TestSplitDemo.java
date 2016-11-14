package demo5;

import demo3.systemDemo;

public class TestSplitDemo {
	public static void main(String[] args) {
		String str = "lhx:55|kkk:88|fkf:55";
		String arr[] = str.split("\\|");

		for( int i = 0 ; i < arr.length ; i++ ){
			
			String arr1[] = arr[i].split(":");
			System.out.println(arr1[0]+arr1[1]);
		}
	}
}
