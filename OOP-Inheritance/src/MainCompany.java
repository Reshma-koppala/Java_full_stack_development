
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(123,"kumar","Developer",30000.00f);
		Manager prasad=new Manager(134,"prasad","Tech Manager",50000.00f,25);
		System.out.println("Employee details:");
		e1.showDetails();
		System.out.println("Manager Details");
		prasad.getDetails();
		e1.computeHra();
		prasad.computeHra();

	}

}
