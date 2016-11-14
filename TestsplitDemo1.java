package demo5;

import java.util.Random;

public class TestsplitDemo1 {
	public static void main(String[] args) {
		double r;
		int count = 0;
		int count1 = 0;
		Random ran = new Random();
		
		for(int i=1;i<1001;i++){
			r=ran.nextInt(2);
			if(r==1){
				 count++;
			}else{
				count1++;
			}
		}
		System.out.println("count= "+count);
		System.out.println("count1= "+count1);
	}
}
