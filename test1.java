package demo1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		int p[] = {2,3,4,5,6,9};
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		p[p.length-1]=num;
		System.out.println(p.length);
		
		for( int i = 0 ; i <p.length ; i++ ){
			System.out.print(p[i]+", ");
		}
		
		System.out.println(" \n");
		
		for( int i = 0 ; i <p.length-1 ; i++ ){
			int temp=0;
			if(p[p.length-1]<p[i]){
				temp=p[i];
				p[i]=p[p.length-1];
				p[p.length-1]=temp;
			}
			System.out.print(p[i]+", ");
		}
	}
}
