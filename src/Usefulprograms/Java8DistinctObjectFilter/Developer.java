package Usefulprograms.Java8DistinctObjectFilter;

public class Developer {
	
	int age;
	
	String name;
	
	public Developer(int age,String namer) {
		this.age=age;
		this.name=namer;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Developer [age=" + age + ", name=" + name + "]";
	}


}
