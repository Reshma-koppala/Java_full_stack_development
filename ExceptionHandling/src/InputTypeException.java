import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTypeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		try {
		System.out.println("Enter an int value");
		num=sc.nextInt();
		}catch(InputMismatchException imex) {
			System.out.println(imex);
			System.err.println(imex.getMessage());
		}

	}

}
