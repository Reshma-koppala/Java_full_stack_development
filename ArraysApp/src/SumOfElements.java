
public class SumOfElements {
	public static void main(String[] args) {
		float sum=0;
		float prices[]= { 563.45f, 345.32f,765.09f,654.87f,456.9f,100.98f };//list of initialized array
		System.out.println(prices.length);//arrayname.lenth is called as instance constant
		for(int index=0;index<prices.length;sum+=prices[index],index++); {
			//sum=sum+prices[index];
		}
		System.out.println("Original array:");
		for(int index=0;index<prices.length;index++){
			System.out.println(prices[index]);
		}
		for(float price:prices) {
			System.out.println(price);
		}
		System.out.println("Sumof elements in array is: "+sum);//the maximum value of int data type is the size of the array
	
	}

}
//without a condition returns true the control will not go into loop body.
//with the while the condition should be true and in the for loop the condition is by default true i.e if we wont mention the condition in for loop by default it takes true.
