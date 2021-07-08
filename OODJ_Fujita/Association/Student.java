package OODJ_Fujita.Association;

public class Student {
  private Book book;
    public void buyBook(String title)
    {
        book = new Book(title);
    }
    public void printTitle()
    {
        System.out.println("「" + book.getTitle()+ "」を持っています");
    }
}
