package exam;

public class Person {
	private int age;
	private String name;
	private String gender;
	private boolean isMarried;
	private int children;
	
	public Person() {}
	
	public Person(int age, String name, String gender, boolean isMarried, int children) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.isMarried = isMarried;
		this.children = children;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	
	public String Married(boolean b)
	{
		if(b)
		{
			return "기혼";
		}else return "미혼";
	}

	public void print()
	{
		System.out.println("이 사람의 나이 : " +age);
		System.out.println("이 사람의 이름 : " +name);
		System.out.println("이 사람의 결혼여부 : " + Married(isMarried));
		System.out.println("이 사람의 자녀 수 : " +children);
	}
	
	
}
