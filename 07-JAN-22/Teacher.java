public class Teacher extends Person{

	private int salary;
	private String subject;

	//constructor
	public Teacher (String name,String dob,String subject,int salary)
	{
		super(name,dob);
		this.salary = salary;
		this.subject = subject;
	}

	//Getters and Setters

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public int getSalary()
	{
		return salary;
	}

	public String getSubject()
	{
		return subject;
	}



}
