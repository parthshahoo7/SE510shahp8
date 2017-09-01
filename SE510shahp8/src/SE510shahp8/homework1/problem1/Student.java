package SE510shahp8.homework1.problem1;

public class Student {

	private String name;
	private int id;
	private int age;
	
	public Student(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name + " " + id + " " +age;
	}
}
