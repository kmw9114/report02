package Report02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] a = {
				new Student(14069, "��ο�", "���а�", 3),
				new Student(12051, "��ſ�", "�����", 1),
				new Student(14069, "��̿�", "�����", 3),
				new Student(12051, "�����", "���а�", 2),
				new Student(14069, "�����", "�����", 2),
				new Student(12051, "����", "�����", 1),
				new Student(14069, "��޿�", "���а�", 1),
				new Student(12051, "��¿�", "�����", 2),
				new Student(14069, "�蹫��", "�����", 4),
				new Student(12051, "�蹿��", "�����", 4),
				new Student(14069, "����", "���а�", 2)
		};
		
		Arrays.sort(a);
		print(a, "ID");
		
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "�а�");	
		
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "�̸�");	
		
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "�г�");
	}
	
	public static void print(Student[] student, String sort) {
		System.out.println("[ " + sort + " ]����");
	       for(Student stu : student) {
	    	   System.out.println("ID: " + stu.getID() + " / " + 
	    			   			  "�а�: " + stu.getDept() + " / " + 
	    			   			  "�̸�: " + stu.getName() + " / " + 
	    			   			  "�г�: " + stu.getGrade());
	       }
	   }
}
