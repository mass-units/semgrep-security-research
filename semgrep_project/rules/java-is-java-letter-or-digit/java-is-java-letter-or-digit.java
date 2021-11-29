class Main {
    public static void main(String[] args)
    {
      char ch1 = 'A';
      System.out.println("Is A a letter:" + Character.isJavaLetterOrDigit(ch1)); //noncompliant
    }
  
    public static void main2(String[] args)
    {
      char ch1 = 'A';
      System.out.println("Is A a letter:" + Character.isJavaIdentifierPart(ch1)); //compliant
    }
  }