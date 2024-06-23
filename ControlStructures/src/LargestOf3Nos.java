import java.util.Scanner;
public class LargestOf3Nos {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter num1:");
		num1=scnr.nextInt();
		System.out.println("Enter num2:");
		num2=scnr.nextInt();
		System.out.println("Enter num3:");
		num3=scnr.nextInt();
		/*if (num1>num2 && num1>num3) {
			System.out.println(num1+" is large");
		}
			else if (num2>num1 && num2>num3) {
				System.out.println(num2+" is large");
			}
				else
					System.out.println(num3+" is large");
			*/
		// TODO Auto-generated method stub
		/*if (num1>num2 && num1>num3) {
			System.out.println(num1+" is large");
		}else {
			if(num2>num3) {
				System.out.println(num2+" is large");
			}
				else
					System.out.println(num3+" is large");
		}*/
		int large;
		large=num1;
		if (num2>large) {
			large=num2;
		}
		if (num3>large) {
			large=num3;
		}
		System.out.println(large);

	}

}
