class Main {
    public static void main(String[] args)
    {
      char ch1 = ' ';
      System.out.println("Is A a space:" + Character.isSpace(ch1)); //noncompliant
    }
     
    public static void main(String[] args)
    {
      char ch1 = ' ';
      System.out.println("Is A a space:" + Character.isWhiteSpace(ch1)); //compliant
    }
  }