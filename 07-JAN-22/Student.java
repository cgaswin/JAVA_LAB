public class Student extends Person{

	private int studentId;

	//constructor
	public Student(String name , String dob,int studentId)
	{
		super(name,dob);
		this.studentId = studentId;
	}

	//Getters and Setters

	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}

	public int getStudentId()
	{
		return studentId;
	}






}
