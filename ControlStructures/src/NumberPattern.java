import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(i);
        	}
        	System.out.println();
        }
	}

}
