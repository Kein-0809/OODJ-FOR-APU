package APU_Lab_Association_Inheritance;

public class Test {
  public static void main(String[] args) {
    Address address = new Address("Sanchome", "Shibuya", "Tokyo", "111-0098", "Japan");
    Person p1 = new Person("Takashi", "000000000", "xxxxxx0000@email", address);
    System.out.println(p1);
  }
}
