import java.util.Scanner;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quotient,dividend,divisor;
		Scanner sc=new Scanner(System.in);
		dividend=sc.nextInt();
		divisor=sc.nextInt();
		try {
			quotient=dividend/divisor;
			System.out.println("Quotient= "+quotient);
		}catch(ArithmeticException arthexcp) {
			System.out.println(arthexcp);
			System.err.println(arthexcp.getMessage());
		}

	}

}
