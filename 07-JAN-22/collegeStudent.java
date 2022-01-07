public class collegeStudent extends Student{

	private String collegeName;
	private int yearOfStudy;

	//constructor
	public collegeStudent (String name,String dob,int StudentId,String collegeName, int yearOfStudy)
	{
		super(name,dob,StudentId);
		this.collegeName = collegeName;
		this.yearOfStudy = yearOfStudy;
	}

	//Getters and Setters

	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}

	public void setYearOfStudy(int yearOfStudy)
	{
		this.yearOfStudy = yearOfStudy;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

        public int getYearOfStudy()
	{
		return yearOfStudy;
	}







}
