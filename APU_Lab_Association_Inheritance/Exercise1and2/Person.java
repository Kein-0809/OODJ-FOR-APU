package APU_Lab_Association_Inheritance.Exercise1and2;

public class Person {
  String name;
  String phoneNumber;
  String emailAddress;
  Address address;

  // Constructor
  Person(String na, String Pho, String Em, Address ad) {
    this.name = na;
    this.phoneNumber = Pho;
    this.emailAddress = Em;
    this.address = ad;
  }

  public String getName() {
		return name;
	}
	public void setName(String na) {
		this.name = na;
	}

  public String getPhoneNo() {
    return phoneNumber;
  }
  public void setPhoneNo(String pho) {
    this.phoneNumber = pho;
  }

  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmail(String em) {
    this.emailAddress = em;
  }

  @Override
  public String toString() {
    return "name = " + name + "\nphone number = " + phoneNumber + "\nemail address = " + emailAddress + "\naddress = " + address;
  }
}
