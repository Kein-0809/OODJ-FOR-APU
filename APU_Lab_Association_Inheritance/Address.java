package APU_Lab_Association_Inheritance;

public class Address {
  String street;
  String city;
  String state;
  String postalCode;
  String country;

  Address(String st, String ci, String sta, String pc, String c) {
    this.street = st;
    this.city = ci;
    this.state = sta;
    this.postalCode = pc;
    this.country = c;
  }

  @Override
  public String toString() {
    return "street = " + street + "\ncity = " + city + "\nstate = " + state + "\npostal code = " + postalCode + "\ncountry = " + country;
  }


}
