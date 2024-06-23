
public class Manager extends Employee {
	int teamsize;
	public Manager(int id, String name, String job, float salary,int teamsize) {
		super(id, name, job, salary);
		this.teamsize=teamsize;
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		this.showDetails();
		System.out.println(teamsize);
	}
	public void computeHra() {
		float hra=salary * 40/100;
		System.out.println("Hra of Employee"+hra);
	}


}
