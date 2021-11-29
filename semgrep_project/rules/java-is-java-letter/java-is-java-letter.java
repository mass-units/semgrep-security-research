class Main {
    public static void main(String[] args)
    {
      char ch1 = 'A';
      System.out.println("Is A a letter:" + Character.isJavaLetter(ch1)); //noncompliant
    }
  
    public static void main2(String[] args)
    {
      char ch1 = 'A';
      System.out.println("Is A a letter:" + Character.isJavaIdentifierStart(ch1)); //compliant
    }
  }