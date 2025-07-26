package practiceEncapsulation;

public class Student {
	
	private int rollnumber;
	boolean ispresent;
	
	public Student(int rollnumber) 
	{
		this.rollnumber = rollnumber;
	}
	
	
	public void setstudentattendence(boolean ispresent) {
		this.ispresent = ispresent;
		System.out.println("Teacher set the attendence");
	}
	
	public boolean getstudentattendence() {
		System.out.println("Teacher access the attendence");
		return this.ispresent;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
