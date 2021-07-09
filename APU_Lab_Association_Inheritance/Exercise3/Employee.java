package APU_Lab_Association_Inheritance.Exercise3;

public class Employee {
  private String firstName;
  private String lastName;
  private char gender;
  private int dependents;
  private double annualSalary;
  static private int numEmployees = 0;
  Benefit benefit;

  // Constructor
  Employee(){
  }

  Employee(String fn, String ln, char gen, int dep, double as, Benefit benefit){
    numEmployees++;
    this.firstName = fn;
    this.lastName = ln;
    this.gender = gen;
    this.dependents = dep;
    this.annualSalary = as;
    this.benefit = new Benefit();
  }

  public double calculatePay(){
    
  }

  public void displayEmployees(){
    System.out.println(this.firstName + this.lastName);
  }

  public static int getNumEmployees(){
    return numEmployees;
  }

  // Getter & Setter
  public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getDependents() {
		return this.dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}

	public double getAnnualSalary() {
		return this.annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}

