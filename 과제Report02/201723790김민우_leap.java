package Report01;

import java.util.Scanner;

public class kmw_leap {

	
	public static void main(String[] args) {
	System.out.println("������ �Է��ϼ��� : ");
	Scanner scn = new Scanner(System.in);
	
	int y = scn.nextInt();
	if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
		System.out.println(y + " = ����");
	} else {
		System.out.println(y + " = ���");
	}
  }
}
