package demo5;

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private float score;

	public Student(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public String toString(){
		return this.name+"\t"+this.age+"\t"+this.score;
	}

	@Override
	public int compareTo(Student stu) {

		if (this.score > stu.score) {
			return -1;
		} else if (this.score < stu.score) {
			return 1;
		} else {
			if (this.age > stu.age) {
				return 1;
			} else if (this.age < stu.age) {
				return -1;
			} else {
				return 0;
			}
		}

	}

}

public class TestCompareToDemo {
	public static void main(String[] args) {
		Student[] stu = {new Student("赵一",20,55f),new Student("王二",21,98f),
				new Student("陈三",22,78f),new Student("李四",19,100f)};
		java.util.Arrays.sort(stu);
		for( int i = 0 ; i < stu.length ; i++ ){
			System.out.println(stu[i]);
		}
	}
}
