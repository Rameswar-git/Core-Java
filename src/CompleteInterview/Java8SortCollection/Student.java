package CompleteInterview.Java8SortCollection;

public class Student   {
	
	Student(int age,String namer){
		this.age=age;
		this.name=namer;
	}
	
	private int age;
	
	private String name;

//	@Override
//	public int compareTo(Student st){  
//		if(age==st.age)  
//		return 0;  
//		else if(age>st.age)  
//		return 1;  
//		else  
//		return -1;  
//		}  
		
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
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
