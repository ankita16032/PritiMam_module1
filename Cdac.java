package module1;

public class Cdac {

	private String collegeName;
	private String studentName;
	private String location;
	private int studentId;
	private int collegeId;
	private int duration;
	
	public void candidatureInfo()
	{
		System.out.println("Enter all details regarding to you: ");
	}
	public void showResult()
	{
		System.out.println("Result as per student id: ");
	}
	public void showInTime()
	{
		System.out.println("Give your in time: ");
	}
	public void showOutTime()
	{
		System.out.println("Give your out time: ");
	}
	public void checkAttendance()
	{
		System.out.println("students attendance are : ");
	}
	public void display()
	{
		System.out.println("collegeName :"+collegeName);
		System.out.println("studentName : "+studentName);
		System.out.println("location: "+location);
		System.out.println("studentId: "+studentId);
		System.out.println("collegeId: "+collegeId);
		System.out.println("duration: "+duration);
		
	}
	
	public static void main(String[] args) {
		Cdac cdac=new Cdac();
		cdac.collegeName="Cdac Met-IIT Nashik";
		cdac.studentName="Ankita";
		cdac.location="Pune";
		cdac.studentId=1;
		cdac.collegeId=1234;
		cdac.duration=6;
		
		cdac.display();
		cdac.candidatureInfo();
		cdac.showResult();
		cdac.showInTime();
		cdac.showOutTime();
		cdac.checkAttendance();
		System.out.println("--------------------------------------------------------");
		
		
		Cdac cdac1=new Cdac();
		cdac1.collegeName="Cdac juhu";
		cdac1.studentName="Sakshi";
		cdac1.location="Mumbai";
		cdac1.studentId=2;
		cdac1.collegeId=12;
		cdac1.duration=6;
		cdac1.display();
		
		cdac1.candidatureInfo();
		cdac1.showResult();
		cdac1.showInTime();
		cdac1.showOutTime();
		cdac1.checkAttendance();
		
		System.out.println("---------------------------------------------------------");
		
		Cdac cdac3=new Cdac();
		cdac3.collegeName="Cdac Banglore";
		cdac3.studentName="Aishwarya";
		cdac3.location="Banglore";
		cdac3.studentId=3;
		cdac3.collegeId=123;
		cdac3.duration=6;
		cdac3.display();
		
		cdac3.candidatureInfo();
		cdac3.showResult();
		cdac3.showInTime();
		cdac3.showOutTime();
		cdac3.checkAttendance();

	}

}
