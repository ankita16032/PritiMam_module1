package module1;

public class Student {

	private int rollNo;
	private String name;
	private double score;
	
	public void attendClass()
	{
		System.out.println("Attending the class: ");
	}
	public void apperExams()
	{
		System.out.println("Appearing for the exams: ");
	}
	public void completeAssignment()
	{
		System.out.println("Completing the assignment");
	}
	public void display()
	{
		System.out.println("Roll no is: "+rollNo);
		System.out.println("Student name is: "+name);
		System.out.println("Score is : "+score);
	}
	public static void main(String[] args) {
		System.out.println("Creating an object......");
		Student student1=new Student();
		student1.rollNo=1;
		student1.name="Ankita";
		student1.score=100;
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Calling member functions......");
		student1.display();
		student1.apperExams();
		student1.attendClass();
		student1.completeAssignment();
		System.out.println("****************************************************");
		
		
		System.out.println("Creating an object......");
		Student student2=new Student();
		student2.rollNo=2;
		student2.name="Ank";
		student2.score=90;
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Calling member functions......");
		student2.display();
		student2.apperExams();
		student2.attendClass();
		student2.completeAssignment();
		System.out.println("****************************************************");
		
		
		System.out.println("Creating an object......");
		Student student=new Student();
		student.rollNo=3;
		student.name="Anks";
		student.score=80;
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Calling member functions......");
		student.display();
		student.apperExams();
		student.attendClass();
		student.completeAssignment();
		System.out.println("****************************************************");
		
		
	}

}
