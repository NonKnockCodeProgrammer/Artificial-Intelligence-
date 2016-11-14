package demo4;

import java.math.BigInteger;

public class TestdddDemo {
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("200");
		BigInteger bi1 = new BigInteger("3");
		
		
		BigInteger[] arr=bi.divideAndRemainder(bi1);
		System.out.println("商是: "+arr[0]+" 余数是: "+arr[1]);
		
	}
}
