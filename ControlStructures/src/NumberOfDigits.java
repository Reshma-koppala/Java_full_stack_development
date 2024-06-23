import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
        int rem,count=0,num;
        num=scnr.nextInt();
        if(num==0)
        	count++;
        while(num!=0) {
        	rem=num%10;
        	count++;
        	num=num/10;
        }
        System.out.println(count);
	}

}
