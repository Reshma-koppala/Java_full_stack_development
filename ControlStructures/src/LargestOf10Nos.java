import java.util.Scanner;
public class LargestOf10Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int num,large;
		num=scnr.nextInt();
		large=num;
		for(int i=1;i<9;i++) {
			num=scnr.nextInt();
			if(num>large) {
				large=num;
			}
		}
		System.out.println(large);

	}
	

}

