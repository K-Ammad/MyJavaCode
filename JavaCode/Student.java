public class Student
{
	private String studentName;
	private int studentId;
	private double mark;
}

public boolean isValidStudentName(String pStudentName)  // isValidStudentName method
{
    	return pStudentName != null &&  pStudentName != "";
}


public boolean isValidStudentId(int pStudentId) //isValidStudentId method
{
	return pStudentId >=10000000 && <=99999999;
}

public boolean isValidMark(double pMark)   // isValidMark method
{
	return pMark >=0.0 && <= 100.0;
}

//Getters

public String getStudentName()
{return studentName;}

public int getStudentId()
{return studentId;}

public double getMark()
{return mark;}



//Setters

public void setStudentName(String pStudentName)
{
 	 if(isValidStudentName(pStudentName))
	{
		studentName = pStudentName;
	}
	else
	{
	  	System.out.println("Student name can not be empty");
		
	}
}

public void setStudentId(int pStudentId)
{
	if(isValidStudentId(pStudentId))
	{
		studentId = pStudentId;
	}
	else
	{
		system.out.println("Invalid StudentId");
	}
}

public void setMark(double pMark)
{
	if(isValidMark(pMark))

	{mark = pMark;}

	else 
	{
		System.out.println("Invalid Mark");
	}	
}

//Constructor

public Student (String pStudentName , int pStudentId , double pMark)
{
	if(isValidStudentName(pStudentName))
	{	
		studentName = pStudentName;
	}
	else
	{
		System.out.println("Invalid Name. Name cannot be empty")
	}

	if(isValidStudentId(pStudentId))
	{
		studentId = pStudentId;
	}
	else
	{
		System.out.printlm("Invalid Student ID");
	}

	if(isValidMark(pMark))
	{
		mark = pMark;
	}
	else
	{
		System.out.println("Invalid Marks")
	}
}

public static void main (String[] args)
{
	Student s1 = new Student("Alice" , 1234567, 78.5);
	System.out.println("Student Name: "+ s1.getStudentName() + 
			  "Student ID: " + s1.getStudentId() + "Marks: " + s1.getMark());

	Student s2 = new Student("", 251, -10);
	System.out.println("Student Name: "+ s2.getStudentName() + 
			  "Student ID: " + s2.getStudentId() + "Marks: " + s2.getMark());

	s2.setStudentName("Bob");
	s2.setStudentId(99999993);
	s2.setMark(23);

	System.out.println("Student Name: "+ s2.getStudentName() + 
			  "Student ID: " + s2.getStudentId() + "Marks: " + s2.getMark());
	
}
	








