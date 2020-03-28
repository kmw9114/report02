
import java.util.Scanner;

public class kmw_leap_rep {
	public static void main(String[] args) {
	
		while(true) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("년도를 입력하시오 : ");
		int y = scn.nextInt();
		
		if(y <=0) {
			System.exit(0);
		}
		
		if(y % 4 ==0 && y % 100!=0 || y % 400 == 0) {
			System.out.println(y +"년은 윤년");
		}	
		
		else {
			System.out.println(y +"년은 평년");
			}
		}
	}
}
