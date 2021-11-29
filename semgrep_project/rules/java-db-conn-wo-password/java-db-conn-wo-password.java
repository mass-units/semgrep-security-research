class Main {
    void connect()
    {
      Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", ""); //noncompliant
    }
  
    void connect2()
    {
      String password = System.getProperty("database.password");
    Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", password); //compliant
    }
  }