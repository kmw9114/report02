
import java.util.Scanner;

public class kmw_leap_rep {
	public static void main(String[] args) {
	
		while(true) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ� : ");
		int y = scn.nextInt();
		
		if(y <=0) {
			System.exit(0);
		}
		
		if(y % 4 ==0 && y % 100!=0 || y % 400 == 0) {
			System.out.println(y +"���� ����");
		}	
		
		else {
			System.out.println(y +"���� ���");
			}
		}
	}
}
