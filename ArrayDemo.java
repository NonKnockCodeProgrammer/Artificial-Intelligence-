package test1;
class Array{
	private int temp[];
	private int  foot;
	public void Array(int len){
		if(len>0){
			this.temp = new int [len];
		}else{
			this.temp = new int[1];
		}
	}
	public boolean add(int i){
		if(this.foot<this.temp.length){
			this.temp[foot] = i;
			foot++;
			return true;
		}else{
			return false;
		}
	}
	public int [] getArray(){
		return this.temp;
	}
}

public class ArrayDemo {
	public static <ReverseArray> void main(String[] args) {
	ReverseArray a = null;
		System.out.println(((Array) a).add(23)+"\t ");
		System.out.println(((Array) a).add(21)+" \t");
		System.out.println(((Array) a).add(2)+" \t");
		System.out.println(((Array) a).add(23)+" \t");
		System.out.println(((Array) a).add(53)+" \t");
		System.out.println(((Array) a).add(63)+" \n");
		print(((Array) a).getArray());
	}
	public static void print(int i[]){
		for( int x = 0;x<i.length;x++ ){
			System.out.println(i[x]+" ¡¤");
		}
	}
}
