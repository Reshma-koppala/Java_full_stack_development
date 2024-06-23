import java.util.Scanner;
public class LargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[5];
		//for(float mark:marks) {
			//System.out.println(mark);
		//}
		for(int index=0;index<marks.length;index++) {
			System.out.println("Enter mark for index "+index);
			marks[index]=sc.nextFloat();
		}
		float maximum=marks[0];
		for(int index=0;index<marks.length;index++) {
			if(marks[index]>maximum) {
				maximum=marks[index];
			}
		}
		System.out.println("Largest element is :"+maximum);

	}

}
