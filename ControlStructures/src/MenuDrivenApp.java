import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,result=0;
		int choice;
		num1=sc.nextInt();
		num2=sc.nextInt();
		do {
			System.out.println("Enter your choice:1.Add 2.Subtract 3.Multiply 4.Divide");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				result=num1+num2;
				break;
			case 2:
				result=num1-num2;
				break;
			case 3:
				result=num1*num2;
				break;
			case 4:
				result=num1/num2;
				break;
				
			}
			System.out.println("Result:"+result);
		}while(choice!=5);

	}

}
