package example;

public class Person {
	private String name;
	
	//생성자
	public Person() {
		System.out.println("Person의 생성자입니다.");
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
