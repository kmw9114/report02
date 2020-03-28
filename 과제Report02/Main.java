package Report02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] a = {
				new Student(14069, "김민우", "수학과", 3),
				new Student(12051, "김매우", "국어과", 1),
				new Student(14069, "김미우", "영어과", 3),
				new Student(12051, "김뫄우", "수학과", 2),
				new Student(14069, "김미으", "국어과", 2),
				new Student(12051, "김며우", "영어과", 1),
				new Student(14069, "김믜우", "수학과", 1),
				new Student(12051, "김뮤우", "국어과", 2),
				new Student(14069, "김무우", "국어과", 4),
				new Student(12051, "김뮈우", "영어과", 4),
				new Student(14069, "김모우", "수학과", 2)
		};
		
		Arrays.sort(a);
		print(a, "ID");
		
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "학과");	
		
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "이름");	
		
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "학년");
	}
	
	public static void print(Student[] student, String sort) {
		System.out.println("[ " + sort + " ]정렬");
	       for(Student stu : student) {
	    	   System.out.println("ID: " + stu.getID() + " / " + 
	    			   			  "학과: " + stu.getDept() + " / " + 
	    			   			  "이름: " + stu.getName() + " / " + 
	    			   			  "학년: " + stu.getGrade());
	       }
	   }
}
