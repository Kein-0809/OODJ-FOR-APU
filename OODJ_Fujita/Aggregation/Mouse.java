package OODJ_Fujita.Aggregation;

public class Mouse {
  private boolean status;
  Mouse()
  {
    status = false;
    switchButton();
  }
  public void switchButton()
  {
    if(status)
    {
      status = false;
      System.out.println("Mouse switch off");
    }
    else
    {
      status = true;
      System.out.println("Mouse switch on");
    }
  }
  public void check()
  {
    if(status)
    {
      System.out.println("Mouse status Success");
    }
    else
    {
      System.out.println("Mouse status Fail");
    }
  }
}
