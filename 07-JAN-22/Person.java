public class Person{

	private String name,dob;
	
	//constructor
	public Person(String name,String dob)
	{
		
		this.name = name;
		this.dob = dob;
	}
	
	// Getters and Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDob(String dob)
	{
		this.dob = dob;
	}

	public String getName()
	{
		return name;	
	}

	public String getDob()
	{
		return dob;	
	}

}
