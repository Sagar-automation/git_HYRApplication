package practiceEncapsulation;

public class Teacher {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student(101);
		
		st.ispresent =false;
		//st.rollnumber=102;
		
		st.setstudentattendence(false);
		boolean attendence = st.getstudentattendence();
		
		System.out.println(attendence);

	}

}
