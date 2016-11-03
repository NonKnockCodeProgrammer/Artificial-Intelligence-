package test2;

interface Pet {
	public String getName();

	public String getColor();

	public int getAge();
}

class Cat implements Pet {
	private String name;
	private String color;
	private int age;



	public Cat() {
		super();
	}

	public Cat(String name, String color, int age) {
		setName(name);
		setColor(color);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Dog implements Pet {
	private String name;
	private String color;
	private int age;

	public Dog() {
	}

	public Dog(String name, String color, int age) {
		setName(name);
		setColor(color);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class PetShop {
	private Pet[] pets;
	private int foot;
	
	
	public PetShop(int len) {
		if (len > 0) {
			pets = new Pet[len];
		} else {
			this.pets = new Pet[1];
		}
	}

	public boolean add(Pet pet) {
		if (this.foot < this.pets.length) {
			this.pets[this.foot] = pet;
			this.foot++;
			return true;
		} else {
			return false;
		}
	}

	public Pet[] search(String keyWord) {
		Pet p[] = null;
		int count = 0;
		for (int i = 0; i < this.pets.length; i++) {
			if (this.pets[i] != null) {
				if (this.pets[i].getName().indexOf(keyWord) != -1|| this.pets[i].getColor().indexOf(keyWord) != -1) {
					count++;
				}
			}
		}
		p = new Pet[count];
		int f = 0;
		for (int i = 0; i < this.pets.length; i++) {

			if (this.pets[i] != null) {
				if (this.pets[i].getName().indexOf(keyWord) != -1
						|| this.pets[i].getColor().indexOf(keyWord) != -1) {
					p[f] = this.pets[i];
					f++;
				}
			}

		}
		return p;
	}
}

public class PetShopDemo {
	public static void main(String args[]){
		PetShop ps = new PetShop(6);
		 Cat c1 = new Cat("黄猫","白色的",2);
		 Cat c2 = new Cat("黑猫","黑色的",3);
		 Cat c3 = new Cat("花猫","子色的",3);
		 Dog c4 = new Dog("拉布拉多","黄色的",3);
		 Dog c5 = new Dog("金毛","金色的",3);
		 Dog c6 = new Dog("黄狗","黄色的",3);
		 
		 
		 
		ps.add(c1);
		ps.add(c2);
		ps.add(c3);
		ps.add(c4);
		ps.add(c5);
		ps.add(c6);  
		Pet[] a =ps.search("黄");
		print(a);
		
}

	private static void print(Pet  p[]) {
		for( int i = 0 ; i < p.length ; i++ ){
			if(p[i] != null){
				System.out.println(p[i].getName()+"-"+p[i].getColor()+"-"+p[i].getAge()+"  "+p.length);
			}
		}
		
	}

}






















