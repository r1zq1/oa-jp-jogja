package id.ac.amikom.day02.shortsearch;

public class Human {
	private String name;
    private int age;
    public Human() {
    }
    public Human(String name, int age) {
        this.setName(name);
        this.setAge(age);
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
		return "Human [name=" + name + ", age=" + age + "]\n";
	}
	
}