package demo4;

import java.math.BigDecimal;

import demo3.systemDemo;

class MyMath{
	public static double add(double d1,double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.add(b2).doubleValue();
		
	}
	
	public static double round(double d,int len){
		BigDecimal b1 = new BigDecimal(d);
		BigDecimal b2 = new BigDecimal(len);
		return b1.divide(b2,len, BigDecimal.ROUND_HALF_UP).doubleValue();
		
	}
}

public class TestMyMathDemo {
	public static void main(String[] args) {
		System.out.println(MyMath.round(MyMath.add(10.345, 3.333),3));
		
	}
}
