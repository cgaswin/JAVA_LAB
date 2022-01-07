public class Test{

	public static void main(String args[])
	{

		Person p1 = new Person("Athithia","09-06-2001");
		System.out.println("Name : "+p1.getName());
		System.out.println("DOB : "+p1.getDob());
		p1.setName("Aswin");
		p1.setDob("29-05-2002");
		System.out.println("Name : "+p1.getName());
		System.out.println("DOB : "+p1.getDob());


		Teacher t1 = new Teacher ("Soni","07-07-1983","C",40000);
		System.out.println("Name : "+t1.getName());
		System.out.println("DOB : "+t1.getDob());
		System.out.println("Subject : "+t1.getSubject());
		System.out.println("Salary : "+t1.getSalary());
		t1.setSubject("Java");
		t1.setSalary(50000);
		System.out.println("Name : "+t1.getName());
		System.out.println("DOB : "+t1.getDob());
		System.out.println("Subject : "+t1.getSubject());
		System.out.println("Salary : "+t1.getSalary());


		Student s1 = new Student("Fenita","03-08-2001",001);
		System.out.println("Name : "+s1.getName());
		System.out.println("DOB : "+s1.getDob());
		System.out.println("Student ID : "+s1.getStudentId());
		s1.setStudentId(007);
		System.out.println("Name : "+s1.getName());
		System.out.println("DOB : "+s1.getDob());
		System.out.println("Student ID : "+s1.getStudentId());

		collegeStudent c1 = new collegeStudent("Ayush","14-01-2002",005,"GECTCR",2021);
		System.out.println("Name : "+c1.getName());
		System.out.println("DOB : "+c1.getDob());
		System.out.println("Student ID : "+c1.getStudentId());
		System.out.println("College Name : "+c1.getCollegeName());
		System.out.println("Year Of Study : "+c1.getYearOfStudy());
		c1.setCollegeName("GECSKP");
		c1.setYearOfStudy(2022);
		System.out.println("Name : "+c1.getName());
		System.out.println("DOB : "+c1.getDob());
		System.out.println("Student ID : "+c1.getStudentId());
		System.out.println("College Name : "+c1.getCollegeName());
		System.out.println("Year Of Study : "+c1.getYearOfStudy());

		}


	}
