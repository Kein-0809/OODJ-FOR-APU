package APU_Lab_Association_Inheritance.Exercise3;

public class Benefit {
  private String healthInsurance;
  private double lifeInsurance;
  private int vacation;

  // Constructor
  Benefit(){
  }

  Benefit(String hi, double li, int va){
    this.healthInsurance = hi;
    this.lifeInsurance = li;
    this.vacation = va;
  }

  public void displayBenefits() {
    System.out.println("Health insurance: " + healthInsurance);
    System.out.println("Life insurance: " + lifeInsurance);
    System.out.println("Vacation: " + vacation);
  }

  public String getHealthInsurance() {
		return this.healthInsurance;
	}

	public void setHealthInsurance(String healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public double getLifeInsurance() {
		return this.lifeInsurance;
	}

	public void setLifeInsurance(double lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}

	public int getVacation() {
		return this.vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}
}
