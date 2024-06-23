
public class ArrayIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		try {
		System.out.println(array[3]);
		}//catch(ArrayIndexOutOfBoundsException aioobe) {
			//System.err.println(aioobe.getMessage());
	//	}
	finally {
			System.out.println("I'm a finally block");
		}

	}

}
