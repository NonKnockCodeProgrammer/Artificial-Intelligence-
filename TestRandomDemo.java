package demo4;

import java.util.Random;

public class TestRandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		for( int i = 0 ; i < 7 ; i++ ){
			System.out.println(r.nextInt(36));
		}
	}
}
