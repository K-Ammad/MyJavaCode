public class Student
{
	private String studentName;
	private int studentId;
	private double mark;

//Constructor

public Student (String pStudentName , int pStudentId , double pMark)
{
	boolean isValid = true;

	if(isValidStudentName(pStudentName))
	{	
		studentName = pStudentName;
	}
	else
	{
		System.out.println("Invalid Name. Name cannot be empty");
		isValid = false;
	}

	if(isValidStudentId(pStudentId))
	{
		studentId = pStudentId;
	}
	else
	{
		System.out.println("Invalid Student ID");
		isValid = false;
	}

	if(isValidMark(pMark))
	{
		mark = pMark;
	}
	else
	{
		System.out.println("Invalid Marks");
		isValid = false;
	}

	if(!isValid)
	{
		studentName = null;
		studentId = 0;
		mark = 0.0;
	}
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
		System.out.println("Invalid StudentId");
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

public String getGrade(double pMark)	//getGrade Method
{ 
	if (pMark >= 0 && pMark <= 49.9)
		{
		       	return "F";
		}

	else if (pMark >= 50.0 && pMark <= 59.9)
		{
		       	return "P";
		}

 	else if (pMark >= 60.0 && pMark <= 69.9)
		{
		       	return "C";
		}

	else if (pMark >= 70.0 && pMark <= 79.9)
		{
		       	return "D";
		}

	else if (pMark >= 80.0 && pMark <= 100.0)
		{
		       	return "HD";
		}
	else
		{
			return "Invalid Marks";
		}
}


public boolean isValidStudentName(String pStudentName)  // isValidStudentName method
{
    	return pStudentName != null && !pStudentName.isEmpty();
}

public boolean isValidStudentId(int pStudentId) //isValidStudentId method
{
	return pStudentId >=10000000 && pStudentId <=99999999;
}

public boolean isValidMark(double pMark)   // isValidMark method
{
	return pMark >=0.0 && pMark <= 100.0;
}

public String toStringFile()
{
	return studentName + "," + studentId + "," + mark;
}


public static void main (String[] args)
	{

	Student s1 = new Student("Alice" , 12450000, 78.5);
	System.out.println("Student Name: "+ s1.getStudentName());
	System.out.println("Student ID: "  + s1.getStudentId());
	System.out.println("marks: " + s1.getMark()+ " " +"Grade: "+s1.getGrade(s1.getMark()));
	System.out.println(s1.toStringFile() + "\n");

	
	Student s2 = new Student("Robby",19402489 ,90.5 );
	System.out.println("Student Name: "+ s2.getStudentName());
	System.out.println("Student ID: "  + s2.getStudentId());
	System.out.println("marks: "+s2.getMark()+ " " + "Grade: "+ s2.getGrade(s2.getMark()));
	System.out.println(s2.toStringFile() + "\n");
	
	s2.setStudentName("Chase");
	s2.setStudentId(17389256);
	s2.setMark(55);
	
	System.out.println("Student Name: "+ s2.getStudentName());
	System.out.println("Student ID: "  + s2.getStudentId());
	System.out.println("marks: "+s2.getMark()+ " " + "Grade: "+ s2.getGrade(s2.getMark()));
	System.out.println(s2.toStringFile() + "\n");
	}

}	








